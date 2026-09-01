// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SshCreateParamsTest {

    @Test
    fun create() {
        SshCreateParams.builder()
            .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
            .sshSessionCreateParams(
                SshSessionCreateParams.builder().publicKey("public_key").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SshCreateParams.builder()
                .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                .sshSessionCreateParams(
                    SshSessionCreateParams.builder().publicKey("public_key").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SshCreateParams.builder()
                .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                .sshSessionCreateParams(
                    SshSessionCreateParams.builder().publicKey("public_key").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(SshSessionCreateParams.builder().publicKey("public_key").build())
    }
}
