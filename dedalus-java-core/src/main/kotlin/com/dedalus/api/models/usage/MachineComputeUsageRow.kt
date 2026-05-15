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

class MachineComputeUsageRow
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val awakeSeconds: JsonField<Long>,
    private val bucketEnd: JsonField<OffsetDateTime>,
    private val bucketStart: JsonField<OffsetDateTime>,
    private val cpuMillicoreSeconds: JsonField<Long>,
    private val lastWindowEnd: JsonField<OffsetDateTime>,
    private val machineId: JsonField<String>,
    private val memoryMiBSeconds: JsonField<Long>,
    private val orgMeteringBucketIds: JsonField<List<String>>,
    private val requestedMemoryMiB: JsonField<Int>,
    private val requestedStorageGiB: JsonField<Int>,
    private val requestedVcpu: JsonField<Double>,
    private val specFingerprint: JsonField<String>,
    private val stripeCpuIdentifiers: JsonField<List<String>>,
    private val stripeMemoryIdentifiers: JsonField<List<String>>,
    private val windowCount: JsonField<Long>,
    private val latestStripeEmittedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("awake_seconds")
        @ExcludeMissing
        awakeSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("bucket_end")
        @ExcludeMissing
        bucketEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("bucket_start")
        @ExcludeMissing
        bucketStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cpu_millicore_seconds")
        @ExcludeMissing
        cpuMillicoreSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("last_window_end")
        @ExcludeMissing
        lastWindowEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("machine_id") @ExcludeMissing machineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memory_mib_seconds")
        @ExcludeMissing
        memoryMiBSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("org_metering_bucket_ids")
        @ExcludeMissing
        orgMeteringBucketIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("requested_memory_mib")
        @ExcludeMissing
        requestedMemoryMiB: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("requested_storage_gib")
        @ExcludeMissing
        requestedStorageGiB: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("requested_vcpu")
        @ExcludeMissing
        requestedVcpu: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("spec_fingerprint")
        @ExcludeMissing
        specFingerprint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stripe_cpu_identifiers")
        @ExcludeMissing
        stripeCpuIdentifiers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("stripe_memory_identifiers")
        @ExcludeMissing
        stripeMemoryIdentifiers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("window_count")
        @ExcludeMissing
        windowCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("latest_stripe_emitted_at")
        @ExcludeMissing
        latestStripeEmittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        awakeSeconds,
        bucketEnd,
        bucketStart,
        cpuMillicoreSeconds,
        lastWindowEnd,
        machineId,
        memoryMiBSeconds,
        orgMeteringBucketIds,
        requestedMemoryMiB,
        requestedStorageGiB,
        requestedVcpu,
        specFingerprint,
        stripeCpuIdentifiers,
        stripeMemoryIdentifiers,
        windowCount,
        latestStripeEmittedAt,
        mutableMapOf(),
    )

    /**
     * Machine-awake seconds in this bucket.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun awakeSeconds(): Long = awakeSeconds.getRequired("awake_seconds")

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
     * Requested vCPU millicores multiplied by guest-owned active CPU seconds.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cpuMillicoreSeconds(): Long = cpuMillicoreSeconds.getRequired("cpu_millicore_seconds")

    /**
     * Latest raw window_end represented by this row.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastWindowEnd(): OffsetDateTime = lastWindowEnd.getRequired("last_window_end")

    /**
     * Machine identifier.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun machineId(): String = machineId.getRequired("machine_id")

    /**
     * Requested memory MiB multiplied by running allocation seconds.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun memoryMiBSeconds(): Long = memoryMiBSeconds.getRequired("memory_mib_seconds")

    /**
     * Org compute bucket IDs this row contributes to.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orgMeteringBucketIds(): Optional<List<String>> =
        orgMeteringBucketIds.getOptional("org_metering_bucket_ids")

    /**
     * Requested memory for this shape, in MiB.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedMemoryMiB(): Int = requestedMemoryMiB.getRequired("requested_memory_mib")

    /**
     * Requested storage for this shape, in GiB.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedStorageGiB(): Int = requestedStorageGiB.getRequired("requested_storage_gib")

    /**
     * Requested vCPU for this shape.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedVcpu(): Double = requestedVcpu.getRequired("requested_vcpu")

    /**
     * Stable fingerprint for the requested machine shape.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun specFingerprint(): String = specFingerprint.getRequired("spec_fingerprint")

    /**
     * Stripe CPU meter event identifiers linked to those org buckets.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stripeCpuIdentifiers(): Optional<List<String>> =
        stripeCpuIdentifiers.getOptional("stripe_cpu_identifiers")

    /**
     * Stripe memory meter event identifiers linked to those org buckets.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stripeMemoryIdentifiers(): Optional<List<String>> =
        stripeMemoryIdentifiers.getOptional("stripe_memory_identifiers")

    /**
     * Raw usage windows compacted into this row.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun windowCount(): Long = windowCount.getRequired("window_count")

    /**
     * Latest Stripe emission timestamp for linked org buckets, when emitted.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestStripeEmittedAt(): Optional<OffsetDateTime> =
        latestStripeEmittedAt.getOptional("latest_stripe_emitted_at")

    /**
     * Returns the raw JSON value of [awakeSeconds].
     *
     * Unlike [awakeSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("awake_seconds")
    @ExcludeMissing
    fun _awakeSeconds(): JsonField<Long> = awakeSeconds

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
     * Returns the raw JSON value of [cpuMillicoreSeconds].
     *
     * Unlike [cpuMillicoreSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cpu_millicore_seconds")
    @ExcludeMissing
    fun _cpuMillicoreSeconds(): JsonField<Long> = cpuMillicoreSeconds

    /**
     * Returns the raw JSON value of [lastWindowEnd].
     *
     * Unlike [lastWindowEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_window_end")
    @ExcludeMissing
    fun _lastWindowEnd(): JsonField<OffsetDateTime> = lastWindowEnd

    /**
     * Returns the raw JSON value of [machineId].
     *
     * Unlike [machineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("machine_id") @ExcludeMissing fun _machineId(): JsonField<String> = machineId

    /**
     * Returns the raw JSON value of [memoryMiBSeconds].
     *
     * Unlike [memoryMiBSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("memory_mib_seconds")
    @ExcludeMissing
    fun _memoryMiBSeconds(): JsonField<Long> = memoryMiBSeconds

    /**
     * Returns the raw JSON value of [orgMeteringBucketIds].
     *
     * Unlike [orgMeteringBucketIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("org_metering_bucket_ids")
    @ExcludeMissing
    fun _orgMeteringBucketIds(): JsonField<List<String>> = orgMeteringBucketIds

    /**
     * Returns the raw JSON value of [requestedMemoryMiB].
     *
     * Unlike [requestedMemoryMiB], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requested_memory_mib")
    @ExcludeMissing
    fun _requestedMemoryMiB(): JsonField<Int> = requestedMemoryMiB

    /**
     * Returns the raw JSON value of [requestedStorageGiB].
     *
     * Unlike [requestedStorageGiB], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requested_storage_gib")
    @ExcludeMissing
    fun _requestedStorageGiB(): JsonField<Int> = requestedStorageGiB

    /**
     * Returns the raw JSON value of [requestedVcpu].
     *
     * Unlike [requestedVcpu], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requested_vcpu")
    @ExcludeMissing
    fun _requestedVcpu(): JsonField<Double> = requestedVcpu

    /**
     * Returns the raw JSON value of [specFingerprint].
     *
     * Unlike [specFingerprint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spec_fingerprint")
    @ExcludeMissing
    fun _specFingerprint(): JsonField<String> = specFingerprint

    /**
     * Returns the raw JSON value of [stripeCpuIdentifiers].
     *
     * Unlike [stripeCpuIdentifiers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("stripe_cpu_identifiers")
    @ExcludeMissing
    fun _stripeCpuIdentifiers(): JsonField<List<String>> = stripeCpuIdentifiers

    /**
     * Returns the raw JSON value of [stripeMemoryIdentifiers].
     *
     * Unlike [stripeMemoryIdentifiers], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("stripe_memory_identifiers")
    @ExcludeMissing
    fun _stripeMemoryIdentifiers(): JsonField<List<String>> = stripeMemoryIdentifiers

    /**
     * Returns the raw JSON value of [windowCount].
     *
     * Unlike [windowCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("window_count") @ExcludeMissing fun _windowCount(): JsonField<Long> = windowCount

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
         * Returns a mutable builder for constructing an instance of [MachineComputeUsageRow].
         *
         * The following fields are required:
         * ```java
         * .awakeSeconds()
         * .bucketEnd()
         * .bucketStart()
         * .cpuMillicoreSeconds()
         * .lastWindowEnd()
         * .machineId()
         * .memoryMiBSeconds()
         * .orgMeteringBucketIds()
         * .requestedMemoryMiB()
         * .requestedStorageGiB()
         * .requestedVcpu()
         * .specFingerprint()
         * .stripeCpuIdentifiers()
         * .stripeMemoryIdentifiers()
         * .windowCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MachineComputeUsageRow]. */
    class Builder internal constructor() {

        private var awakeSeconds: JsonField<Long>? = null
        private var bucketEnd: JsonField<OffsetDateTime>? = null
        private var bucketStart: JsonField<OffsetDateTime>? = null
        private var cpuMillicoreSeconds: JsonField<Long>? = null
        private var lastWindowEnd: JsonField<OffsetDateTime>? = null
        private var machineId: JsonField<String>? = null
        private var memoryMiBSeconds: JsonField<Long>? = null
        private var orgMeteringBucketIds: JsonField<MutableList<String>>? = null
        private var requestedMemoryMiB: JsonField<Int>? = null
        private var requestedStorageGiB: JsonField<Int>? = null
        private var requestedVcpu: JsonField<Double>? = null
        private var specFingerprint: JsonField<String>? = null
        private var stripeCpuIdentifiers: JsonField<MutableList<String>>? = null
        private var stripeMemoryIdentifiers: JsonField<MutableList<String>>? = null
        private var windowCount: JsonField<Long>? = null
        private var latestStripeEmittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(machineComputeUsageRow: MachineComputeUsageRow) = apply {
            awakeSeconds = machineComputeUsageRow.awakeSeconds
            bucketEnd = machineComputeUsageRow.bucketEnd
            bucketStart = machineComputeUsageRow.bucketStart
            cpuMillicoreSeconds = machineComputeUsageRow.cpuMillicoreSeconds
            lastWindowEnd = machineComputeUsageRow.lastWindowEnd
            machineId = machineComputeUsageRow.machineId
            memoryMiBSeconds = machineComputeUsageRow.memoryMiBSeconds
            orgMeteringBucketIds =
                machineComputeUsageRow.orgMeteringBucketIds.map { it.toMutableList() }
            requestedMemoryMiB = machineComputeUsageRow.requestedMemoryMiB
            requestedStorageGiB = machineComputeUsageRow.requestedStorageGiB
            requestedVcpu = machineComputeUsageRow.requestedVcpu
            specFingerprint = machineComputeUsageRow.specFingerprint
            stripeCpuIdentifiers =
                machineComputeUsageRow.stripeCpuIdentifiers.map { it.toMutableList() }
            stripeMemoryIdentifiers =
                machineComputeUsageRow.stripeMemoryIdentifiers.map { it.toMutableList() }
            windowCount = machineComputeUsageRow.windowCount
            latestStripeEmittedAt = machineComputeUsageRow.latestStripeEmittedAt
            additionalProperties = machineComputeUsageRow.additionalProperties.toMutableMap()
        }

        /** Machine-awake seconds in this bucket. */
        fun awakeSeconds(awakeSeconds: Long) = awakeSeconds(JsonField.of(awakeSeconds))

        /**
         * Sets [Builder.awakeSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awakeSeconds] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun awakeSeconds(awakeSeconds: JsonField<Long>) = apply { this.awakeSeconds = awakeSeconds }

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

        /** Requested vCPU millicores multiplied by guest-owned active CPU seconds. */
        fun cpuMillicoreSeconds(cpuMillicoreSeconds: Long) =
            cpuMillicoreSeconds(JsonField.of(cpuMillicoreSeconds))

        /**
         * Sets [Builder.cpuMillicoreSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cpuMillicoreSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cpuMillicoreSeconds(cpuMillicoreSeconds: JsonField<Long>) = apply {
            this.cpuMillicoreSeconds = cpuMillicoreSeconds
        }

        /** Latest raw window_end represented by this row. */
        fun lastWindowEnd(lastWindowEnd: OffsetDateTime) =
            lastWindowEnd(JsonField.of(lastWindowEnd))

        /**
         * Sets [Builder.lastWindowEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastWindowEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastWindowEnd(lastWindowEnd: JsonField<OffsetDateTime>) = apply {
            this.lastWindowEnd = lastWindowEnd
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

        /** Requested memory MiB multiplied by running allocation seconds. */
        fun memoryMiBSeconds(memoryMiBSeconds: Long) =
            memoryMiBSeconds(JsonField.of(memoryMiBSeconds))

        /**
         * Sets [Builder.memoryMiBSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memoryMiBSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun memoryMiBSeconds(memoryMiBSeconds: JsonField<Long>) = apply {
            this.memoryMiBSeconds = memoryMiBSeconds
        }

        /** Org compute bucket IDs this row contributes to. */
        fun orgMeteringBucketIds(orgMeteringBucketIds: List<String>?) =
            orgMeteringBucketIds(JsonField.ofNullable(orgMeteringBucketIds))

        /**
         * Alias for calling [Builder.orgMeteringBucketIds] with
         * `orgMeteringBucketIds.orElse(null)`.
         */
        fun orgMeteringBucketIds(orgMeteringBucketIds: Optional<List<String>>) =
            orgMeteringBucketIds(orgMeteringBucketIds.getOrNull())

        /**
         * Sets [Builder.orgMeteringBucketIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgMeteringBucketIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun orgMeteringBucketIds(orgMeteringBucketIds: JsonField<List<String>>) = apply {
            this.orgMeteringBucketIds = orgMeteringBucketIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [orgMeteringBucketIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOrgMeteringBucketId(orgMeteringBucketId: String) = apply {
            orgMeteringBucketIds =
                (orgMeteringBucketIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("orgMeteringBucketIds", it).add(orgMeteringBucketId)
                }
        }

        /** Requested memory for this shape, in MiB. */
        fun requestedMemoryMiB(requestedMemoryMiB: Int) =
            requestedMemoryMiB(JsonField.of(requestedMemoryMiB))

        /**
         * Sets [Builder.requestedMemoryMiB] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedMemoryMiB] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestedMemoryMiB(requestedMemoryMiB: JsonField<Int>) = apply {
            this.requestedMemoryMiB = requestedMemoryMiB
        }

        /** Requested storage for this shape, in GiB. */
        fun requestedStorageGiB(requestedStorageGiB: Int) =
            requestedStorageGiB(JsonField.of(requestedStorageGiB))

        /**
         * Sets [Builder.requestedStorageGiB] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedStorageGiB] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestedStorageGiB(requestedStorageGiB: JsonField<Int>) = apply {
            this.requestedStorageGiB = requestedStorageGiB
        }

        /** Requested vCPU for this shape. */
        fun requestedVcpu(requestedVcpu: Double) = requestedVcpu(JsonField.of(requestedVcpu))

        /**
         * Sets [Builder.requestedVcpu] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedVcpu] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestedVcpu(requestedVcpu: JsonField<Double>) = apply {
            this.requestedVcpu = requestedVcpu
        }

        /** Stable fingerprint for the requested machine shape. */
        fun specFingerprint(specFingerprint: String) =
            specFingerprint(JsonField.of(specFingerprint))

        /**
         * Sets [Builder.specFingerprint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specFingerprint] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun specFingerprint(specFingerprint: JsonField<String>) = apply {
            this.specFingerprint = specFingerprint
        }

        /** Stripe CPU meter event identifiers linked to those org buckets. */
        fun stripeCpuIdentifiers(stripeCpuIdentifiers: List<String>?) =
            stripeCpuIdentifiers(JsonField.ofNullable(stripeCpuIdentifiers))

        /**
         * Alias for calling [Builder.stripeCpuIdentifiers] with
         * `stripeCpuIdentifiers.orElse(null)`.
         */
        fun stripeCpuIdentifiers(stripeCpuIdentifiers: Optional<List<String>>) =
            stripeCpuIdentifiers(stripeCpuIdentifiers.getOrNull())

        /**
         * Sets [Builder.stripeCpuIdentifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stripeCpuIdentifiers] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun stripeCpuIdentifiers(stripeCpuIdentifiers: JsonField<List<String>>) = apply {
            this.stripeCpuIdentifiers = stripeCpuIdentifiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [stripeCpuIdentifiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStripeCpuIdentifier(stripeCpuIdentifier: String) = apply {
            stripeCpuIdentifiers =
                (stripeCpuIdentifiers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("stripeCpuIdentifiers", it).add(stripeCpuIdentifier)
                }
        }

        /** Stripe memory meter event identifiers linked to those org buckets. */
        fun stripeMemoryIdentifiers(stripeMemoryIdentifiers: List<String>?) =
            stripeMemoryIdentifiers(JsonField.ofNullable(stripeMemoryIdentifiers))

        /**
         * Alias for calling [Builder.stripeMemoryIdentifiers] with
         * `stripeMemoryIdentifiers.orElse(null)`.
         */
        fun stripeMemoryIdentifiers(stripeMemoryIdentifiers: Optional<List<String>>) =
            stripeMemoryIdentifiers(stripeMemoryIdentifiers.getOrNull())

        /**
         * Sets [Builder.stripeMemoryIdentifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stripeMemoryIdentifiers] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun stripeMemoryIdentifiers(stripeMemoryIdentifiers: JsonField<List<String>>) = apply {
            this.stripeMemoryIdentifiers = stripeMemoryIdentifiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [stripeMemoryIdentifiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStripeMemoryIdentifier(stripeMemoryIdentifier: String) = apply {
            stripeMemoryIdentifiers =
                (stripeMemoryIdentifiers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("stripeMemoryIdentifiers", it).add(stripeMemoryIdentifier)
                }
        }

        /** Raw usage windows compacted into this row. */
        fun windowCount(windowCount: Long) = windowCount(JsonField.of(windowCount))

        /**
         * Sets [Builder.windowCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.windowCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun windowCount(windowCount: JsonField<Long>) = apply { this.windowCount = windowCount }

        /** Latest Stripe emission timestamp for linked org buckets, when emitted. */
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
         * Returns an immutable instance of [MachineComputeUsageRow].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .awakeSeconds()
         * .bucketEnd()
         * .bucketStart()
         * .cpuMillicoreSeconds()
         * .lastWindowEnd()
         * .machineId()
         * .memoryMiBSeconds()
         * .orgMeteringBucketIds()
         * .requestedMemoryMiB()
         * .requestedStorageGiB()
         * .requestedVcpu()
         * .specFingerprint()
         * .stripeCpuIdentifiers()
         * .stripeMemoryIdentifiers()
         * .windowCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MachineComputeUsageRow =
            MachineComputeUsageRow(
                checkRequired("awakeSeconds", awakeSeconds),
                checkRequired("bucketEnd", bucketEnd),
                checkRequired("bucketStart", bucketStart),
                checkRequired("cpuMillicoreSeconds", cpuMillicoreSeconds),
                checkRequired("lastWindowEnd", lastWindowEnd),
                checkRequired("machineId", machineId),
                checkRequired("memoryMiBSeconds", memoryMiBSeconds),
                checkRequired("orgMeteringBucketIds", orgMeteringBucketIds).map {
                    it.toImmutable()
                },
                checkRequired("requestedMemoryMiB", requestedMemoryMiB),
                checkRequired("requestedStorageGiB", requestedStorageGiB),
                checkRequired("requestedVcpu", requestedVcpu),
                checkRequired("specFingerprint", specFingerprint),
                checkRequired("stripeCpuIdentifiers", stripeCpuIdentifiers).map {
                    it.toImmutable()
                },
                checkRequired("stripeMemoryIdentifiers", stripeMemoryIdentifiers).map {
                    it.toImmutable()
                },
                checkRequired("windowCount", windowCount),
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
    fun validate(): MachineComputeUsageRow = apply {
        if (validated) {
            return@apply
        }

        awakeSeconds()
        bucketEnd()
        bucketStart()
        cpuMillicoreSeconds()
        lastWindowEnd()
        machineId()
        memoryMiBSeconds()
        orgMeteringBucketIds()
        requestedMemoryMiB()
        requestedStorageGiB()
        requestedVcpu()
        specFingerprint()
        stripeCpuIdentifiers()
        stripeMemoryIdentifiers()
        windowCount()
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
        (if (awakeSeconds.asKnown().isPresent) 1 else 0) +
            (if (bucketEnd.asKnown().isPresent) 1 else 0) +
            (if (bucketStart.asKnown().isPresent) 1 else 0) +
            (if (cpuMillicoreSeconds.asKnown().isPresent) 1 else 0) +
            (if (lastWindowEnd.asKnown().isPresent) 1 else 0) +
            (if (machineId.asKnown().isPresent) 1 else 0) +
            (if (memoryMiBSeconds.asKnown().isPresent) 1 else 0) +
            (orgMeteringBucketIds.asKnown().getOrNull()?.size ?: 0) +
            (if (requestedMemoryMiB.asKnown().isPresent) 1 else 0) +
            (if (requestedStorageGiB.asKnown().isPresent) 1 else 0) +
            (if (requestedVcpu.asKnown().isPresent) 1 else 0) +
            (if (specFingerprint.asKnown().isPresent) 1 else 0) +
            (stripeCpuIdentifiers.asKnown().getOrNull()?.size ?: 0) +
            (stripeMemoryIdentifiers.asKnown().getOrNull()?.size ?: 0) +
            (if (windowCount.asKnown().isPresent) 1 else 0) +
            (if (latestStripeEmittedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MachineComputeUsageRow &&
            awakeSeconds == other.awakeSeconds &&
            bucketEnd == other.bucketEnd &&
            bucketStart == other.bucketStart &&
            cpuMillicoreSeconds == other.cpuMillicoreSeconds &&
            lastWindowEnd == other.lastWindowEnd &&
            machineId == other.machineId &&
            memoryMiBSeconds == other.memoryMiBSeconds &&
            orgMeteringBucketIds == other.orgMeteringBucketIds &&
            requestedMemoryMiB == other.requestedMemoryMiB &&
            requestedStorageGiB == other.requestedStorageGiB &&
            requestedVcpu == other.requestedVcpu &&
            specFingerprint == other.specFingerprint &&
            stripeCpuIdentifiers == other.stripeCpuIdentifiers &&
            stripeMemoryIdentifiers == other.stripeMemoryIdentifiers &&
            windowCount == other.windowCount &&
            latestStripeEmittedAt == other.latestStripeEmittedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            awakeSeconds,
            bucketEnd,
            bucketStart,
            cpuMillicoreSeconds,
            lastWindowEnd,
            machineId,
            memoryMiBSeconds,
            orgMeteringBucketIds,
            requestedMemoryMiB,
            requestedStorageGiB,
            requestedVcpu,
            specFingerprint,
            stripeCpuIdentifiers,
            stripeMemoryIdentifiers,
            windowCount,
            latestStripeEmittedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MachineComputeUsageRow{awakeSeconds=$awakeSeconds, bucketEnd=$bucketEnd, bucketStart=$bucketStart, cpuMillicoreSeconds=$cpuMillicoreSeconds, lastWindowEnd=$lastWindowEnd, machineId=$machineId, memoryMiBSeconds=$memoryMiBSeconds, orgMeteringBucketIds=$orgMeteringBucketIds, requestedMemoryMiB=$requestedMemoryMiB, requestedStorageGiB=$requestedStorageGiB, requestedVcpu=$requestedVcpu, specFingerprint=$specFingerprint, stripeCpuIdentifiers=$stripeCpuIdentifiers, stripeMemoryIdentifiers=$stripeMemoryIdentifiers, windowCount=$windowCount, latestStripeEmittedAt=$latestStripeEmittedAt, additionalProperties=$additionalProperties}"
}
