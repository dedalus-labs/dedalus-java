// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SshHostTrustTest {

    @Test
    fun create() {
        val sshHostTrust =
            SshHostTrust.builder()
                .hostPattern("host_pattern")
                .kind(SshHostTrust.Kind.CERT_AUTHORITY)
                .publicKey("public_key")
                .build()

        assertThat(sshHostTrust.hostPattern()).isEqualTo("host_pattern")
        assertThat(sshHostTrust.kind()).isEqualTo(SshHostTrust.Kind.CERT_AUTHORITY)
        assertThat(sshHostTrust.publicKey()).isEqualTo("public_key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sshHostTrust =
            SshHostTrust.builder()
                .hostPattern("host_pattern")
                .kind(SshHostTrust.Kind.CERT_AUTHORITY)
                .publicKey("public_key")
                .build()

        val roundtrippedSshHostTrust =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sshHostTrust),
                jacksonTypeRef<SshHostTrust>(),
            )

        assertThat(roundtrippedSshHostTrust).isEqualTo(sshHostTrust)
    }
}
