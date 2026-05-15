// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking

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
import com.dedalus.api.core.http.parseable
import com.dedalus.api.core.prepare
import com.dedalus.api.models.usage.MachineComputeUsage
import com.dedalus.api.models.usage.MachineStorageUsage
import com.dedalus.api.models.usage.OrgUsage
import com.dedalus.api.models.usage.UsageMachineComputeParams
import com.dedalus.api.models.usage.UsageMachineStorageParams
import com.dedalus.api.models.usage.UsageRetrieveParams
import java.util.function.Consumer

class UsageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageService {

    private val withRawResponse: UsageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService =
        UsageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(params: UsageRetrieveParams, requestOptions: RequestOptions): OrgUsage =
        // get /v1/usage
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun machineCompute(
        params: UsageMachineComputeParams,
        requestOptions: RequestOptions,
    ): MachineComputeUsage =
        // get /v1/usage/machines/compute
        withRawResponse().machineCompute(params, requestOptions).parse()

    override fun machineStorage(
        params: UsageMachineStorageParams,
        requestOptions: RequestOptions,
    ): MachineStorageUsage =
        // get /v1/usage/machines/storage
        withRawResponse().machineStorage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageService.WithRawResponse =
            UsageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<OrgUsage> =
            jsonHandler<OrgUsage>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UsageRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgUsage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "usage")
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

        private val machineComputeHandler: Handler<MachineComputeUsage> =
            jsonHandler<MachineComputeUsage>(clientOptions.jsonMapper)

        override fun machineCompute(
            params: UsageMachineComputeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MachineComputeUsage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "usage", "machines", "compute")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { machineComputeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val machineStorageHandler: Handler<MachineStorageUsage> =
            jsonHandler<MachineStorageUsage>(clientOptions.jsonMapper)

        override fun machineStorage(
            params: UsageMachineStorageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MachineStorageUsage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "usage", "machines", "storage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { machineStorageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
