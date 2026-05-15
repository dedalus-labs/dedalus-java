// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TerminalListTest {

    @Test
    fun create() {
        val terminalList =
            TerminalList.builder()
                .addItem(
                    Terminal.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .height(0L)
                        .machineId("machine_id")
                        .status(Terminal.Status.WAKE_IN_PROGRESS)
                        .terminalId("terminal_id")
                        .width(0L)
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .protocol(Terminal.Protocol.WEBSOCKET)
                        .readyAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .retryAfterMs(0L)
                        .streamUrl("stream_url")
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(terminalList.items().getOrNull())
            .containsExactly(
                Terminal.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .height(0L)
                    .machineId("machine_id")
                    .status(Terminal.Status.WAKE_IN_PROGRESS)
                    .terminalId("terminal_id")
                    .width(0L)
                    .errorCode("error_code")
                    .errorMessage("error_message")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .protocol(Terminal.Protocol.WEBSOCKET)
                    .readyAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .retryAfterMs(0L)
                    .streamUrl("stream_url")
                    .build()
            )
        assertThat(terminalList.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val terminalList =
            TerminalList.builder()
                .addItem(
                    Terminal.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .height(0L)
                        .machineId("machine_id")
                        .status(Terminal.Status.WAKE_IN_PROGRESS)
                        .terminalId("terminal_id")
                        .width(0L)
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .protocol(Terminal.Protocol.WEBSOCKET)
                        .readyAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .retryAfterMs(0L)
                        .streamUrl("stream_url")
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedTerminalList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalList),
                jacksonTypeRef<TerminalList>(),
            )

        assertThat(roundtrippedTerminalList).isEqualTo(terminalList)
    }
}
