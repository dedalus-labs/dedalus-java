// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClient
import com.dedalus.api.models.usage.UsageMachineComputeParams
import com.dedalus.api.models.usage.UsageMachineStorageParams
import com.dedalus.api.models.usage.UsageRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceTest {

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.usage()

        val orgUsage =
            usageService.retrieve(UsageRetrieveParams.builder().periodStart("period_start").build())

        orgUsage.validate()
    }

    @Test
    fun machineCompute() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.usage()

        val machineComputeUsage =
            usageService.machineCompute(
                UsageMachineComputeParams.builder()
                    .granularity("granularity")
                    .machineId("machine_id")
                    .periodEnd("period_end")
                    .periodStart("period_start")
                    .build()
            )

        machineComputeUsage.validate()
    }

    @Test
    fun machineStorage() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.usage()

        val machineStorageUsage =
            usageService.machineStorage(
                UsageMachineStorageParams.builder()
                    .machineId("machine_id")
                    .periodEnd("period_end")
                    .periodStart("period_start")
                    .build()
            )

        machineStorageUsage.validate()
    }
}
