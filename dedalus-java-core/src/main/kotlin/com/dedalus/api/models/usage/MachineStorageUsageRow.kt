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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class MachineStorageUsageRow
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bucketEnd: JsonField<OffsetDateTime>,
    private val bucketStart: JsonField<OffsetDateTime>,
    private val logicalStorageBytes: JsonField<Long>,
    private val machineId: JsonField<String>,
    private val orgMeteringBucketId: JsonField<String>,
    private val storageMiBSeconds: JsonField<Long>,
    private val stripeStorageIdentifier: JsonField<String>,
    private val latestStripeEmittedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucket_end")
        @ExcludeMissing
        bucketEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("bucket_start")
        @ExcludeMissing
        bucketStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("logical_storage_bytes")
        @ExcludeMissing
        logicalStorageBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("machine_id") @ExcludeMissing machineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("org_metering_bucket_id")
        @ExcludeMissing
        orgMeteringBucketId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("storage_mib_seconds")
        @ExcludeMissing
        storageMiBSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stripe_storage_identifier")
        @ExcludeMissing
        stripeStorageIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latest_stripe_emitted_at")
        @ExcludeMissing
        latestStripeEmittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        bucketEnd,
        bucketStart,
        logicalStorageBytes,
        machineId,
        orgMeteringBucketId,
        storageMiBSeconds,
        stripeStorageIdentifier,
        latestStripeEmittedAt,
        mutableMapOf(),
    )

    /**
     * Exclusive usage bucket end.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketEnd(): OffsetDateTime = bucketEnd.getRequired("bucket_end")

    /**
     * Inclusive usage bucket start.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketStart(): OffsetDateTime = bucketStart.getRequired("bucket_start")

    /**
     * Machine logical bytes observed for storage allocation.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun logicalStorageBytes(): Long = logicalStorageBytes.getRequired("logical_storage_bytes")

    /**
     * Machine identifier.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun machineId(): String = machineId.getRequired("machine_id")

    /**
     * Org storage bucket ID this row contributes to.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orgMeteringBucketId(): String = orgMeteringBucketId.getRequired("org_metering_bucket_id")

    /**
     * Allocated logical MiB-seconds for this machine.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun storageMiBSeconds(): Long = storageMiBSeconds.getRequired("storage_mib_seconds")

    /**
     * Stripe storage meter event identifier linked to that org bucket.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stripeStorageIdentifier(): String =
        stripeStorageIdentifier.getRequired("stripe_storage_identifier")

    /**
     * Latest Stripe emission timestamp for the linked org bucket, when emitted.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestStripeEmittedAt(): Optional<OffsetDateTime> =
        latestStripeEmittedAt.getOptional("latest_stripe_emitted_at")

    /**
     * Returns the raw JSON value of [bucketEnd].
     *
     * Unlike [bucketEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket_end")
    @ExcludeMissing
    fun _bucketEnd(): JsonField<OffsetDateTime> = bucketEnd

    /**
     * Returns the raw JSON value of [bucketStart].
     *
     * Unlike [bucketStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket_start")
    @ExcludeMissing
    fun _bucketStart(): JsonField<OffsetDateTime> = bucketStart

    /**
     * Returns the raw JSON value of [logicalStorageBytes].
     *
     * Unlike [logicalStorageBytes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("logical_storage_bytes")
    @ExcludeMissing
    fun _logicalStorageBytes(): JsonField<Long> = logicalStorageBytes

    /**
     * Returns the raw JSON value of [machineId].
     *
     * Unlike [machineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("machine_id") @ExcludeMissing fun _machineId(): JsonField<String> = machineId

    /**
     * Returns the raw JSON value of [orgMeteringBucketId].
     *
     * Unlike [orgMeteringBucketId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("org_metering_bucket_id")
    @ExcludeMissing
    fun _orgMeteringBucketId(): JsonField<String> = orgMeteringBucketId

    /**
     * Returns the raw JSON value of [storageMiBSeconds].
     *
     * Unlike [storageMiBSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("storage_mib_seconds")
    @ExcludeMissing
    fun _storageMiBSeconds(): JsonField<Long> = storageMiBSeconds

    /**
     * Returns the raw JSON value of [stripeStorageIdentifier].
     *
     * Unlike [stripeStorageIdentifier], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("stripe_storage_identifier")
    @ExcludeMissing
    fun _stripeStorageIdentifier(): JsonField<String> = stripeStorageIdentifier

    /**
     * Returns the raw JSON value of [latestStripeEmittedAt].
     *
     * Unlike [latestStripeEmittedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("latest_stripe_emitted_at")
    @ExcludeMissing
    fun _latestStripeEmittedAt(): JsonField<OffsetDateTime> = latestStripeEmittedAt

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
         * Returns a mutable builder for constructing an instance of [MachineStorageUsageRow].
         *
         * The following fields are required:
         * ```java
         * .bucketEnd()
         * .bucketStart()
         * .logicalStorageBytes()
         * .machineId()
         * .orgMeteringBucketId()
         * .storageMiBSeconds()
         * .stripeStorageIdentifier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MachineStorageUsageRow]. */
    class Builder internal constructor() {

        private var bucketEnd: JsonField<OffsetDateTime>? = null
        private var bucketStart: JsonField<OffsetDateTime>? = null
        private var logicalStorageBytes: JsonField<Long>? = null
        private var machineId: JsonField<String>? = null
        private var orgMeteringBucketId: JsonField<String>? = null
        private var storageMiBSeconds: JsonField<Long>? = null
        private var stripeStorageIdentifier: JsonField<String>? = null
        private var latestStripeEmittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(machineStorageUsageRow: MachineStorageUsageRow) = apply {
            bucketEnd = machineStorageUsageRow.bucketEnd
            bucketStart = machineStorageUsageRow.bucketStart
            logicalStorageBytes = machineStorageUsageRow.logicalStorageBytes
            machineId = machineStorageUsageRow.machineId
            orgMeteringBucketId = machineStorageUsageRow.orgMeteringBucketId
            storageMiBSeconds = machineStorageUsageRow.storageMiBSeconds
            stripeStorageIdentifier = machineStorageUsageRow.stripeStorageIdentifier
            latestStripeEmittedAt = machineStorageUsageRow.latestStripeEmittedAt
            additionalProperties = machineStorageUsageRow.additionalProperties.toMutableMap()
        }

        /** Exclusive usage bucket end. */
        fun bucketEnd(bucketEnd: OffsetDateTime) = bucketEnd(JsonField.of(bucketEnd))

        /**
         * Sets [Builder.bucketEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bucketEnd(bucketEnd: JsonField<OffsetDateTime>) = apply { this.bucketEnd = bucketEnd }

        /** Inclusive usage bucket start. */
        fun bucketStart(bucketStart: OffsetDateTime) = bucketStart(JsonField.of(bucketStart))

        /**
         * Sets [Builder.bucketStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bucketStart(bucketStart: JsonField<OffsetDateTime>) = apply {
            this.bucketStart = bucketStart
        }

        /** Machine logical bytes observed for storage allocation. */
        fun logicalStorageBytes(logicalStorageBytes: Long) =
            logicalStorageBytes(JsonField.of(logicalStorageBytes))

        /**
         * Sets [Builder.logicalStorageBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logicalStorageBytes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logicalStorageBytes(logicalStorageBytes: JsonField<Long>) = apply {
            this.logicalStorageBytes = logicalStorageBytes
        }

        /** Machine identifier. */
        fun machineId(machineId: String) = machineId(JsonField.of(machineId))

        /**
         * Sets [Builder.machineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun machineId(machineId: JsonField<String>) = apply { this.machineId = machineId }

        /** Org storage bucket ID this row contributes to. */
        fun orgMeteringBucketId(orgMeteringBucketId: String) =
            orgMeteringBucketId(JsonField.of(orgMeteringBucketId))

        /**
         * Sets [Builder.orgMeteringBucketId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgMeteringBucketId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun orgMeteringBucketId(orgMeteringBucketId: JsonField<String>) = apply {
            this.orgMeteringBucketId = orgMeteringBucketId
        }

        /** Allocated logical MiB-seconds for this machine. */
        fun storageMiBSeconds(storageMiBSeconds: Long) =
            storageMiBSeconds(JsonField.of(storageMiBSeconds))

        /**
         * Sets [Builder.storageMiBSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.storageMiBSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun storageMiBSeconds(storageMiBSeconds: JsonField<Long>) = apply {
            this.storageMiBSeconds = storageMiBSeconds
        }

        /** Stripe storage meter event identifier linked to that org bucket. */
        fun stripeStorageIdentifier(stripeStorageIdentifier: String) =
            stripeStorageIdentifier(JsonField.of(stripeStorageIdentifier))

        /**
         * Sets [Builder.stripeStorageIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stripeStorageIdentifier] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun stripeStorageIdentifier(stripeStorageIdentifier: JsonField<String>) = apply {
            this.stripeStorageIdentifier = stripeStorageIdentifier
        }

        /** Latest Stripe emission timestamp for the linked org bucket, when emitted. */
        fun latestStripeEmittedAt(latestStripeEmittedAt: OffsetDateTime) =
            latestStripeEmittedAt(JsonField.of(latestStripeEmittedAt))

        /**
         * Sets [Builder.latestStripeEmittedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestStripeEmittedAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun latestStripeEmittedAt(latestStripeEmittedAt: JsonField<OffsetDateTime>) = apply {
            this.latestStripeEmittedAt = latestStripeEmittedAt
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
         * Returns an immutable instance of [MachineStorageUsageRow].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucketEnd()
         * .bucketStart()
         * .logicalStorageBytes()
         * .machineId()
         * .orgMeteringBucketId()
         * .storageMiBSeconds()
         * .stripeStorageIdentifier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MachineStorageUsageRow =
            MachineStorageUsageRow(
                checkRequired("bucketEnd", bucketEnd),
                checkRequired("bucketStart", bucketStart),
                checkRequired("logicalStorageBytes", logicalStorageBytes),
                checkRequired("machineId", machineId),
                checkRequired("orgMeteringBucketId", orgMeteringBucketId),
                checkRequired("storageMiBSeconds", storageMiBSeconds),
                checkRequired("stripeStorageIdentifier", stripeStorageIdentifier),
                latestStripeEmittedAt,
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
    fun validate(): MachineStorageUsageRow = apply {
        if (validated) {
            return@apply
        }

        bucketEnd()
        bucketStart()
        logicalStorageBytes()
        machineId()
        orgMeteringBucketId()
        storageMiBSeconds()
        stripeStorageIdentifier()
        latestStripeEmittedAt()
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
        (if (bucketEnd.asKnown().isPresent) 1 else 0) +
            (if (bucketStart.asKnown().isPresent) 1 else 0) +
            (if (logicalStorageBytes.asKnown().isPresent) 1 else 0) +
            (if (machineId.asKnown().isPresent) 1 else 0) +
            (if (orgMeteringBucketId.asKnown().isPresent) 1 else 0) +
            (if (storageMiBSeconds.asKnown().isPresent) 1 else 0) +
            (if (stripeStorageIdentifier.asKnown().isPresent) 1 else 0) +
            (if (latestStripeEmittedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MachineStorageUsageRow &&
            bucketEnd == other.bucketEnd &&
            bucketStart == other.bucketStart &&
            logicalStorageBytes == other.logicalStorageBytes &&
            machineId == other.machineId &&
            orgMeteringBucketId == other.orgMeteringBucketId &&
            storageMiBSeconds == other.storageMiBSeconds &&
            stripeStorageIdentifier == other.stripeStorageIdentifier &&
            latestStripeEmittedAt == other.latestStripeEmittedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            bucketEnd,
            bucketStart,
            logicalStorageBytes,
            machineId,
            orgMeteringBucketId,
            storageMiBSeconds,
            stripeStorageIdentifier,
            latestStripeEmittedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MachineStorageUsageRow{bucketEnd=$bucketEnd, bucketStart=$bucketStart, logicalStorageBytes=$logicalStorageBytes, machineId=$machineId, orgMeteringBucketId=$orgMeteringBucketId, storageMiBSeconds=$storageMiBSeconds, stripeStorageIdentifier=$stripeStorageIdentifier, latestStripeEmittedAt=$latestStripeEmittedAt, additionalProperties=$additionalProperties}"
}
