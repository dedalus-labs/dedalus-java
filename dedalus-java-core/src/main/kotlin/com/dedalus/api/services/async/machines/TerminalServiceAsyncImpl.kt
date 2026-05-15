// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async.machines

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
import com.dedalus.api.models.machines.terminals.Terminal
import com.dedalus.api.models.machines.terminals.TerminalCreateParams
import com.dedalus.api.models.machines.terminals.TerminalDeleteParams
import com.dedalus.api.models.machines.terminals.TerminalList
import com.dedalus.api.models.machines.terminals.TerminalListPageAsync
import com.dedalus.api.models.machines.terminals.TerminalListParams
import com.dedalus.api.models.machines.terminals.TerminalRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class TerminalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TerminalServiceAsync {

    private val withRawResponse: TerminalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TerminalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TerminalServiceAsync =
        TerminalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TerminalCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Terminal> =
        // post /v1/machines/{machine_id}/terminals
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TerminalRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Terminal> =
        // get /v1/machines/{machine_id}/terminals/{terminal_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TerminalListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TerminalListPageAsync> =
        // get /v1/machines/{machine_id}/terminals
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TerminalDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Terminal> =
        // delete /v1/machines/{machine_id}/terminals/{terminal_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TerminalServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TerminalServiceAsync.WithRawResponse =
            TerminalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Terminal> =
            jsonHandler<Terminal>(clientOptions.jsonMapper)

        override fun create(
            params: TerminalCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Terminal>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "terminals")
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

        private val retrieveHandler: Handler<Terminal> =
            jsonHandler<Terminal>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TerminalRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Terminal>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "machines",
                        params._pathParam(0),
                        "terminals",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<TerminalList> =
            jsonHandler<TerminalList>(clientOptions.jsonMapper)

        override fun list(
            params: TerminalListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TerminalListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "terminals")
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
                                TerminalListPageAsync.builder()
                                    .service(TerminalServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Terminal> =
            jsonHandler<Terminal>(clientOptions.jsonMapper)

        override fun delete(
            params: TerminalDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Terminal>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "machines",
                        params._pathParam(0),
                        "terminals",
                        params._pathParam(1),
                    )
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
    }
}
