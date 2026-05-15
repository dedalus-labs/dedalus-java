// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SshSessionListTest {

    @Test
    fun create() {
        val sshSessionList =
            SshSessionList.builder()
                .addItem(
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
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(sshSessionList.items().getOrNull())
            .containsExactly(
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
            )
        assertThat(sshSessionList.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sshSessionList =
            SshSessionList.builder()
                .addItem(
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
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedSshSessionList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sshSessionList),
                jacksonTypeRef<SshSessionList>(),
            )

        assertThat(roundtrippedSshSessionList).isEqualTo(sshSessionList)
    }
}
