// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TerminalErrorEventTest {

    @Test
    fun create() {
        val terminalErrorEvent =
            TerminalErrorEvent.builder()
                .type(TerminalErrorEvent.Type.ERROR)
                .errorCode("error_code")
                .errorMessage("error_message")
                .build()

        assertThat(terminalErrorEvent.type()).isEqualTo(TerminalErrorEvent.Type.ERROR)
        assertThat(terminalErrorEvent.errorCode()).contains("error_code")
        assertThat(terminalErrorEvent.errorMessage()).contains("error_message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val terminalErrorEvent =
            TerminalErrorEvent.builder()
                .type(TerminalErrorEvent.Type.ERROR)
                .errorCode("error_code")
                .errorMessage("error_message")
                .build()

        val roundtrippedTerminalErrorEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalErrorEvent),
                jacksonTypeRef<TerminalErrorEvent>(),
            )

        assertThat(roundtrippedTerminalErrorEvent).isEqualTo(terminalErrorEvent)
    }
}
