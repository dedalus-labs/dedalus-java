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

@JsonDeserialize(using = TerminalClientEvent.Deserializer::class)
@JsonSerialize(using = TerminalClientEvent.Serializer::class)
class TerminalClientEvent
private constructor(
    private val input: TerminalInputEvent? = null,
    private val resize: TerminalResizeEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun input(): Optional<TerminalInputEvent> = Optional.ofNullable(input)

    fun resize(): Optional<TerminalResizeEvent> = Optional.ofNullable(resize)

    fun isInput(): Boolean = input != null

    fun isResize(): Boolean = resize != null

    fun asInput(): TerminalInputEvent = input.getOrThrow("input")

    fun asResize(): TerminalResizeEvent = resize.getOrThrow("resize")

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
     * Optional<String> result = terminalClientEvent.accept(new TerminalClientEvent.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitInput(TerminalInputEvent input) {
     *         return Optional.of(input.toString());
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
            input != null -> visitor.visitInput(input)
            resize != null -> visitor.visitResize(resize)
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
    fun validate(): TerminalClientEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitInput(input: TerminalInputEvent) {
                    input.validate()
                }

                override fun visitResize(resize: TerminalResizeEvent) {
                    resize.validate()
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
                override fun visitInput(input: TerminalInputEvent) = input.validity()

                override fun visitResize(resize: TerminalResizeEvent) = resize.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TerminalClientEvent && input == other.input && resize == other.resize
    }

    override fun hashCode(): Int = Objects.hash(input, resize)

    override fun toString(): String =
        when {
            input != null -> "TerminalClientEvent{input=$input}"
            resize != null -> "TerminalClientEvent{resize=$resize}"
            _json != null -> "TerminalClientEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TerminalClientEvent")
        }

    companion object {

        @JvmStatic fun ofInput(input: TerminalInputEvent) = TerminalClientEvent(input = input)

        @JvmStatic fun ofResize(resize: TerminalResizeEvent) = TerminalClientEvent(resize = resize)
    }

    /**
     * An interface that defines how to map each variant of [TerminalClientEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitInput(input: TerminalInputEvent): T

        fun visitResize(resize: TerminalResizeEvent): T

        /**
         * Maps an unknown variant of [TerminalClientEvent] to a value of type [T].
         *
         * An instance of [TerminalClientEvent] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws DedalusInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DedalusInvalidDataException("Unknown TerminalClientEvent: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TerminalClientEvent>(TerminalClientEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TerminalClientEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "input" -> {
                    return tryDeserialize(node, jacksonTypeRef<TerminalInputEvent>())?.let {
                        TerminalClientEvent(input = it, _json = json)
                    } ?: TerminalClientEvent(_json = json)
                }
                "resize" -> {
                    return tryDeserialize(node, jacksonTypeRef<TerminalResizeEvent>())?.let {
                        TerminalClientEvent(resize = it, _json = json)
                    } ?: TerminalClientEvent(_json = json)
                }
            }

            return TerminalClientEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<TerminalClientEvent>(TerminalClientEvent::class) {

        override fun serialize(
            value: TerminalClientEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.input != null -> generator.writeObject(value.input)
                value.resize != null -> generator.writeObject(value.resize)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TerminalClientEvent")
            }
        }
    }
}
