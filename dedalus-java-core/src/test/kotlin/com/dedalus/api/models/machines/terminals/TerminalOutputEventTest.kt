// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TerminalOutputEventTest {

    @Test
    fun create() {
        val terminalOutputEvent =
            TerminalOutputEvent.builder()
                .data("U3RhaW5sZXNzIHJvY2tz")
                .type(TerminalOutputEvent.Type.OUTPUT)
                .build()

        assertThat(terminalOutputEvent.data()).isEqualTo("U3RhaW5sZXNzIHJvY2tz")
        assertThat(terminalOutputEvent.type()).isEqualTo(TerminalOutputEvent.Type.OUTPUT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val terminalOutputEvent =
            TerminalOutputEvent.builder()
                .data("U3RhaW5sZXNzIHJvY2tz")
                .type(TerminalOutputEvent.Type.OUTPUT)
                .build()

        val roundtrippedTerminalOutputEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalOutputEvent),
                jacksonTypeRef<TerminalOutputEvent>(),
            )

        assertThat(roundtrippedTerminalOutputEvent).isEqualTo(terminalOutputEvent)
    }
}
