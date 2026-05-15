// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.usage

import com.dedalus.api.core.ExcludeMissing
import com.dedalus.api.core.JsonField
import com.dedalus.api.core.JsonMissing
import com.dedalus.api.core.JsonValue
import com.dedalus.api.core.checkKnown
import com.dedalus.api.core.checkRequired
import com.dedalus.api.core.toImmutable
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

class MachineStorageUsage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val periodEnd: JsonField<OffsetDateTime>,
    private val periodStart: JsonField<OffsetDateTime>,
    private val rows: JsonField<List<MachineStorageUsageRow>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("period_end")
        @ExcludeMissing
        periodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("period_start")
        @ExcludeMissing
        periodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rows")
        @ExcludeMissing
        rows: JsonField<List<MachineStorageUsageRow>> = JsonMissing.of(),
    ) : this(periodEnd, periodStart, rows, mutableMapOf())

    /**
     * Exclusive usage period end.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodEnd(): OffsetDateTime = periodEnd.getRequired("period_end")

    /**
     * Inclusive usage period start.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodStart(): OffsetDateTime = periodStart.getRequired("period_start")

    /**
     * Machine-level storage usage breakdown rows.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rows(): Optional<List<MachineStorageUsageRow>> = rows.getOptional("rows")

    /**
     * Returns the raw JSON value of [periodEnd].
     *
     * Unlike [periodEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_end")
    @ExcludeMissing
    fun _periodEnd(): JsonField<OffsetDateTime> = periodEnd

    /**
     * Returns the raw JSON value of [periodStart].
     *
     * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_start")
    @ExcludeMissing
    fun _periodStart(): JsonField<OffsetDateTime> = periodStart

    /**
     * Returns the raw JSON value of [rows].
     *
     * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rows")
    @ExcludeMissing
    fun _rows(): JsonField<List<MachineStorageUsageRow>> = rows

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
         * Returns a mutable builder for constructing an instance of [MachineStorageUsage].
         *
         * The following fields are required:
         * ```java
         * .periodEnd()
         * .periodStart()
         * .rows()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MachineStorageUsage]. */
    class Builder internal constructor() {

        private var periodEnd: JsonField<OffsetDateTime>? = null
        private var periodStart: JsonField<OffsetDateTime>? = null
        private var rows: JsonField<MutableList<MachineStorageUsageRow>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(machineStorageUsage: MachineStorageUsage) = apply {
            periodEnd = machineStorageUsage.periodEnd
            periodStart = machineStorageUsage.periodStart
            rows = machineStorageUsage.rows.map { it.toMutableList() }
            additionalProperties = machineStorageUsage.additionalProperties.toMutableMap()
        }

        /** Exclusive usage period end. */
        fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

        /**
         * Sets [Builder.periodEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply { this.periodEnd = periodEnd }

        /** Inclusive usage period start. */
        fun periodStart(periodStart: OffsetDateTime) = periodStart(JsonField.of(periodStart))

        /**
         * Sets [Builder.periodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
            this.periodStart = periodStart
        }

        /** Machine-level storage usage breakdown rows. */
        fun rows(rows: List<MachineStorageUsageRow>?) = rows(JsonField.ofNullable(rows))

        /** Alias for calling [Builder.rows] with `rows.orElse(null)`. */
        fun rows(rows: Optional<List<MachineStorageUsageRow>>) = rows(rows.getOrNull())

        /**
         * Sets [Builder.rows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rows] with a well-typed `List<MachineStorageUsageRow>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rows(rows: JsonField<List<MachineStorageUsageRow>>) = apply {
            this.rows = rows.map { it.toMutableList() }
        }

        /**
         * Adds a single [MachineStorageUsageRow] to [rows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRow(row: MachineStorageUsageRow) = apply {
            rows = (rows ?: JsonField.of(mutableListOf())).also { checkKnown("rows", it).add(row) }
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
         * Returns an immutable instance of [MachineStorageUsage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .periodEnd()
         * .periodStart()
         * .rows()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MachineStorageUsage =
            MachineStorageUsage(
                checkRequired("periodEnd", periodEnd),
                checkRequired("periodStart", periodStart),
                checkRequired("rows", rows).map { it.toImmutable() },
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
    fun validate(): MachineStorageUsage = apply {
        if (validated) {
            return@apply
        }

        periodEnd()
        periodStart()
        rows().ifPresent { it.forEach { it.validate() } }
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
        (if (periodEnd.asKnown().isPresent) 1 else 0) +
            (if (periodStart.asKnown().isPresent) 1 else 0) +
            (rows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MachineStorageUsage &&
            periodEnd == other.periodEnd &&
            periodStart == other.periodStart &&
            rows == other.rows &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(periodEnd, periodStart, rows, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MachineStorageUsage{periodEnd=$periodEnd, periodStart=$periodStart, rows=$rows, additionalProperties=$additionalProperties}"
}
