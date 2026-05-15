// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.usage

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

class OrgUsage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val billedAwakeSeconds: JsonField<Long>,
    private val billedCpuMillicoreSeconds: JsonField<Long>,
    private val billedLogicalStorageMiBSeconds: JsonField<Long>,
    private val billedMemoryMiBSeconds: JsonField<Long>,
    private val includedStorageGiB: JsonField<Long>,
    private val planSlug: JsonField<String>,
    private val provisionedStorageGiB: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("billed_awake_seconds")
        @ExcludeMissing
        billedAwakeSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billed_cpu_millicore_seconds")
        @ExcludeMissing
        billedCpuMillicoreSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billed_logical_storage_mib_seconds")
        @ExcludeMissing
        billedLogicalStorageMiBSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billed_memory_mib_seconds")
        @ExcludeMissing
        billedMemoryMiBSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("included_storage_gib")
        @ExcludeMissing
        includedStorageGiB: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("plan_slug") @ExcludeMissing planSlug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provisioned_storage_gib")
        @ExcludeMissing
        provisionedStorageGiB: JsonField<Long> = JsonMissing.of(),
    ) : this(
        billedAwakeSeconds,
        billedCpuMillicoreSeconds,
        billedLogicalStorageMiBSeconds,
        billedMemoryMiBSeconds,
        includedStorageGiB,
        planSlug,
        provisionedStorageGiB,
        mutableMapOf(),
    )

    /**
     * Closed awake seconds in billed org buckets for the period.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billedAwakeSeconds(): Long = billedAwakeSeconds.getRequired("billed_awake_seconds")

    /**
     * Closed requested vCPU millicores multiplied by guest-owned active CPU seconds for the period.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billedCpuMillicoreSeconds(): Long =
        billedCpuMillicoreSeconds.getRequired("billed_cpu_millicore_seconds")

    /**
     * Closed billable logical MiB-seconds for the period, matching the Stripe storage meter.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billedLogicalStorageMiBSeconds(): Long =
        billedLogicalStorageMiBSeconds.getRequired("billed_logical_storage_mib_seconds")

    /**
     * Closed requested memory MiB multiplied by running allocation seconds for the period.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billedMemoryMiBSeconds(): Long =
        billedMemoryMiBSeconds.getRequired("billed_memory_mib_seconds")

    /**
     * Plan-included storage in GiB, used as a local guardrail only.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includedStorageGiB(): Long = includedStorageGiB.getRequired("included_storage_gib")

    /**
     * Billing plan in effect for the organization.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planSlug(): String = planSlug.getRequired("plan_slug")

    /**
     * Current provisioned storage summed across machines in GiB.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun provisionedStorageGiB(): Long = provisionedStorageGiB.getRequired("provisioned_storage_gib")

    /**
     * Returns the raw JSON value of [billedAwakeSeconds].
     *
     * Unlike [billedAwakeSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billed_awake_seconds")
    @ExcludeMissing
    fun _billedAwakeSeconds(): JsonField<Long> = billedAwakeSeconds

    /**
     * Returns the raw JSON value of [billedCpuMillicoreSeconds].
     *
     * Unlike [billedCpuMillicoreSeconds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("billed_cpu_millicore_seconds")
    @ExcludeMissing
    fun _billedCpuMillicoreSeconds(): JsonField<Long> = billedCpuMillicoreSeconds

    /**
     * Returns the raw JSON value of [billedLogicalStorageMiBSeconds].
     *
     * Unlike [billedLogicalStorageMiBSeconds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("billed_logical_storage_mib_seconds")
    @ExcludeMissing
    fun _billedLogicalStorageMiBSeconds(): JsonField<Long> = billedLogicalStorageMiBSeconds

    /**
     * Returns the raw JSON value of [billedMemoryMiBSeconds].
     *
     * Unlike [billedMemoryMiBSeconds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("billed_memory_mib_seconds")
    @ExcludeMissing
    fun _billedMemoryMiBSeconds(): JsonField<Long> = billedMemoryMiBSeconds

    /**
     * Returns the raw JSON value of [includedStorageGiB].
     *
     * Unlike [includedStorageGiB], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("included_storage_gib")
    @ExcludeMissing
    fun _includedStorageGiB(): JsonField<Long> = includedStorageGiB

    /**
     * Returns the raw JSON value of [planSlug].
     *
     * Unlike [planSlug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_slug") @ExcludeMissing fun _planSlug(): JsonField<String> = planSlug

    /**
     * Returns the raw JSON value of [provisionedStorageGiB].
     *
     * Unlike [provisionedStorageGiB], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("provisioned_storage_gib")
    @ExcludeMissing
    fun _provisionedStorageGiB(): JsonField<Long> = provisionedStorageGiB

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
         * Returns a mutable builder for constructing an instance of [OrgUsage].
         *
         * The following fields are required:
         * ```java
         * .billedAwakeSeconds()
         * .billedCpuMillicoreSeconds()
         * .billedLogicalStorageMiBSeconds()
         * .billedMemoryMiBSeconds()
         * .includedStorageGiB()
         * .planSlug()
         * .provisionedStorageGiB()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrgUsage]. */
    class Builder internal constructor() {

        private var billedAwakeSeconds: JsonField<Long>? = null
        private var billedCpuMillicoreSeconds: JsonField<Long>? = null
        private var billedLogicalStorageMiBSeconds: JsonField<Long>? = null
        private var billedMemoryMiBSeconds: JsonField<Long>? = null
        private var includedStorageGiB: JsonField<Long>? = null
        private var planSlug: JsonField<String>? = null
        private var provisionedStorageGiB: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orgUsage: OrgUsage) = apply {
            billedAwakeSeconds = orgUsage.billedAwakeSeconds
            billedCpuMillicoreSeconds = orgUsage.billedCpuMillicoreSeconds
            billedLogicalStorageMiBSeconds = orgUsage.billedLogicalStorageMiBSeconds
            billedMemoryMiBSeconds = orgUsage.billedMemoryMiBSeconds
            includedStorageGiB = orgUsage.includedStorageGiB
            planSlug = orgUsage.planSlug
            provisionedStorageGiB = orgUsage.provisionedStorageGiB
            additionalProperties = orgUsage.additionalProperties.toMutableMap()
        }

        /** Closed awake seconds in billed org buckets for the period. */
        fun billedAwakeSeconds(billedAwakeSeconds: Long) =
            billedAwakeSeconds(JsonField.of(billedAwakeSeconds))

        /**
         * Sets [Builder.billedAwakeSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billedAwakeSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billedAwakeSeconds(billedAwakeSeconds: JsonField<Long>) = apply {
            this.billedAwakeSeconds = billedAwakeSeconds
        }

        /**
         * Closed requested vCPU millicores multiplied by guest-owned active CPU seconds for the
         * period.
         */
        fun billedCpuMillicoreSeconds(billedCpuMillicoreSeconds: Long) =
            billedCpuMillicoreSeconds(JsonField.of(billedCpuMillicoreSeconds))

        /**
         * Sets [Builder.billedCpuMillicoreSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billedCpuMillicoreSeconds] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billedCpuMillicoreSeconds(billedCpuMillicoreSeconds: JsonField<Long>) = apply {
            this.billedCpuMillicoreSeconds = billedCpuMillicoreSeconds
        }

        /**
         * Closed billable logical MiB-seconds for the period, matching the Stripe storage meter.
         */
        fun billedLogicalStorageMiBSeconds(billedLogicalStorageMiBSeconds: Long) =
            billedLogicalStorageMiBSeconds(JsonField.of(billedLogicalStorageMiBSeconds))

        /**
         * Sets [Builder.billedLogicalStorageMiBSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billedLogicalStorageMiBSeconds] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billedLogicalStorageMiBSeconds(billedLogicalStorageMiBSeconds: JsonField<Long>) =
            apply {
                this.billedLogicalStorageMiBSeconds = billedLogicalStorageMiBSeconds
            }

        /** Closed requested memory MiB multiplied by running allocation seconds for the period. */
        fun billedMemoryMiBSeconds(billedMemoryMiBSeconds: Long) =
            billedMemoryMiBSeconds(JsonField.of(billedMemoryMiBSeconds))

        /**
         * Sets [Builder.billedMemoryMiBSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billedMemoryMiBSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billedMemoryMiBSeconds(billedMemoryMiBSeconds: JsonField<Long>) = apply {
            this.billedMemoryMiBSeconds = billedMemoryMiBSeconds
        }

        /** Plan-included storage in GiB, used as a local guardrail only. */
        fun includedStorageGiB(includedStorageGiB: Long) =
            includedStorageGiB(JsonField.of(includedStorageGiB))

        /**
         * Sets [Builder.includedStorageGiB] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includedStorageGiB] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includedStorageGiB(includedStorageGiB: JsonField<Long>) = apply {
            this.includedStorageGiB = includedStorageGiB
        }

        /** Billing plan in effect for the organization. */
        fun planSlug(planSlug: String) = planSlug(JsonField.of(planSlug))

        /**
         * Sets [Builder.planSlug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planSlug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planSlug(planSlug: JsonField<String>) = apply { this.planSlug = planSlug }

        /** Current provisioned storage summed across machines in GiB. */
        fun provisionedStorageGiB(provisionedStorageGiB: Long) =
            provisionedStorageGiB(JsonField.of(provisionedStorageGiB))

        /**
         * Sets [Builder.provisionedStorageGiB] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provisionedStorageGiB] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun provisionedStorageGiB(provisionedStorageGiB: JsonField<Long>) = apply {
            this.provisionedStorageGiB = provisionedStorageGiB
        }

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
         * Returns an immutable instance of [OrgUsage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .billedAwakeSeconds()
         * .billedCpuMillicoreSeconds()
         * .billedLogicalStorageMiBSeconds()
         * .billedMemoryMiBSeconds()
         * .includedStorageGiB()
         * .planSlug()
         * .provisionedStorageGiB()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrgUsage =
            OrgUsage(
                checkRequired("billedAwakeSeconds", billedAwakeSeconds),
                checkRequired("billedCpuMillicoreSeconds", billedCpuMillicoreSeconds),
                checkRequired("billedLogicalStorageMiBSeconds", billedLogicalStorageMiBSeconds),
                checkRequired("billedMemoryMiBSeconds", billedMemoryMiBSeconds),
                checkRequired("includedStorageGiB", includedStorageGiB),
                checkRequired("planSlug", planSlug),
                checkRequired("provisionedStorageGiB", provisionedStorageGiB),
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
    fun validate(): OrgUsage = apply {
        if (validated) {
            return@apply
        }

        billedAwakeSeconds()
        billedCpuMillicoreSeconds()
        billedLogicalStorageMiBSeconds()
        billedMemoryMiBSeconds()
        includedStorageGiB()
        planSlug()
        provisionedStorageGiB()
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
        (if (billedAwakeSeconds.asKnown().isPresent) 1 else 0) +
            (if (billedCpuMillicoreSeconds.asKnown().isPresent) 1 else 0) +
            (if (billedLogicalStorageMiBSeconds.asKnown().isPresent) 1 else 0) +
            (if (billedMemoryMiBSeconds.asKnown().isPresent) 1 else 0) +
            (if (includedStorageGiB.asKnown().isPresent) 1 else 0) +
            (if (planSlug.asKnown().isPresent) 1 else 0) +
            (if (provisionedStorageGiB.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrgUsage &&
            billedAwakeSeconds == other.billedAwakeSeconds &&
            billedCpuMillicoreSeconds == other.billedCpuMillicoreSeconds &&
            billedLogicalStorageMiBSeconds == other.billedLogicalStorageMiBSeconds &&
            billedMemoryMiBSeconds == other.billedMemoryMiBSeconds &&
            includedStorageGiB == other.includedStorageGiB &&
            planSlug == other.planSlug &&
            provisionedStorageGiB == other.provisionedStorageGiB &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            billedAwakeSeconds,
            billedCpuMillicoreSeconds,
            billedLogicalStorageMiBSeconds,
            billedMemoryMiBSeconds,
            includedStorageGiB,
            planSlug,
            provisionedStorageGiB,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrgUsage{billedAwakeSeconds=$billedAwakeSeconds, billedCpuMillicoreSeconds=$billedCpuMillicoreSeconds, billedLogicalStorageMiBSeconds=$billedLogicalStorageMiBSeconds, billedMemoryMiBSeconds=$billedMemoryMiBSeconds, includedStorageGiB=$includedStorageGiB, planSlug=$planSlug, provisionedStorageGiB=$provisionedStorageGiB, additionalProperties=$additionalProperties}"
}
