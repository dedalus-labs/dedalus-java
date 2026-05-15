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
import com.dedalus.api.models.machines.previews.Preview
import com.dedalus.api.models.machines.previews.PreviewCreateParams
import com.dedalus.api.models.machines.previews.PreviewDeleteParams
import com.dedalus.api.models.machines.previews.PreviewList
import com.dedalus.api.models.machines.previews.PreviewListPage
import com.dedalus.api.models.machines.previews.PreviewListParams
import com.dedalus.api.models.machines.previews.PreviewRetrieveParams
import java.util.function.Consumer

class PreviewServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PreviewService {

    private val withRawResponse: PreviewService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PreviewService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewService =
        PreviewServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: PreviewCreateParams, requestOptions: RequestOptions): Preview =
        // post /v1/machines/{machine_id}/previews
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: PreviewRetrieveParams, requestOptions: RequestOptions): Preview =
        // get /v1/machines/{machine_id}/previews/{preview_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: PreviewListParams, requestOptions: RequestOptions): PreviewListPage =
        // get /v1/machines/{machine_id}/previews
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PreviewDeleteParams, requestOptions: RequestOptions): Preview =
        // delete /v1/machines/{machine_id}/previews/{preview_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreviewService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreviewService.WithRawResponse =
            PreviewServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Preview> = jsonHandler<Preview>(clientOptions.jsonMapper)

        override fun create(
            params: PreviewCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Preview> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "previews")
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

        private val retrieveHandler: Handler<Preview> =
            jsonHandler<Preview>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PreviewRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Preview> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "machines",
                        params._pathParam(0),
                        "previews",
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

        private val listHandler: Handler<PreviewList> =
            jsonHandler<PreviewList>(clientOptions.jsonMapper)

        override fun list(
            params: PreviewListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreviewListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "previews")
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
                        PreviewListPage.builder()
                            .service(PreviewServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Preview> = jsonHandler<Preview>(clientOptions.jsonMapper)

        override fun delete(
            params: PreviewDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Preview> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "machines",
                        params._pathParam(0),
                        "previews",
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
