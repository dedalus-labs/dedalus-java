// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.handlers.errorBodyHandler
import com.dedalus.api.core.handlers.errorHandler
import com.dedalus.api.core.handlers.jsonHandler
import com.dedalus.api.core.handlers.mapJson
import com.dedalus.api.core.handlers.sseHandler
import com.dedalus.api.core.http.HttpMethod
import com.dedalus.api.core.http.HttpRequest
import com.dedalus.api.core.http.HttpResponse
import com.dedalus.api.core.http.HttpResponse.Handler
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.core.http.StreamResponse
import com.dedalus.api.core.http.json
import com.dedalus.api.core.http.map
import com.dedalus.api.core.http.parseable
import com.dedalus.api.core.prepare
import com.dedalus.api.models.machines.Machine
import com.dedalus.api.models.machines.MachineCreateParams
import com.dedalus.api.models.machines.MachineDeleteParams
import com.dedalus.api.models.machines.MachineList
import com.dedalus.api.models.machines.MachineListPage
import com.dedalus.api.models.machines.MachineListParams
import com.dedalus.api.models.machines.MachineRetrieveParams
import com.dedalus.api.models.machines.MachineSleepParams
import com.dedalus.api.models.machines.MachineUpdateParams
import com.dedalus.api.models.machines.MachineWakeParams
import com.dedalus.api.models.machines.MachineWatchParams
import com.dedalus.api.services.blocking.machines.ArtifactService
import com.dedalus.api.services.blocking.machines.ArtifactServiceImpl
import com.dedalus.api.services.blocking.machines.ExecutionService
import com.dedalus.api.services.blocking.machines.ExecutionServiceImpl
import com.dedalus.api.services.blocking.machines.PreviewService
import com.dedalus.api.services.blocking.machines.PreviewServiceImpl
import com.dedalus.api.services.blocking.machines.SshService
import com.dedalus.api.services.blocking.machines.SshServiceImpl
import com.dedalus.api.services.blocking.machines.TerminalService
import com.dedalus.api.services.blocking.machines.TerminalServiceImpl
import java.util.function.Consumer

class MachineServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MachineService {

    private val withRawResponse: MachineService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val artifacts: ArtifactService by lazy { ArtifactServiceImpl(clientOptions) }

    private val previews: PreviewService by lazy { PreviewServiceImpl(clientOptions) }

    private val ssh: SshService by lazy { SshServiceImpl(clientOptions) }

    private val executions: ExecutionService by lazy { ExecutionServiceImpl(clientOptions) }

    private val terminals: TerminalService by lazy { TerminalServiceImpl(clientOptions) }

    override fun withRawResponse(): MachineService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MachineService =
        MachineServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun artifacts(): ArtifactService = artifacts

    override fun previews(): PreviewService = previews

    override fun ssh(): SshService = ssh

    override fun executions(): ExecutionService = executions

    override fun terminals(): TerminalService = terminals

    override fun create(params: MachineCreateParams, requestOptions: RequestOptions): Machine =
        // post /v1/machines
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: MachineRetrieveParams, requestOptions: RequestOptions): Machine =
        // get /v1/machines/{machine_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: MachineUpdateParams, requestOptions: RequestOptions): Machine =
        // patch /v1/machines/{machine_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: MachineListParams, requestOptions: RequestOptions): MachineListPage =
        // get /v1/machines
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: MachineDeleteParams, requestOptions: RequestOptions): Machine =
        // delete /v1/machines/{machine_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun sleep(params: MachineSleepParams, requestOptions: RequestOptions): Machine =
        // post /v1/machines/{machine_id}/sleep
        withRawResponse().sleep(params, requestOptions).parse()

    override fun wake(params: MachineWakeParams, requestOptions: RequestOptions): Machine =
        // post /v1/machines/{machine_id}/wake
        withRawResponse().wake(params, requestOptions).parse()

    override fun watchStreaming(
        params: MachineWatchParams,
        requestOptions: RequestOptions,
    ): StreamResponse<Machine> =
        // get /v1/machines/{machine_id}/status/stream
        withRawResponse().watchStreaming(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MachineService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val artifacts: ArtifactService.WithRawResponse by lazy {
            ArtifactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val previews: PreviewService.WithRawResponse by lazy {
            PreviewServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ssh: SshService.WithRawResponse by lazy {
            SshServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val executions: ExecutionService.WithRawResponse by lazy {
            ExecutionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val terminals: TerminalService.WithRawResponse by lazy {
            TerminalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MachineService.WithRawResponse =
            MachineServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun artifacts(): ArtifactService.WithRawResponse = artifacts

        override fun previews(): PreviewService.WithRawResponse = previews

        override fun ssh(): SshService.WithRawResponse = ssh

        override fun executions(): ExecutionService.WithRawResponse = executions

        override fun terminals(): TerminalService.WithRawResponse = terminals

        private val createHandler: Handler<Machine> = jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun create(
            params: MachineCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Machine> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Machine> =
            jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MachineRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Machine> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Machine> = jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun update(
            params: MachineUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Machine> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<MachineList> =
            jsonHandler<MachineList>(clientOptions.jsonMapper)

        override fun list(
            params: MachineListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MachineListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MachineListPage.builder()
                            .service(MachineServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Machine> = jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun delete(
            params: MachineDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Machine> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sleepHandler: Handler<Machine> = jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun sleep(
            params: MachineSleepParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Machine> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "sleep")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sleepHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val wakeHandler: Handler<Machine> = jsonHandler<Machine>(clientOptions.jsonMapper)

        override fun wake(
            params: MachineWakeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Machine> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "wake")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { wakeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val watchStreamingHandler: Handler<StreamResponse<Machine>> =
            sseHandler(clientOptions.jsonMapper).mapJson<Machine>()

        override fun watchStreaming(
            params: MachineWatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<Machine>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "status", "stream")
                    .putHeader("Accept", "text/event-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .let { watchStreamingHandler.handle(it) }
                    .let { streamResponse ->
                        if (requestOptions.responseValidation!!) {
                            streamResponse.map { it.validate() }
                        } else {
                            streamResponse
                        }
                    }
            }
        }
    }
}
