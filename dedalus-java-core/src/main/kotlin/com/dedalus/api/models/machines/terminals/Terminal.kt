// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.Enum
import com.dedalus.api.core.ExcludeMissing
import com.dedalus.api.core.JsonField
import com.dedalus.api.core.JsonMissing
import com.dedalus.api.core.JsonValue
import com.dedalus.api.core.checkRequired
import com.dedalus.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Terminal
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val height: JsonField<Long>,
    private val machineId: JsonField<String>,
    private val status: JsonField<Status>,
    private val terminalId: JsonField<String>,
    private val width: JsonField<Long>,
    private val errorCode: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val protocol: JsonField<Protocol>,
    private val readyAt: JsonField<OffsetDateTime>,
    private val retryAfterMs: JsonField<Long>,
    private val streamUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("machine_id") @ExcludeMissing machineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("terminal_id")
        @ExcludeMissing
        terminalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("error_code") @ExcludeMissing errorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("protocol") @ExcludeMissing protocol: JsonField<Protocol> = JsonMissing.of(),
        @JsonProperty("ready_at")
        @ExcludeMissing
        readyAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("retry_after_ms")
        @ExcludeMissing
        retryAfterMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stream_url") @ExcludeMissing streamUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        createdAt,
        height,
        machineId,
        status,
        terminalId,
        width,
        errorCode,
        errorMessage,
        expiresAt,
        protocol,
        readyAt,
        retryAfterMs,
        streamUrl,
        mutableMapOf(),
    )

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun height(): Long = height.getRequired("height")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun machineId(): String = machineId.getRequired("machine_id")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun terminalId(): String = terminalId.getRequired("terminal_id")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun width(): Long = width.getRequired("width")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun protocol(): Optional<Protocol> = protocol.getOptional("protocol")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readyAt(): Optional<OffsetDateTime> = readyAt.getOptional("ready_at")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retryAfterMs(): Optional<Long> = retryAfterMs.getOptional("retry_after_ms")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamUrl(): Optional<String> = streamUrl.getOptional("stream_url")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

    /**
     * Returns the raw JSON value of [machineId].
     *
     * Unlike [machineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("machine_id") @ExcludeMissing fun _machineId(): JsonField<String> = machineId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [terminalId].
     *
     * Unlike [terminalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("terminal_id") @ExcludeMissing fun _terminalId(): JsonField<String> = terminalId

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

    /**
     * Returns the raw JSON value of [errorCode].
     *
     * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [protocol].
     *
     * Unlike [protocol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("protocol") @ExcludeMissing fun _protocol(): JsonField<Protocol> = protocol

    /**
     * Returns the raw JSON value of [readyAt].
     *
     * Unlike [readyAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ready_at") @ExcludeMissing fun _readyAt(): JsonField<OffsetDateTime> = readyAt

    /**
     * Returns the raw JSON value of [retryAfterMs].
     *
     * Unlike [retryAfterMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retry_after_ms")
    @ExcludeMissing
    fun _retryAfterMs(): JsonField<Long> = retryAfterMs

    /**
     * Returns the raw JSON value of [streamUrl].
     *
     * Unlike [streamUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stream_url") @ExcludeMissing fun _streamUrl(): JsonField<String> = streamUrl

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Terminal].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .height()
         * .machineId()
         * .status()
         * .terminalId()
         * .width()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Terminal]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var height: JsonField<Long>? = null
        private var machineId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var terminalId: JsonField<String>? = null
        private var width: JsonField<Long>? = null
        private var errorCode: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var protocol: JsonField<Protocol> = JsonMissing.of()
        private var readyAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var retryAfterMs: JsonField<Long> = JsonMissing.of()
        private var streamUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(terminal: Terminal) = apply {
            createdAt = terminal.createdAt
            height = terminal.height
            machineId = terminal.machineId
            status = terminal.status
            terminalId = terminal.terminalId
            width = terminal.width
            errorCode = terminal.errorCode
            errorMessage = terminal.errorMessage
            expiresAt = terminal.expiresAt
            protocol = terminal.protocol
            readyAt = terminal.readyAt
            retryAfterMs = terminal.retryAfterMs
            streamUrl = terminal.streamUrl
            additionalProperties = terminal.additionalProperties.toMutableMap()
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun height(height: Long) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Long>) = apply { this.height = height }

        fun machineId(machineId: String) = machineId(JsonField.of(machineId))

        /**
         * Sets [Builder.machineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun machineId(machineId: JsonField<String>) = apply { this.machineId = machineId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun terminalId(terminalId: String) = terminalId(JsonField.of(terminalId))

        /**
         * Sets [Builder.terminalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.terminalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun terminalId(terminalId: JsonField<String>) = apply { this.terminalId = terminalId }

        fun width(width: Long) = width(JsonField.of(width))

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<Long>) = apply { this.width = width }

        fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

        /**
         * Sets [Builder.errorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        fun protocol(protocol: Protocol) = protocol(JsonField.of(protocol))

        /**
         * Sets [Builder.protocol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.protocol] with a well-typed [Protocol] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun protocol(protocol: JsonField<Protocol>) = apply { this.protocol = protocol }

        fun readyAt(readyAt: OffsetDateTime) = readyAt(JsonField.of(readyAt))

        /**
         * Sets [Builder.readyAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readyAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readyAt(readyAt: JsonField<OffsetDateTime>) = apply { this.readyAt = readyAt }

        fun retryAfterMs(retryAfterMs: Long) = retryAfterMs(JsonField.of(retryAfterMs))

        /**
         * Sets [Builder.retryAfterMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryAfterMs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retryAfterMs(retryAfterMs: JsonField<Long>) = apply { this.retryAfterMs = retryAfterMs }

        fun streamUrl(streamUrl: String) = streamUrl(JsonField.of(streamUrl))

        /**
         * Sets [Builder.streamUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun streamUrl(streamUrl: JsonField<String>) = apply { this.streamUrl = streamUrl }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Terminal].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .height()
         * .machineId()
         * .status()
         * .terminalId()
         * .width()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Terminal =
            Terminal(
                checkRequired("createdAt", createdAt),
                checkRequired("height", height),
                checkRequired("machineId", machineId),
                checkRequired("status", status),
                checkRequired("terminalId", terminalId),
                checkRequired("width", width),
                errorCode,
                errorMessage,
                expiresAt,
                protocol,
                readyAt,
                retryAfterMs,
                streamUrl,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): Terminal = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        height()
        machineId()
        status().validate()
        terminalId()
        width()
        errorCode()
        errorMessage()
        expiresAt()
        protocol().ifPresent { it.validate() }
        readyAt()
        retryAfterMs()
        streamUrl()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (height.asKnown().isPresent) 1 else 0) +
            (if (machineId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (terminalId.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0) +
            (if (errorCode.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (protocol.asKnown().getOrNull()?.validity() ?: 0) +
            (if (readyAt.asKnown().isPresent) 1 else 0) +
            (if (retryAfterMs.asKnown().isPresent) 1 else 0) +
            (if (streamUrl.asKnown().isPresent) 1 else 0)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val WAKE_IN_PROGRESS = of("wake_in_progress")

            @JvmField val READY = of("ready")

            @JvmField val CLOSED = of("closed")

            @JvmField val EXPIRED = of("expired")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            WAKE_IN_PROGRESS,
            READY,
            CLOSED,
            EXPIRED,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WAKE_IN_PROGRESS,
            READY,
            CLOSED,
            EXPIRED,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                WAKE_IN_PROGRESS -> Value.WAKE_IN_PROGRESS
                READY -> Value.READY
                CLOSED -> Value.CLOSED
                EXPIRED -> Value.EXPIRED
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                WAKE_IN_PROGRESS -> Known.WAKE_IN_PROGRESS
                READY -> Known.READY
                CLOSED -> Known.CLOSED
                EXPIRED -> Known.EXPIRED
                FAILED -> Known.FAILED
                else -> throw DedalusInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { DedalusInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Protocol @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val WEBSOCKET = of("websocket")

            @JvmStatic fun of(value: String) = Protocol(JsonField.of(value))
        }

        /** An enum containing [Protocol]'s known values. */
        enum class Known {
            WEBSOCKET
        }

        /**
         * An enum containing [Protocol]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Protocol] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WEBSOCKET,
            /** An enum member indicating that [Protocol] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                WEBSOCKET -> Value.WEBSOCKET
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DedalusInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                WEBSOCKET -> Known.WEBSOCKET
                else -> throw DedalusInvalidDataException("Unknown Protocol: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DedalusInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { DedalusInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DedalusInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Protocol = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Protocol && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Terminal &&
            createdAt == other.createdAt &&
            height == other.height &&
            machineId == other.machineId &&
            status == other.status &&
            terminalId == other.terminalId &&
            width == other.width &&
            errorCode == other.errorCode &&
            errorMessage == other.errorMessage &&
            expiresAt == other.expiresAt &&
            protocol == other.protocol &&
            readyAt == other.readyAt &&
            retryAfterMs == other.retryAfterMs &&
            streamUrl == other.streamUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            height,
            machineId,
            status,
            terminalId,
            width,
            errorCode,
            errorMessage,
            expiresAt,
            protocol,
            readyAt,
            retryAfterMs,
            streamUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Terminal{createdAt=$createdAt, height=$height, machineId=$machineId, status=$status, terminalId=$terminalId, width=$width, errorCode=$errorCode, errorMessage=$errorMessage, expiresAt=$expiresAt, protocol=$protocol, readyAt=$readyAt, retryAfterMs=$retryAfterMs, streamUrl=$streamUrl, additionalProperties=$additionalProperties}"
}
