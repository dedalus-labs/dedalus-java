// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionEventsTest {

    @Test
    fun create() {
        val executionEvents =
            ExecutionEvents.builder()
                .addItem(
                    ExecutionEvent.builder()
                        .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sequence(0L)
                        .type(ExecutionEvent.Type.LIFECYCLE)
                        .chunk("chunk")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .exitCode(0L)
                        .signal(0L)
                        .status(ExecutionEvent.Status.WAKE_IN_PROGRESS)
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(executionEvents.items().getOrNull())
            .containsExactly(
                ExecutionEvent.builder()
                    .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sequence(0L)
                    .type(ExecutionEvent.Type.LIFECYCLE)
                    .chunk("chunk")
                    .errorCode("error_code")
                    .errorMessage("error_message")
                    .exitCode(0L)
                    .signal(0L)
                    .status(ExecutionEvent.Status.WAKE_IN_PROGRESS)
                    .build()
            )
        assertThat(executionEvents.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val executionEvents =
            ExecutionEvents.builder()
                .addItem(
                    ExecutionEvent.builder()
                        .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sequence(0L)
                        .type(ExecutionEvent.Type.LIFECYCLE)
                        .chunk("chunk")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .exitCode(0L)
                        .signal(0L)
                        .status(ExecutionEvent.Status.WAKE_IN_PROGRESS)
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedExecutionEvents =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(executionEvents),
                jacksonTypeRef<ExecutionEvents>(),
            )

        assertThat(roundtrippedExecutionEvents).isEqualTo(executionEvents)
    }
}
