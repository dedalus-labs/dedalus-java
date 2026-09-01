// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.client

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.getPackageVersion
import com.dedalus.api.services.async.MachineServiceAsync
import com.dedalus.api.services.async.MachineServiceAsyncImpl
import java.util.function.Consumer

class DedalusClientAsyncImpl(private val clientOptions: ClientOptions) : DedalusClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: DedalusClient by lazy { DedalusClientImpl(clientOptions) }

    private val withRawResponse: DedalusClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val machines: MachineServiceAsync by lazy {
        MachineServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): DedalusClient = sync

    override fun withRawResponse(): DedalusClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DedalusClientAsync =
        DedalusClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun machines(): MachineServiceAsync = machines

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DedalusClientAsync.WithRawResponse {

        private val machines: MachineServiceAsync.WithRawResponse by lazy {
            MachineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DedalusClientAsync.WithRawResponse =
            DedalusClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun machines(): MachineServiceAsync.WithRawResponse = machines
    }
}
