// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SshSessionTest {

    @Test
    fun create() {
        val sshSession =
            SshSession.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .machineId("machine_id")
                .sessionId("session_id")
                .status(SshSession.Status.WAKE_IN_PROGRESS)
                .connection(
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
                )
                .errorCode("error_code")
                .errorMessage("error_message")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .readyAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .retryAfterMs(0L)
                .build()

        assertThat(sshSession.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sshSession.machineId()).isEqualTo("machine_id")
        assertThat(sshSession.sessionId()).isEqualTo("session_id")
        assertThat(sshSession.status()).isEqualTo(SshSession.Status.WAKE_IN_PROGRESS)
        assertThat(sshSession.connection())
            .contains(
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
            )
        assertThat(sshSession.errorCode()).contains("error_code")
        assertThat(sshSession.errorMessage()).contains("error_message")
        assertThat(sshSession.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sshSession.readyAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sshSession.retryAfterMs()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sshSession =
            SshSession.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .machineId("machine_id")
                .sessionId("session_id")
                .status(SshSession.Status.WAKE_IN_PROGRESS)
                .connection(
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
                )
                .errorCode("error_code")
                .errorMessage("error_message")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .readyAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .retryAfterMs(0L)
                .build()

        val roundtrippedSshSession =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sshSession),
                jacksonTypeRef<SshSession>(),
            )

        assertThat(roundtrippedSshSession).isEqualTo(sshSession)
    }
}
