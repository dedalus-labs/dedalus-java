// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionOutputTest {

    @Test
    fun create() {
        val executionOutput =
            ExecutionOutput.builder()
                .executionId("execution_id")
                .stderr("stderr")
                .stderrBytes(0L)
                .stderrTruncated(true)
                .stdout("stdout")
                .stdoutBytes(0L)
                .stdoutTruncated(true)
                .build()

        assertThat(executionOutput.executionId()).isEqualTo("execution_id")
        assertThat(executionOutput.stderr()).contains("stderr")
        assertThat(executionOutput.stderrBytes()).contains(0L)
        assertThat(executionOutput.stderrTruncated()).contains(true)
        assertThat(executionOutput.stdout()).contains("stdout")
        assertThat(executionOutput.stdoutBytes()).contains(0L)
        assertThat(executionOutput.stdoutTruncated()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val executionOutput =
            ExecutionOutput.builder()
                .executionId("execution_id")
                .stderr("stderr")
                .stderrBytes(0L)
                .stderrTruncated(true)
                .stdout("stdout")
                .stdoutBytes(0L)
                .stdoutTruncated(true)
                .build()

        val roundtrippedExecutionOutput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(executionOutput),
                jacksonTypeRef<ExecutionOutput>(),
            )

        assertThat(roundtrippedExecutionOutput).isEqualTo(executionOutput)
    }
}
