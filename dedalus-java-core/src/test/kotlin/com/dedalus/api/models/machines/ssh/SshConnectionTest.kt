// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SshConnectionTest {

    @Test
    fun create() {
        val sshConnection =
            SshConnection.builder()
                .endpoint("endpoint")
                .port(0L)
                .sshUsername("ssh_username")
                .hostTrust(
                    SshHostTrust.builder()
                        .hostPattern("host_pattern")
                        .kind(SshHostTrust.Kind.CERT_AUTHORITY)
                        .publicKey("public_key")
                        .build()
                )
                .userCertificate("user_certificate")
                .build()

        assertThat(sshConnection.endpoint()).isEqualTo("endpoint")
        assertThat(sshConnection.port()).isEqualTo(0L)
        assertThat(sshConnection.sshUsername()).isEqualTo("ssh_username")
        assertThat(sshConnection.hostTrust())
            .contains(
                SshHostTrust.builder()
                    .hostPattern("host_pattern")
                    .kind(SshHostTrust.Kind.CERT_AUTHORITY)
                    .publicKey("public_key")
                    .build()
            )
        assertThat(sshConnection.userCertificate()).contains("user_certificate")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sshConnection =
            SshConnection.builder()
                .endpoint("endpoint")
                .port(0L)
                .sshUsername("ssh_username")
                .hostTrust(
                    SshHostTrust.builder()
                        .hostPattern("host_pattern")
                        .kind(SshHostTrust.Kind.CERT_AUTHORITY)
                        .publicKey("public_key")
                        .build()
                )
                .userCertificate("user_certificate")
                .build()

        val roundtrippedSshConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sshConnection),
                jacksonTypeRef<SshConnection>(),
            )

        assertThat(roundtrippedSshConnection).isEqualTo(sshConnection)
    }
}
