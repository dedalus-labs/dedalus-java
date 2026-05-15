// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TerminalCreateParamsTest {

    @Test
    fun create() {
        TerminalCreateParams.builder()
            .machineId("dm-3")
            .terminalCreateParams(
                TerminalCreateParams.builder()
                    .height(0L)
                    .width(0L)
                    .cwd("cwd")
                    .env(
                        TerminalCreateParams.Env.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .shell("shell")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TerminalCreateParams.builder()
                .machineId("dm-3")
                .terminalCreateParams(TerminalCreateParams.builder().height(0L).width(0L).build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TerminalCreateParams.builder()
                .machineId("dm-3")
                .terminalCreateParams(
                    TerminalCreateParams.builder()
                        .height(0L)
                        .width(0L)
                        .cwd("cwd")
                        .env(
                            TerminalCreateParams.Env.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .shell("shell")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TerminalCreateParams.builder()
                    .height(0L)
                    .width(0L)
                    .cwd("cwd")
                    .env(
                        TerminalCreateParams.Env.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .shell("shell")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TerminalCreateParams.builder()
                .machineId("dm-3")
                .terminalCreateParams(TerminalCreateParams.builder().height(0L).width(0L).build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(TerminalCreateParams.builder().height(0L).width(0L).build())
    }
}
