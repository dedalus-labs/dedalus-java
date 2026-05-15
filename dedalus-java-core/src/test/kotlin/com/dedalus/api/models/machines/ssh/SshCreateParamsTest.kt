// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SshCreateParamsTest {

    @Test
    fun create() {
        SshCreateParams.builder()
            .machineId("dm-3")
            .sshSessionCreateParams(
                SshSessionCreateParams.builder().publicKey("public_key").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SshCreateParams.builder()
                .machineId("dm-3")
                .sshSessionCreateParams(
                    SshSessionCreateParams.builder().publicKey("public_key").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SshCreateParams.builder()
                .machineId("dm-3")
                .sshSessionCreateParams(
                    SshSessionCreateParams.builder().publicKey("public_key").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(SshSessionCreateParams.builder().publicKey("public_key").build())
    }
}
