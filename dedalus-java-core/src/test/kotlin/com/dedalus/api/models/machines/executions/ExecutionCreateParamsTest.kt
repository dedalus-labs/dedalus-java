// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionCreateParamsTest {

    @Test
    fun create() {
        ExecutionCreateParams.builder()
            .machineId("dm-3")
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
    }

    @Test
    fun pathParams() {
        val params =
            ExecutionCreateParams.builder()
                .machineId("dm-3")
                .executionCreateParams(ExecutionCreateParams.builder().addCommand("string").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExecutionCreateParams.builder()
                .machineId("dm-3")
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExecutionCreateParams.builder()
                .machineId("dm-3")
                .executionCreateParams(ExecutionCreateParams.builder().addCommand("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ExecutionCreateParams.builder().addCommand("string").build())
    }
}
