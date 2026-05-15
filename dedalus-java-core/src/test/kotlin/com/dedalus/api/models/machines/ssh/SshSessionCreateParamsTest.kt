// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SshSessionCreateParamsTest {

    @Test
    fun create() {
        val sshSessionCreateParams =
            SshSessionCreateParams.builder().publicKey("public_key").build()

        assertThat(sshSessionCreateParams.publicKey()).isEqualTo("public_key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sshSessionCreateParams =
            SshSessionCreateParams.builder().publicKey("public_key").build()

        val roundtrippedSshSessionCreateParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sshSessionCreateParams),
                jacksonTypeRef<SshSessionCreateParams>(),
            )

        assertThat(roundtrippedSshSessionCreateParams).isEqualTo(sshSessionCreateParams)
    }
}
