// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClientAsync
import com.dedalus.api.models.usage.UsageMachineComputeParams
import com.dedalus.api.models.usage.UsageMachineStorageParams
import com.dedalus.api.models.usage.UsageRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageServiceAsync = client.usage()

        val orgUsageFuture =
            usageServiceAsync.retrieve(
                UsageRetrieveParams.builder().periodStart("period_start").build()
            )

        val orgUsage = orgUsageFuture.get()
        orgUsage.validate()
    }

    @Test
    fun machineCompute() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageServiceAsync = client.usage()

        val machineComputeUsageFuture =
            usageServiceAsync.machineCompute(
                UsageMachineComputeParams.builder()
                    .granularity("granularity")
                    .machineId("machine_id")
                    .periodEnd("period_end")
                    .periodStart("period_start")
                    .build()
            )

        val machineComputeUsage = machineComputeUsageFuture.get()
        machineComputeUsage.validate()
    }

    @Test
    fun machineStorage() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageServiceAsync = client.usage()

        val machineStorageUsageFuture =
            usageServiceAsync.machineStorage(
                UsageMachineStorageParams.builder()
                    .machineId("machine_id")
                    .periodEnd("period_end")
                    .periodStart("period_start")
                    .build()
            )

        val machineStorageUsage = machineStorageUsageFuture.get()
        machineStorageUsage.validate()
    }
}
