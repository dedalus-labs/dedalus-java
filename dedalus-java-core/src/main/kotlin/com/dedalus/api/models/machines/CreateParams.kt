// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.ExcludeMissing
import com.dedalus.api.core.JsonField
import com.dedalus.api.core.JsonMissing
import com.dedalus.api.core.JsonValue
import com.dedalus.api.errors.DedalusInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

class CreateParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val autosleep: JsonField<String>,
    private val memoryMiB: JsonField<Long>,
    private val storageGiB: JsonField<Long>,
    private val vcpu: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("autosleep") @ExcludeMissing autosleep: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memory_mib") @ExcludeMissing memoryMiB: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("storage_gib") @ExcludeMissing storageGiB: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vcpu") @ExcludeMissing vcpu: JsonField<Double> = JsonMissing.of(),
    ) : this(autosleep, memoryMiB, storageGiB, vcpu, mutableMapOf())

    /**
     * Idle window before autosleep. Accepts fixed duration units like 30s, 30m, 2h, 7d3h4s, or
     * 1w3d, raw seconds ("1800"), or never to disable.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autosleep(): Optional<String> = autosleep.getOptional("autosleep")

    /**
     * Memory in MiB.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memoryMiB(): Optional<Long> = memoryMiB.getOptional("memory_mib")

    /**
     * Storage in GiB.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun storageGiB(): Optional<Long> = storageGiB.getOptional("storage_gib")

    /**
     * CPU in vCPUs.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vcpu(): Optional<Double> = vcpu.getOptional("vcpu")

    /**
     * Returns the raw JSON value of [autosleep].
     *
     * Unlike [autosleep], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("autosleep") @ExcludeMissing fun _autosleep(): JsonField<String> = autosleep

    /**
     * Returns the raw JSON value of [memoryMiB].
     *
     * Unlike [memoryMiB], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memory_mib") @ExcludeMissing fun _memoryMiB(): JsonField<Long> = memoryMiB

    /**
     * Returns the raw JSON value of [storageGiB].
     *
     * Unlike [storageGiB], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("storage_gib") @ExcludeMissing fun _storageGiB(): JsonField<Long> = storageGiB

    /**
     * Returns the raw JSON value of [vcpu].
     *
     * Unlike [vcpu], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vcpu") @ExcludeMissing fun _vcpu(): JsonField<Double> = vcpu

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

        /** Returns a mutable builder for constructing an instance of [CreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateParams]. */
    class Builder internal constructor() {

        private var autosleep: JsonField<String> = JsonMissing.of()
        private var memoryMiB: JsonField<Long> = JsonMissing.of()
        private var storageGiB: JsonField<Long> = JsonMissing.of()
        private var vcpu: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createParams: CreateParams) = apply {
            autosleep = createParams.autosleep
            memoryMiB = createParams.memoryMiB
            storageGiB = createParams.storageGiB
            vcpu = createParams.vcpu
            additionalProperties = createParams.additionalProperties.toMutableMap()
        }

        /**
         * Idle window before autosleep. Accepts fixed duration units like 30s, 30m, 2h, 7d3h4s, or
         * 1w3d, raw seconds ("1800"), or never to disable.
         */
        fun autosleep(autosleep: String) = autosleep(JsonField.of(autosleep))

        /**
         * Sets [Builder.autosleep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autosleep] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autosleep(autosleep: JsonField<String>) = apply { this.autosleep = autosleep }

        /** Memory in MiB. */
        fun memoryMiB(memoryMiB: Long) = memoryMiB(JsonField.of(memoryMiB))

        /**
         * Sets [Builder.memoryMiB] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memoryMiB] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memoryMiB(memoryMiB: JsonField<Long>) = apply { this.memoryMiB = memoryMiB }

        /** Storage in GiB. */
        fun storageGiB(storageGiB: Long) = storageGiB(JsonField.of(storageGiB))

        /**
         * Sets [Builder.storageGiB] to an arbitrary JSON value.
         *
         * You should usually call [Builder.storageGiB] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun storageGiB(storageGiB: JsonField<Long>) = apply { this.storageGiB = storageGiB }

        /** CPU in vCPUs. */
        fun vcpu(vcpu: Double) = vcpu(JsonField.of(vcpu))

        /**
         * Sets [Builder.vcpu] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vcpu] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vcpu(vcpu: JsonField<Double>) = apply { this.vcpu = vcpu }

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
         * Returns an immutable instance of [CreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreateParams =
            CreateParams(
                autosleep,
                memoryMiB,
                storageGiB,
                vcpu,
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
    fun validate(): CreateParams = apply {
        if (validated) {
            return@apply
        }

        autosleep()
        memoryMiB()
        storageGiB()
        vcpu()
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
        (if (autosleep.asKnown().isPresent) 1 else 0) +
            (if (memoryMiB.asKnown().isPresent) 1 else 0) +
            (if (storageGiB.asKnown().isPresent) 1 else 0) +
            (if (vcpu.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateParams &&
            autosleep == other.autosleep &&
            memoryMiB == other.memoryMiB &&
            storageGiB == other.storageGiB &&
            vcpu == other.vcpu &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(autosleep, memoryMiB, storageGiB, vcpu, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateParams{autosleep=$autosleep, memoryMiB=$memoryMiB, storageGiB=$storageGiB, vcpu=$vcpu, additionalProperties=$additionalProperties}"
}
