// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionTest {

    @Test
    fun create() {
        val execution =
            Execution.builder()
                .addCommand("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .executionId("execution_id")
                .machineId("machine_id")
                .status(Execution.Status.WAKE_IN_PROGRESS)
                .addArtifact(ArtifactRef.builder().artifactId("artifact_id").name("name").build())
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cwd("cwd")
                .addEnvKey("string")
                .errorCode("error_code")
                .errorMessage("error_message")
                .exitCode(0L)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .retryAfterMs(0L)
                .signal(0L)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .stderrBytes(0L)
                .stderrTruncated(true)
                .stdoutBytes(0L)
                .stdoutTruncated(true)
                .build()

        assertThat(execution.command().getOrNull()).containsExactly("string")
        assertThat(execution.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(execution.executionId()).isEqualTo("execution_id")
        assertThat(execution.machineId()).isEqualTo("machine_id")
        assertThat(execution.status()).isEqualTo(Execution.Status.WAKE_IN_PROGRESS)
        assertThat(execution.artifacts().getOrNull())
            .containsExactly(ArtifactRef.builder().artifactId("artifact_id").name("name").build())
        assertThat(execution.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(execution.cwd()).contains("cwd")
        assertThat(execution.envKeys().getOrNull()).containsExactly("string")
        assertThat(execution.errorCode()).contains("error_code")
        assertThat(execution.errorMessage()).contains("error_message")
        assertThat(execution.exitCode()).contains(0L)
        assertThat(execution.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(execution.retryAfterMs()).contains(0L)
        assertThat(execution.signal()).contains(0L)
        assertThat(execution.startedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(execution.stderrBytes()).contains(0L)
        assertThat(execution.stderrTruncated()).contains(true)
        assertThat(execution.stdoutBytes()).contains(0L)
        assertThat(execution.stdoutTruncated()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val execution =
            Execution.builder()
                .addCommand("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .executionId("execution_id")
                .machineId("machine_id")
                .status(Execution.Status.WAKE_IN_PROGRESS)
                .addArtifact(ArtifactRef.builder().artifactId("artifact_id").name("name").build())
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cwd("cwd")
                .addEnvKey("string")
                .errorCode("error_code")
                .errorMessage("error_message")
                .exitCode(0L)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .retryAfterMs(0L)
                .signal(0L)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .stderrBytes(0L)
                .stderrTruncated(true)
                .stdoutBytes(0L)
                .stdoutTruncated(true)
                .build()

        val roundtrippedExecution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(execution),
                jacksonTypeRef<Execution>(),
            )

        assertThat(roundtrippedExecution).isEqualTo(execution)
    }
}
