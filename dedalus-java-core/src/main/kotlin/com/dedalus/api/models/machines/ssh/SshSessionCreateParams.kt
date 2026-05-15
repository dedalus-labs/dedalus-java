// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

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

class SshSessionCreateParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val publicKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("public_key") @ExcludeMissing publicKey: JsonField<String> = JsonMissing.of()
    ) : this(publicKey, mutableMapOf())

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publicKey(): String = publicKey.getRequired("public_key")

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
         * Returns a mutable builder for constructing an instance of [SshSessionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .publicKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SshSessionCreateParams]. */
    class Builder internal constructor() {

        private var publicKey: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sshSessionCreateParams: SshSessionCreateParams) = apply {
            publicKey = sshSessionCreateParams.publicKey
            additionalProperties = sshSessionCreateParams.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [SshSessionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .publicKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SshSessionCreateParams =
            SshSessionCreateParams(
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
    fun validate(): SshSessionCreateParams = apply {
        if (validated) {
            return@apply
        }

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
    @JvmSynthetic internal fun validity(): Int = (if (publicKey.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SshSessionCreateParams &&
            publicKey == other.publicKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(publicKey, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SshSessionCreateParams{publicKey=$publicKey, additionalProperties=$additionalProperties}"
}
