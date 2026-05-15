// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TerminalClosedEventTest {

    @Test
    fun create() {
        val terminalClosedEvent =
            TerminalClosedEvent.builder().type(TerminalClosedEvent.Type.CLOSED).build()

        assertThat(terminalClosedEvent.type()).isEqualTo(TerminalClosedEvent.Type.CLOSED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val terminalClosedEvent =
            TerminalClosedEvent.builder().type(TerminalClosedEvent.Type.CLOSED).build()

        val roundtrippedTerminalClosedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalClosedEvent),
                jacksonTypeRef<TerminalClosedEvent>(),
            )

        assertThat(roundtrippedTerminalClosedEvent).isEqualTo(terminalClosedEvent)
    }
}
