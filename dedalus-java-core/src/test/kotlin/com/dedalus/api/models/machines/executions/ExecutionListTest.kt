// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionListTest {

    @Test
    fun create() {
        val executionList =
            ExecutionList.builder()
                .addItem(
                    Execution.builder()
                        .addCommand("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .executionId("execution_id")
                        .machineId("machine_id")
                        .status(Execution.Status.WAKE_IN_PROGRESS)
                        .addArtifact(
                            ArtifactRef.builder().artifactId("artifact_id").name("name").build()
                        )
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
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(executionList.items().getOrNull())
            .containsExactly(
                Execution.builder()
                    .addCommand("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .executionId("execution_id")
                    .machineId("machine_id")
                    .status(Execution.Status.WAKE_IN_PROGRESS)
                    .addArtifact(
                        ArtifactRef.builder().artifactId("artifact_id").name("name").build()
                    )
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
            )
        assertThat(executionList.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val executionList =
            ExecutionList.builder()
                .addItem(
                    Execution.builder()
                        .addCommand("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .executionId("execution_id")
                        .machineId("machine_id")
                        .status(Execution.Status.WAKE_IN_PROGRESS)
                        .addArtifact(
                            ArtifactRef.builder().artifactId("artifact_id").name("name").build()
                        )
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
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedExecutionList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(executionList),
                jacksonTypeRef<ExecutionList>(),
            )

        assertThat(roundtrippedExecutionList).isEqualTo(executionList)
    }
}
