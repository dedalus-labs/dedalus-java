// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.previews

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

class Preview
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val machineId: JsonField<String>,
    private val port: JsonField<Long>,
    private val previewId: JsonField<String>,
    private val status: JsonField<Status>,
    private val visibility: JsonField<Visibility>,
    private val errorCode: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val protocol: JsonField<Protocol>,
    private val readyAt: JsonField<OffsetDateTime>,
    private val retryAfterMs: JsonField<Long>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("machine_id") @ExcludeMissing machineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("port") @ExcludeMissing port: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("preview_id") @ExcludeMissing previewId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("visibility")
        @ExcludeMissing
        visibility: JsonField<Visibility> = JsonMissing.of(),
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
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        createdAt,
        machineId,
        port,
        previewId,
        status,
        visibility,
        errorCode,
        errorMessage,
        expiresAt,
        protocol,
        readyAt,
        retryAfterMs,
        url,
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
    fun machineId(): String = machineId.getRequired("machine_id")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun port(): Long = port.getRequired("port")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun previewId(): String = previewId.getRequired("preview_id")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun visibility(): Visibility = visibility.getRequired("visibility")

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
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [machineId].
     *
     * Unlike [machineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("machine_id") @ExcludeMissing fun _machineId(): JsonField<String> = machineId

    /**
     * Returns the raw JSON value of [port].
     *
     * Unlike [port], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("port") @ExcludeMissing fun _port(): JsonField<Long> = port

    /**
     * Returns the raw JSON value of [previewId].
     *
     * Unlike [previewId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preview_id") @ExcludeMissing fun _previewId(): JsonField<String> = previewId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [visibility].
     *
     * Unlike [visibility], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("visibility")
    @ExcludeMissing
    fun _visibility(): JsonField<Visibility> = visibility

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
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of [Preview].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .machineId()
         * .port()
         * .previewId()
         * .status()
         * .visibility()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Preview]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var machineId: JsonField<String>? = null
        private var port: JsonField<Long>? = null
        private var previewId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var visibility: JsonField<Visibility>? = null
        private var errorCode: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var protocol: JsonField<Protocol> = JsonMissing.of()
        private var readyAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var retryAfterMs: JsonField<Long> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preview: Preview) = apply {
            createdAt = preview.createdAt
            machineId = preview.machineId
            port = preview.port
            previewId = preview.previewId
            status = preview.status
            visibility = preview.visibility
            errorCode = preview.errorCode
            errorMessage = preview.errorMessage
            expiresAt = preview.expiresAt
            protocol = preview.protocol
            readyAt = preview.readyAt
            retryAfterMs = preview.retryAfterMs
            url = preview.url
            additionalProperties = preview.additionalProperties.toMutableMap()
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

        fun machineId(machineId: String) = machineId(JsonField.of(machineId))

        /**
         * Sets [Builder.machineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun machineId(machineId: JsonField<String>) = apply { this.machineId = machineId }

        fun port(port: Long) = port(JsonField.of(port))

        /**
         * Sets [Builder.port] to an arbitrary JSON value.
         *
         * You should usually call [Builder.port] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun port(port: JsonField<Long>) = apply { this.port = port }

        fun previewId(previewId: String) = previewId(JsonField.of(previewId))

        /**
         * Sets [Builder.previewId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previewId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun previewId(previewId: JsonField<String>) = apply { this.previewId = previewId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun visibility(visibility: Visibility) = visibility(JsonField.of(visibility))

        /**
         * Sets [Builder.visibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visibility] with a well-typed [Visibility] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun visibility(visibility: JsonField<Visibility>) = apply { this.visibility = visibility }

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

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [Preview].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .machineId()
         * .port()
         * .previewId()
         * .status()
         * .visibility()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Preview =
            Preview(
                checkRequired("createdAt", createdAt),
                checkRequired("machineId", machineId),
                checkRequired("port", port),
                checkRequired("previewId", previewId),
                checkRequired("status", status),
                checkRequired("visibility", visibility),
                errorCode,
                errorMessage,
                expiresAt,
                protocol,
                readyAt,
                retryAfterMs,
                url,
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
    fun validate(): Preview = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        machineId()
        port()
        previewId()
        status().validate()
        visibility().validate()
        errorCode()
        errorMessage()
        expiresAt()
        protocol().ifPresent { it.validate() }
        readyAt()
        retryAfterMs()
        url()
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
            (if (machineId.asKnown().isPresent) 1 else 0) +
            (if (port.asKnown().isPresent) 1 else 0) +
            (if (previewId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (visibility.asKnown().getOrNull()?.validity() ?: 0) +
            (if (errorCode.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (protocol.asKnown().getOrNull()?.validity() ?: 0) +
            (if (readyAt.asKnown().isPresent) 1 else 0) +
            (if (retryAfterMs.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

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

    class Visibility @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PUBLIC = of("public")

            @JvmField val PRIVATE = of("private")

            @JvmField val ORG = of("org")

            @JvmStatic fun of(value: String) = Visibility(JsonField.of(value))
        }

        /** An enum containing [Visibility]'s known values. */
        enum class Known {
            PUBLIC,
            PRIVATE,
            ORG,
        }

        /**
         * An enum containing [Visibility]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Visibility] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PUBLIC,
            PRIVATE,
            ORG,
            /**
             * An enum member indicating that [Visibility] was instantiated with an unknown value.
             */
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
                PUBLIC -> Value.PUBLIC
                PRIVATE -> Value.PRIVATE
                ORG -> Value.ORG
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
                PUBLIC -> Known.PUBLIC
                PRIVATE -> Known.PRIVATE
                ORG -> Known.ORG
                else -> throw DedalusInvalidDataException("Unknown Visibility: $value")
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
        fun validate(): Visibility = apply {
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

            return other is Visibility && value == other.value
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

            @JvmField val HTTP = of("http")

            @JvmField val HTTPS = of("https")

            @JvmStatic fun of(value: String) = Protocol(JsonField.of(value))
        }

        /** An enum containing [Protocol]'s known values. */
        enum class Known {
            HTTP,
            HTTPS,
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
            HTTP,
            HTTPS,
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
                HTTP -> Value.HTTP
                HTTPS -> Value.HTTPS
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
                HTTP -> Known.HTTP
                HTTPS -> Known.HTTPS
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

        return other is Preview &&
            createdAt == other.createdAt &&
            machineId == other.machineId &&
            port == other.port &&
            previewId == other.previewId &&
            status == other.status &&
            visibility == other.visibility &&
            errorCode == other.errorCode &&
            errorMessage == other.errorMessage &&
            expiresAt == other.expiresAt &&
            protocol == other.protocol &&
            readyAt == other.readyAt &&
            retryAfterMs == other.retryAfterMs &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            machineId,
            port,
            previewId,
            status,
            visibility,
            errorCode,
            errorMessage,
            expiresAt,
            protocol,
            readyAt,
            retryAfterMs,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Preview{createdAt=$createdAt, machineId=$machineId, port=$port, previewId=$previewId, status=$status, visibility=$visibility, errorCode=$errorCode, errorMessage=$errorMessage, expiresAt=$expiresAt, protocol=$protocol, readyAt=$readyAt, retryAfterMs=$retryAfterMs, url=$url, additionalProperties=$additionalProperties}"
}
