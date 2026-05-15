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
import com.dedalus.api.models.machines.artifacts.Artifact
import com.dedalus.api.models.machines.artifacts.ArtifactDeleteParams
import com.dedalus.api.models.machines.artifacts.ArtifactList
import com.dedalus.api.models.machines.artifacts.ArtifactListPage
import com.dedalus.api.models.machines.artifacts.ArtifactListParams
import com.dedalus.api.models.machines.artifacts.ArtifactRetrieveParams
import java.util.function.Consumer

class ArtifactServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ArtifactService {

    private val withRawResponse: ArtifactService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ArtifactService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtifactService =
        ArtifactServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ArtifactRetrieveParams,
        requestOptions: RequestOptions,
    ): Artifact =
        // get /v1/machines/{machine_id}/artifacts/{artifact_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ArtifactListParams,
        requestOptions: RequestOptions,
    ): ArtifactListPage =
        // get /v1/machines/{machine_id}/artifacts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ArtifactDeleteParams, requestOptions: RequestOptions): Artifact =
        // delete /v1/machines/{machine_id}/artifacts/{artifact_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ArtifactService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ArtifactService.WithRawResponse =
            ArtifactServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<Artifact> =
            jsonHandler<Artifact>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ArtifactRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Artifact> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "machines",
                        params._pathParam(0),
                        "artifacts",
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

        private val listHandler: Handler<ArtifactList> =
            jsonHandler<ArtifactList>(clientOptions.jsonMapper)

        override fun list(
            params: ArtifactListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtifactListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "machines", params._pathParam(0), "artifacts")
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
                        ArtifactListPage.builder()
                            .service(ArtifactServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Artifact> =
            jsonHandler<Artifact>(clientOptions.jsonMapper)

        override fun delete(
            params: ArtifactDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Artifact> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "machines",
                        params._pathParam(0),
                        "artifacts",
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
