// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async.machines

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClientAsync
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
internal class ExecutionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionServiceAsync = client.machines().executions()

        val executionFuture =
            executionServiceAsync.create(
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

        val execution = executionFuture.get()
        execution.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionServiceAsync = client.machines().executions()

        val executionFuture =
            executionServiceAsync.retrieve(
                ExecutionRetrieveParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .executionId("execution_id")
                    .build()
            )

        val execution = executionFuture.get()
        execution.validate()
    }

    @Test
    fun list() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionServiceAsync = client.machines().executions()

        val pageFuture =
            executionServiceAsync.list(
                ExecutionListParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionServiceAsync = client.machines().executions()

        val executionFuture =
            executionServiceAsync.delete(
                ExecutionDeleteParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .executionId("execution_id")
                    .build()
            )

        val execution = executionFuture.get()
        execution.validate()
    }

    @Test
    fun events() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionServiceAsync = client.machines().executions()

        val pageFuture =
            executionServiceAsync.events(
                ExecutionEventsParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .executionId("execution_id")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun output() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executionServiceAsync = client.machines().executions()

        val executionOutputFuture =
            executionServiceAsync.output(
                ExecutionOutputParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .executionId("execution_id")
                    .build()
            )

        val executionOutput = executionOutputFuture.get()
        executionOutput.validate()
    }
}
