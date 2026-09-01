// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.client

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.getPackageVersion
import com.dedalus.api.services.blocking.MachineService
import com.dedalus.api.services.blocking.MachineServiceImpl
import java.util.function.Consumer

class DedalusClientImpl(private val clientOptions: ClientOptions) : DedalusClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: DedalusClientAsync by lazy { DedalusClientAsyncImpl(clientOptions) }

    private val withRawResponse: DedalusClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val machines: MachineService by lazy { MachineServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): DedalusClientAsync = async

    override fun withRawResponse(): DedalusClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DedalusClient =
        DedalusClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun machines(): MachineService = machines

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DedalusClient.WithRawResponse {

        private val machines: MachineService.WithRawResponse by lazy {
            MachineServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DedalusClient.WithRawResponse =
            DedalusClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun machines(): MachineService.WithRawResponse = machines
    }
}
