// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking.machines

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClient
import com.dedalus.api.core.JsonValue
import com.dedalus.api.models.machines.executions.ExecutionCreateParams
import com.dedalus.api.models.machines.executions.ExecutionDeleteParams
import com.dedalus.api.models.machines.executions.ExecutionEventsParams
import com.dedalus.api.models.machines.executions.ExecutionListParams
import com.dedalus.api.models.machines.executions.ExecutionOutputParams
import com.dedalus.api.models.machines.executions.ExecutionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExecutionServiceTest {

    @Test
    fun create() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionService = client.machines().executions()

        val execution =
            executionService.create(
                ExecutionCreateParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .executionCreateParams(
                        ExecutionCreateParams.builder()
                            .addCommand("string")
                            .cwd("cwd")
                            .env(
                                ExecutionCreateParams.Env.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .stdin("stdin")
                            .timeoutMs(0L)
                            .build()
                    )
                    .build()
            )

        execution.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionService = client.machines().executions()

        val execution =
            executionService.retrieve(
                ExecutionRetrieveParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .executionId("execution_id")
                    .build()
            )

        execution.validate()
    }

    @Test
    fun list() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionService = client.machines().executions()

        val page =
            executionService.list(
                ExecutionListParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionService = client.machines().executions()

        val execution =
            executionService.delete(
                ExecutionDeleteParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .executionId("execution_id")
                    .build()
            )

        execution.validate()
    }

    @Test
    fun events() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionService = client.machines().executions()

        val page =
            executionService.events(
                ExecutionEventsParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .executionId("execution_id")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun output() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionService = client.machines().executions()

        val executionOutput =
            executionService.output(
                ExecutionOutputParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .executionId("execution_id")
                    .build()
            )

        executionOutput.validate()
    }
}
