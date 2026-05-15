// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TerminalTest {

    @Test
    fun create() {
        val terminal =
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

        assertThat(terminal.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(terminal.height()).isEqualTo(0L)
        assertThat(terminal.machineId()).isEqualTo("machine_id")
        assertThat(terminal.status()).isEqualTo(Terminal.Status.WAKE_IN_PROGRESS)
        assertThat(terminal.terminalId()).isEqualTo("terminal_id")
        assertThat(terminal.width()).isEqualTo(0L)
        assertThat(terminal.errorCode()).contains("error_code")
        assertThat(terminal.errorMessage()).contains("error_message")
        assertThat(terminal.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(terminal.protocol()).contains(Terminal.Protocol.WEBSOCKET)
        assertThat(terminal.readyAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(terminal.retryAfterMs()).contains(0L)
        assertThat(terminal.streamUrl()).contains("stream_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val terminal =
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

        val roundtrippedTerminal =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminal),
                jacksonTypeRef<Terminal>(),
            )

        assertThat(roundtrippedTerminal).isEqualTo(terminal)
    }
}
