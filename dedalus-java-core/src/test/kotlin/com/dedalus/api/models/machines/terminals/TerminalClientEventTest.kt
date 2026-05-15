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

internal class TerminalClientEventTest {

    @Test
    fun ofInput() {
        val input =
            TerminalInputEvent.builder()
                .data("U3RhaW5sZXNzIHJvY2tz")
                .type(TerminalInputEvent.Type.INPUT)
                .build()

        val terminalClientEvent = TerminalClientEvent.ofInput(input)

        assertThat(terminalClientEvent.input()).contains(input)
        assertThat(terminalClientEvent.resize()).isEmpty
    }

    @Test
    fun ofInputRoundtrip() {
        val jsonMapper = jsonMapper()
        val terminalClientEvent =
            TerminalClientEvent.ofInput(
                TerminalInputEvent.builder()
                    .data("U3RhaW5sZXNzIHJvY2tz")
                    .type(TerminalInputEvent.Type.INPUT)
                    .build()
            )

        val roundtrippedTerminalClientEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalClientEvent),
                jacksonTypeRef<TerminalClientEvent>(),
            )

        assertThat(roundtrippedTerminalClientEvent).isEqualTo(terminalClientEvent)
    }

    @Test
    fun ofResize() {
        val resize =
            TerminalResizeEvent.builder()
                .height(0L)
                .type(TerminalResizeEvent.Type.RESIZE)
                .width(0L)
                .build()

        val terminalClientEvent = TerminalClientEvent.ofResize(resize)

        assertThat(terminalClientEvent.input()).isEmpty
        assertThat(terminalClientEvent.resize()).contains(resize)
    }

    @Test
    fun ofResizeRoundtrip() {
        val jsonMapper = jsonMapper()
        val terminalClientEvent =
            TerminalClientEvent.ofResize(
                TerminalResizeEvent.builder()
                    .height(0L)
                    .type(TerminalResizeEvent.Type.RESIZE)
                    .width(0L)
                    .build()
            )

        val roundtrippedTerminalClientEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(terminalClientEvent),
                jacksonTypeRef<TerminalClientEvent>(),
            )

        assertThat(roundtrippedTerminalClientEvent).isEqualTo(terminalClientEvent)
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
        val terminalClientEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TerminalClientEvent>())

        val e = assertThrows<DedalusInvalidDataException> { terminalClientEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
