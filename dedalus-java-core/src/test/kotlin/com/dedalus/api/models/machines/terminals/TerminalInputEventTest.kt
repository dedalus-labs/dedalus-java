// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TerminalInputEventTest {

    @Test
    fun create() {
        val terminalInputEvent =
            TerminalInputEvent.builder()
                .data("U3RhaW5sZXNzIHJvY2tz")
                .type(TerminalInputEvent.Type.INPUT)
                .build()

        assertThat(terminalInputEvent.data()).isEqualTo("U3RhaW5sZXNzIHJvY2tz")
        assertThat(terminalInputEvent.type()).isEqualTo(TerminalInputEvent.Type.INPUT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val terminalInputEvent =
            TerminalInputEvent.builder()
                .data("U3RhaW5sZXNzIHJvY2tz")
                .type(TerminalInputEvent.Type.INPUT)
                .build()

        val roundtrippedTerminalInputEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalInputEvent),
                jacksonTypeRef<TerminalInputEvent>(),
            )

        assertThat(roundtrippedTerminalInputEvent).isEqualTo(terminalInputEvent)
    }
}
