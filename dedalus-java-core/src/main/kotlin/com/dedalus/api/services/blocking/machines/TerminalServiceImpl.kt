// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking.machines

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
import com.dedalus.api.core.prepare
import com.dedalus.api.models.machines.terminals.Terminal
import com.dedalus.api.models.machines.terminals.TerminalCreateParams
import com.dedalus.api.models.machines.terminals.TerminalDeleteParams
import com.dedalus.api.models.machines.terminals.TerminalList
import com.dedalus.api.models.machines.terminals.TerminalListPage
import com.dedalus.api.models.machines.terminals.TerminalListParams
import com.dedalus.api.models.machines.terminals.TerminalRetrieveParams
import java.util.function.Consumer

class TerminalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TerminalService {

    private val withRawResponse: TerminalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TerminalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TerminalService =
        TerminalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: TerminalCreateParams, requestOptions: RequestOptions): Terminal =
        // post /v1/machines/{machine_id}/terminals
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: TerminalRetrieveParams,
        requestOptions: RequestOptions,
    ): Terminal =
        // get /v1/machines/{machine_id}/terminals/{terminal_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TerminalListParams,
        requestOptions: RequestOptions,
    ): TerminalListPage =
        // get /v1/machines/{machine_id}/terminals
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TerminalDeleteParams, requestOptions: RequestOptions): Terminal =
        // delete /v1/machines/{machine_id}/terminals/{terminal_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TerminalService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TerminalService.WithRawResponse =
            TerminalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Terminal> =
            jsonHandler<Terminal>(clientOptions.jsonMapper)

        override fun create(
            params: TerminalCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Terminal> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "terminals")
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

        private val retrieveHandler: Handler<Terminal> =
            jsonHandler<Terminal>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TerminalRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Terminal> {
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

        private val listHandler: Handler<TerminalList> =
            jsonHandler<TerminalList>(clientOptions.jsonMapper)

        override fun list(
            params: TerminalListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TerminalListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "terminals")
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
                        TerminalListPage.builder()
                            .service(TerminalServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Terminal> =
            jsonHandler<Terminal>(clientOptions.jsonMapper)

        override fun delete(
            params: TerminalDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Terminal> {
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
    }
}
