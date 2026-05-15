// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.BaseDeserializer
import com.dedalus.api.core.BaseSerializer
import com.dedalus.api.core.JsonValue
import com.dedalus.api.core.getOrThrow
import com.dedalus.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = TerminalServerEvent.Deserializer::class)
@JsonSerialize(using = TerminalServerEvent.Serializer::class)
class TerminalServerEvent
private constructor(
    private val output: TerminalOutputEvent? = null,
    private val error: TerminalErrorEvent? = null,
    private val closed: TerminalClosedEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun output(): Optional<TerminalOutputEvent> = Optional.ofNullable(output)

    fun error(): Optional<TerminalErrorEvent> = Optional.ofNullable(error)

    fun closed(): Optional<TerminalClosedEvent> = Optional.ofNullable(closed)

    fun isOutput(): Boolean = output != null

    fun isError(): Boolean = error != null

    fun isClosed(): Boolean = closed != null

    fun asOutput(): TerminalOutputEvent = output.getOrThrow("output")

    fun asError(): TerminalErrorEvent = error.getOrThrow("error")

    fun asClosed(): TerminalClosedEvent = closed.getOrThrow("closed")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.dedalus.api.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = terminalServerEvent.accept(new TerminalServerEvent.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitOutput(TerminalOutputEvent output) {
     *         return Optional.of(output.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws DedalusInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            output != null -> visitor.visitOutput(output)
            error != null -> visitor.visitError(error)
            closed != null -> visitor.visitClosed(closed)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DedalusInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TerminalServerEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitOutput(output: TerminalOutputEvent) {
                    output.validate()
                }

                override fun visitError(error: TerminalErrorEvent) {
                    error.validate()
                }

                override fun visitClosed(closed: TerminalClosedEvent) {
                    closed.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: DedalusInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitOutput(output: TerminalOutputEvent) = output.validity()

                override fun visitError(error: TerminalErrorEvent) = error.validity()

                override fun visitClosed(closed: TerminalClosedEvent) = closed.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TerminalServerEvent &&
            output == other.output &&
            error == other.error &&
            closed == other.closed
    }

    override fun hashCode(): Int = Objects.hash(output, error, closed)

    override fun toString(): String =
        when {
            output != null -> "TerminalServerEvent{output=$output}"
            error != null -> "TerminalServerEvent{error=$error}"
            closed != null -> "TerminalServerEvent{closed=$closed}"
            _json != null -> "TerminalServerEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TerminalServerEvent")
        }

    companion object {

        @JvmStatic fun ofOutput(output: TerminalOutputEvent) = TerminalServerEvent(output = output)

        @JvmStatic fun ofError(error: TerminalErrorEvent) = TerminalServerEvent(error = error)

        @JvmStatic fun ofClosed(closed: TerminalClosedEvent) = TerminalServerEvent(closed = closed)
    }

    /**
     * An interface that defines how to map each variant of [TerminalServerEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitOutput(output: TerminalOutputEvent): T

        fun visitError(error: TerminalErrorEvent): T

        fun visitClosed(closed: TerminalClosedEvent): T

        /**
         * Maps an unknown variant of [TerminalServerEvent] to a value of type [T].
         *
         * An instance of [TerminalServerEvent] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws DedalusInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DedalusInvalidDataException("Unknown TerminalServerEvent: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TerminalServerEvent>(TerminalServerEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TerminalServerEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "output" -> {
                    return tryDeserialize(node, jacksonTypeRef<TerminalOutputEvent>())?.let {
                        TerminalServerEvent(output = it, _json = json)
                    } ?: TerminalServerEvent(_json = json)
                }
                "error" -> {
                    return tryDeserialize(node, jacksonTypeRef<TerminalErrorEvent>())?.let {
                        TerminalServerEvent(error = it, _json = json)
                    } ?: TerminalServerEvent(_json = json)
                }
                "closed" -> {
                    return tryDeserialize(node, jacksonTypeRef<TerminalClosedEvent>())?.let {
                        TerminalServerEvent(closed = it, _json = json)
                    } ?: TerminalServerEvent(_json = json)
                }
            }

            return TerminalServerEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<TerminalServerEvent>(TerminalServerEvent::class) {

        override fun serialize(
            value: TerminalServerEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.output != null -> generator.writeObject(value.output)
                value.error != null -> generator.writeObject(value.error)
                value.closed != null -> generator.writeObject(value.closed)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TerminalServerEvent")
            }
        }
    }
}
