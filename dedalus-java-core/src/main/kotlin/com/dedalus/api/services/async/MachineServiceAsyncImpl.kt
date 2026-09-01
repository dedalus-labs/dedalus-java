// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.handlers.errorBodyHandler
import com.dedalus.api.core.handlers.errorHandler
import com.dedalus.api.core.handlers.jsonHandler
import com.dedalus.api.core.http.HttpMethod
import com.dedalus.api.core.http.HttpRequest
import com.dedalus.api.core.http.HttpResponse
import com.dedalus.api.core.http.HttpResponse.Handler
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.core.http.json
import com.dedalus.api.core.http.parseable
import com.dedalus.api.core.prepareAsync
import com.dedalus.api.models.machines.Machine
import com.dedalus.api.models.machines.MachineCreateParams
import com.dedalus.api.models.machines.MachineDeleteParams
import com.dedalus.api.models.machines.MachineList
import com.dedalus.api.models.machines.MachineListPageAsync
import com.dedalus.api.models.machines.MachineListParams
import com.dedalus.api.models.machines.MachineRetrieveParams
import com.dedalus.api.models.machines.MachineRetrieveResponse
import com.dedalus.api.models.machines.MachineSleepParams
import com.dedalus.api.models.machines.MachineUpdateParams
import com.dedalus.api.models.machines.MachineWakeParams
import com.dedalus.api.services.async.machines.ExecutionServiceAsync
import com.dedalus.api.services.async.machines.ExecutionServiceAsyncImpl
import com.dedalus.api.services.async.machines.SshServiceAsync
import com.dedalus.api.services.async.machines.SshServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MachineServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MachineServiceAsync {

    private val withRawResponse: MachineServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ssh: SshServiceAsync by lazy { SshServiceAsyncImpl(clientOptions) }

    private val executions: ExecutionServiceAsync by lazy {
        ExecutionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MachineServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MachineServiceAsync =
        MachineServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun ssh(): SshServiceAsync = ssh

    override fun executions(): ExecutionServiceAsync = executions

    override fun create(
        params: MachineCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Machine> =
        // post /v1/machines
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MachineRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MachineRetrieveResponse> =
        // get /v1/machines/{machine_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MachineUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Machine> =
        // patch /v1/machines/{machine_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MachineListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MachineListPageAsync> =
        // get /v1/machines
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MachineDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Machine> =
        // delete /v1/machines/{machine_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun sleep(
        params: MachineSleepParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Machine> =
        // post /v1/machines/{machine_id}/sleep
        withRawResponse().sleep(params, requestOptions).thenApply { it.parse() }

    override fun wake(
        params: MachineWakeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Machine> =
        // post /v1/machines/{machine_id}/wake
        withRawResponse().wake(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MachineServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val ssh: SshServiceAsync.WithRawResponse by lazy {
            SshServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val executions: ExecutionServiceAsync.WithRawResponse by lazy {
            ExecutionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MachineServiceAsync.WithRawResponse =
            MachineServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun ssh(): SshServiceAsync.WithRawResponse = ssh

        override fun executions(): ExecutionServiceAsync.WithRawResponse = executions

        private val createHandler: Handler<Machine> = jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun create(
            params: MachineCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Machine>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<MachineRetrieveResponse> =
            jsonHandler<MachineRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MachineRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MachineRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Machine> = jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun update(
            params: MachineUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Machine>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<MachineList> =
            jsonHandler<MachineList>(clientOptions.jsonMapper)

        override fun list(
            params: MachineListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MachineListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MachineListPageAsync.builder()
                                    .service(MachineServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Machine> = jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun delete(
            params: MachineDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Machine>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sleepHandler: Handler<Machine> = jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun sleep(
            params: MachineSleepParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Machine>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "sleep")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sleepHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val wakeHandler: Handler<Machine> = jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun wake(
            params: MachineWakeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Machine>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "wake")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { wakeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
