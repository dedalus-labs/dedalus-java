// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class SshHostTrust
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hostPattern: JsonField<String>,
    private val kind: JsonField<Kind>,
    private val publicKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("host_pattern")
        @ExcludeMissing
        hostPattern: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kind") @ExcludeMissing kind: JsonField<Kind> = JsonMissing.of(),
        @JsonProperty("public_key") @ExcludeMissing publicKey: JsonField<String> = JsonMissing.of(),
    ) : this(hostPattern, kind, publicKey, mutableMapOf())

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hostPattern(): String = hostPattern.getRequired("host_pattern")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kind(): Kind = kind.getRequired("kind")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publicKey(): String = publicKey.getRequired("public_key")

    /**
     * Returns the raw JSON value of [hostPattern].
     *
     * Unlike [hostPattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("host_pattern")
    @ExcludeMissing
    fun _hostPattern(): JsonField<String> = hostPattern

    /**
     * Returns the raw JSON value of [kind].
     *
     * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

    /**
     * Returns the raw JSON value of [publicKey].
     *
     * Unlike [publicKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("public_key") @ExcludeMissing fun _publicKey(): JsonField<String> = publicKey

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
         * Returns a mutable builder for constructing an instance of [SshHostTrust].
         *
         * The following fields are required:
         * ```java
         * .hostPattern()
         * .kind()
         * .publicKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SshHostTrust]. */
    class Builder internal constructor() {

        private var hostPattern: JsonField<String>? = null
        private var kind: JsonField<Kind>? = null
        private var publicKey: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sshHostTrust: SshHostTrust) = apply {
            hostPattern = sshHostTrust.hostPattern
            kind = sshHostTrust.kind
            publicKey = sshHostTrust.publicKey
            additionalProperties = sshHostTrust.additionalProperties.toMutableMap()
        }

        fun hostPattern(hostPattern: String) = hostPattern(JsonField.of(hostPattern))

        /**
         * Sets [Builder.hostPattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostPattern] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hostPattern(hostPattern: JsonField<String>) = apply { this.hostPattern = hostPattern }

        fun kind(kind: Kind) = kind(JsonField.of(kind))

        /**
         * Sets [Builder.kind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kind] with a well-typed [Kind] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

        fun publicKey(publicKey: String) = publicKey(JsonField.of(publicKey))

        /**
         * Sets [Builder.publicKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publicKey(publicKey: JsonField<String>) = apply { this.publicKey = publicKey }

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
         * Returns an immutable instance of [SshHostTrust].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hostPattern()
         * .kind()
         * .publicKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SshHostTrust =
            SshHostTrust(
                checkRequired("hostPattern", hostPattern),
                checkRequired("kind", kind),
                checkRequired("publicKey", publicKey),
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
    fun validate(): SshHostTrust = apply {
        if (validated) {
            return@apply
        }

        hostPattern()
        kind().validate()
        publicKey()
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
        (if (hostPattern.asKnown().isPresent) 1 else 0) +
            (kind.asKnown().getOrNull()?.validity() ?: 0) +
            (if (publicKey.asKnown().isPresent) 1 else 0)

    class Kind @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CERT_AUTHORITY = of("cert_authority")

            @JvmStatic fun of(value: String) = Kind(JsonField.of(value))
        }

        /** An enum containing [Kind]'s known values. */
        enum class Known {
            CERT_AUTHORITY
        }

        /**
         * An enum containing [Kind]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Kind] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CERT_AUTHORITY,
            /** An enum member indicating that [Kind] was instantiated with an unknown value. */
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
                CERT_AUTHORITY -> Value.CERT_AUTHORITY
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
                CERT_AUTHORITY -> Known.CERT_AUTHORITY
                else -> throw DedalusInvalidDataException("Unknown Kind: $value")
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
        fun validate(): Kind = apply {
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

            return other is Kind && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SshHostTrust &&
            hostPattern == other.hostPattern &&
            kind == other.kind &&
            publicKey == other.publicKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(hostPattern, kind, publicKey, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SshHostTrust{hostPattern=$hostPattern, kind=$kind, publicKey=$publicKey, additionalProperties=$additionalProperties}"
}
