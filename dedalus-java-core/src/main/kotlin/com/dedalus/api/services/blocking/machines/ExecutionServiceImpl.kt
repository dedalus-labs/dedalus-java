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
import com.dedalus.api.models.machines.executions.Execution
import com.dedalus.api.models.machines.executions.ExecutionCreateParams
import com.dedalus.api.models.machines.executions.ExecutionDeleteParams
import com.dedalus.api.models.machines.executions.ExecutionEvents
import com.dedalus.api.models.machines.executions.ExecutionEventsPage
import com.dedalus.api.models.machines.executions.ExecutionEventsParams
import com.dedalus.api.models.machines.executions.ExecutionList
import com.dedalus.api.models.machines.executions.ExecutionListPage
import com.dedalus.api.models.machines.executions.ExecutionListParams
import com.dedalus.api.models.machines.executions.ExecutionOutput
import com.dedalus.api.models.machines.executions.ExecutionOutputParams
import com.dedalus.api.models.machines.executions.ExecutionRetrieveParams
import java.util.function.Consumer

class ExecutionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExecutionService {

    private val withRawResponse: ExecutionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExecutionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExecutionService =
        ExecutionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ExecutionCreateParams, requestOptions: RequestOptions): Execution =
        // post /v1/machines/{machine_id}/executions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ExecutionRetrieveParams,
        requestOptions: RequestOptions,
    ): Execution =
        // get /v1/machines/{machine_id}/executions/{execution_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ExecutionListParams,
        requestOptions: RequestOptions,
    ): ExecutionListPage =
        // get /v1/machines/{machine_id}/executions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ExecutionDeleteParams, requestOptions: RequestOptions): Execution =
        // delete /v1/machines/{machine_id}/executions/{execution_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun events(
        params: ExecutionEventsParams,
        requestOptions: RequestOptions,
    ): ExecutionEventsPage =
        // get /v1/machines/{machine_id}/executions/{execution_id}/events
        withRawResponse().events(params, requestOptions).parse()

    override fun output(
        params: ExecutionOutputParams,
        requestOptions: RequestOptions,
    ): ExecutionOutput =
        // get /v1/machines/{machine_id}/executions/{execution_id}/output
        withRawResponse().output(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExecutionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExecutionService.WithRawResponse =
            ExecutionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Execution> =
            jsonHandler<Execution>(clientOptions.jsonMapper)

        override fun create(
            params: ExecutionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Execution> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "executions")
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

        private val retrieveHandler: Handler<Execution> =
            jsonHandler<Execution>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExecutionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Execution> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "machines",
                        params._pathParam(0),
                        "executions",
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

        private val listHandler: Handler<ExecutionList> =
            jsonHandler<ExecutionList>(clientOptions.jsonMapper)

        override fun list(
            params: ExecutionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExecutionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "executions")
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
                        ExecutionListPage.builder()
                            .service(ExecutionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Execution> =
            jsonHandler<Execution>(clientOptions.jsonMapper)

        override fun delete(
            params: ExecutionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Execution> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "machines",
                        params._pathParam(0),
                        "executions",
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

        private val eventsHandler: Handler<ExecutionEvents> =
            jsonHandler<ExecutionEvents>(clientOptions.jsonMapper)

        override fun events(
            params: ExecutionEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExecutionEventsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "machines",
                        params._pathParam(0),
                        "executions",
                        params._pathParam(1),
                        "events",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { eventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ExecutionEventsPage.builder()
                            .service(ExecutionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val outputHandler: Handler<ExecutionOutput> =
            jsonHandler<ExecutionOutput>(clientOptions.jsonMapper)

        override fun output(
            params: ExecutionOutputParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExecutionOutput> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "machines",
                        params._pathParam(0),
                        "executions",
                        params._pathParam(1),
                        "output",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { outputHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
