// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TerminalResizeEventTest {

    @Test
    fun create() {
        val terminalResizeEvent =
            TerminalResizeEvent.builder()
                .height(0L)
                .type(TerminalResizeEvent.Type.RESIZE)
                .width(0L)
                .build()

        assertThat(terminalResizeEvent.height()).isEqualTo(0L)
        assertThat(terminalResizeEvent.type()).isEqualTo(TerminalResizeEvent.Type.RESIZE)
        assertThat(terminalResizeEvent.width()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val terminalResizeEvent =
            TerminalResizeEvent.builder()
                .height(0L)
                .type(TerminalResizeEvent.Type.RESIZE)
                .width(0L)
                .build()

        val roundtrippedTerminalResizeEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalResizeEvent),
                jacksonTypeRef<TerminalResizeEvent>(),
            )

        assertThat(roundtrippedTerminalResizeEvent).isEqualTo(terminalResizeEvent)
    }
}
