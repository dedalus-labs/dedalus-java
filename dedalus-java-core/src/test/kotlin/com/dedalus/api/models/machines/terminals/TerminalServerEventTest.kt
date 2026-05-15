// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.JsonValue
import com.dedalus.api.core.jsonMapper
import com.dedalus.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TerminalServerEventTest {

    @Test
    fun ofOutput() {
        val output =
            TerminalOutputEvent.builder()
                .data("U3RhaW5sZXNzIHJvY2tz")
                .type(TerminalOutputEvent.Type.OUTPUT)
                .build()

        val terminalServerEvent = TerminalServerEvent.ofOutput(output)

        assertThat(terminalServerEvent.output()).contains(output)
        assertThat(terminalServerEvent.error()).isEmpty
        assertThat(terminalServerEvent.closed()).isEmpty
    }

    @Test
    fun ofOutputRoundtrip() {
        val jsonMapper = jsonMapper()
        val terminalServerEvent =
            TerminalServerEvent.ofOutput(
                TerminalOutputEvent.builder()
                    .data("U3RhaW5sZXNzIHJvY2tz")
                    .type(TerminalOutputEvent.Type.OUTPUT)
                    .build()
            )

        val roundtrippedTerminalServerEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalServerEvent),
                jacksonTypeRef<TerminalServerEvent>(),
            )

        assertThat(roundtrippedTerminalServerEvent).isEqualTo(terminalServerEvent)
    }

    @Test
    fun ofError() {
        val error =
            TerminalErrorEvent.builder()
                .type(TerminalErrorEvent.Type.ERROR)
                .errorCode("error_code")
                .errorMessage("error_message")
                .build()

        val terminalServerEvent = TerminalServerEvent.ofError(error)

        assertThat(terminalServerEvent.output()).isEmpty
        assertThat(terminalServerEvent.error()).contains(error)
        assertThat(terminalServerEvent.closed()).isEmpty
    }

    @Test
    fun ofErrorRoundtrip() {
        val jsonMapper = jsonMapper()
        val terminalServerEvent =
            TerminalServerEvent.ofError(
                TerminalErrorEvent.builder()
                    .type(TerminalErrorEvent.Type.ERROR)
                    .errorCode("error_code")
                    .errorMessage("error_message")
                    .build()
            )

        val roundtrippedTerminalServerEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalServerEvent),
                jacksonTypeRef<TerminalServerEvent>(),
            )

        assertThat(roundtrippedTerminalServerEvent).isEqualTo(terminalServerEvent)
    }

    @Test
    fun ofClosed() {
        val closed = TerminalClosedEvent.builder().type(TerminalClosedEvent.Type.CLOSED).build()

        val terminalServerEvent = TerminalServerEvent.ofClosed(closed)

        assertThat(terminalServerEvent.output()).isEmpty
        assertThat(terminalServerEvent.error()).isEmpty
        assertThat(terminalServerEvent.closed()).contains(closed)
    }

    @Test
    fun ofClosedRoundtrip() {
        val jsonMapper = jsonMapper()
        val terminalServerEvent =
            TerminalServerEvent.ofClosed(
                TerminalClosedEvent.builder().type(TerminalClosedEvent.Type.CLOSED).build()
            )

        val roundtrippedTerminalServerEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalServerEvent),
                jacksonTypeRef<TerminalServerEvent>(),
            )

        assertThat(roundtrippedTerminalServerEvent).isEqualTo(terminalServerEvent)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val terminalServerEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TerminalServerEvent>())

        val e = assertThrows<DedalusInvalidDataException> { terminalServerEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
