// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

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

class Machine
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val autosleepSeconds: JsonField<Long>,
    private val desiredState: JsonField<DesiredState>,
    private val machineId: JsonField<String>,
    private val memoryMiB: JsonField<Long>,
    private val status: JsonField<LifecycleStatus>,
    private val storageGiB: JsonField<Long>,
    private val vcpu: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("autosleep_seconds")
        @ExcludeMissing
        autosleepSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("desired_state")
        @ExcludeMissing
        desiredState: JsonField<DesiredState> = JsonMissing.of(),
        @JsonProperty("machine_id") @ExcludeMissing machineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memory_mib") @ExcludeMissing memoryMiB: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<LifecycleStatus> = JsonMissing.of(),
        @JsonProperty("storage_gib") @ExcludeMissing storageGiB: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vcpu") @ExcludeMissing vcpu: JsonField<Double> = JsonMissing.of(),
    ) : this(
        autosleepSeconds,
        desiredState,
        machineId,
        memoryMiB,
        status,
        storageGiB,
        vcpu,
        mutableMapOf(),
    )

    /**
     * Seconds of inactivity before autosleep. 0 disables autosleep.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun autosleepSeconds(): Long = autosleepSeconds.getRequired("autosleep_seconds")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun desiredState(): DesiredState = desiredState.getRequired("desired_state")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun machineId(): String = machineId.getRequired("machine_id")

    /**
     * Memory in MiB.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun memoryMiB(): Long = memoryMiB.getRequired("memory_mib")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): LifecycleStatus = status.getRequired("status")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun storageGiB(): Long = storageGiB.getRequired("storage_gib")

    /**
     * CPU in vCPUs.
     *
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vcpu(): Double = vcpu.getRequired("vcpu")

    /**
     * Returns the raw JSON value of [autosleepSeconds].
     *
     * Unlike [autosleepSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("autosleep_seconds")
    @ExcludeMissing
    fun _autosleepSeconds(): JsonField<Long> = autosleepSeconds

    /**
     * Returns the raw JSON value of [desiredState].
     *
     * Unlike [desiredState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("desired_state")
    @ExcludeMissing
    fun _desiredState(): JsonField<DesiredState> = desiredState

    /**
     * Returns the raw JSON value of [machineId].
     *
     * Unlike [machineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("machine_id") @ExcludeMissing fun _machineId(): JsonField<String> = machineId

    /**
     * Returns the raw JSON value of [memoryMiB].
     *
     * Unlike [memoryMiB], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memory_mib") @ExcludeMissing fun _memoryMiB(): JsonField<Long> = memoryMiB

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<LifecycleStatus> = status

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

        /**
         * Returns a mutable builder for constructing an instance of [Machine].
         *
         * The following fields are required:
         * ```java
         * .autosleepSeconds()
         * .desiredState()
         * .machineId()
         * .memoryMiB()
         * .status()
         * .storageGiB()
         * .vcpu()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Machine]. */
    class Builder internal constructor() {

        private var autosleepSeconds: JsonField<Long>? = null
        private var desiredState: JsonField<DesiredState>? = null
        private var machineId: JsonField<String>? = null
        private var memoryMiB: JsonField<Long>? = null
        private var status: JsonField<LifecycleStatus>? = null
        private var storageGiB: JsonField<Long>? = null
        private var vcpu: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(machine: Machine) = apply {
            autosleepSeconds = machine.autosleepSeconds
            desiredState = machine.desiredState
            machineId = machine.machineId
            memoryMiB = machine.memoryMiB
            status = machine.status
            storageGiB = machine.storageGiB
            vcpu = machine.vcpu
            additionalProperties = machine.additionalProperties.toMutableMap()
        }

        /** Seconds of inactivity before autosleep. 0 disables autosleep. */
        fun autosleepSeconds(autosleepSeconds: Long) =
            autosleepSeconds(JsonField.of(autosleepSeconds))

        /**
         * Sets [Builder.autosleepSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autosleepSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autosleepSeconds(autosleepSeconds: JsonField<Long>) = apply {
            this.autosleepSeconds = autosleepSeconds
        }

        fun desiredState(desiredState: DesiredState) = desiredState(JsonField.of(desiredState))

        /**
         * Sets [Builder.desiredState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.desiredState] with a well-typed [DesiredState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun desiredState(desiredState: JsonField<DesiredState>) = apply {
            this.desiredState = desiredState
        }

        fun machineId(machineId: String) = machineId(JsonField.of(machineId))

        /**
         * Sets [Builder.machineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun machineId(machineId: JsonField<String>) = apply { this.machineId = machineId }

        /** Memory in MiB. */
        fun memoryMiB(memoryMiB: Long) = memoryMiB(JsonField.of(memoryMiB))

        /**
         * Sets [Builder.memoryMiB] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memoryMiB] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memoryMiB(memoryMiB: JsonField<Long>) = apply { this.memoryMiB = memoryMiB }

        fun status(status: LifecycleStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [LifecycleStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<LifecycleStatus>) = apply { this.status = status }

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
         * Returns an immutable instance of [Machine].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .autosleepSeconds()
         * .desiredState()
         * .machineId()
         * .memoryMiB()
         * .status()
         * .storageGiB()
         * .vcpu()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Machine =
            Machine(
                checkRequired("autosleepSeconds", autosleepSeconds),
                checkRequired("desiredState", desiredState),
                checkRequired("machineId", machineId),
                checkRequired("memoryMiB", memoryMiB),
                checkRequired("status", status),
                checkRequired("storageGiB", storageGiB),
                checkRequired("vcpu", vcpu),
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
    fun validate(): Machine = apply {
        if (validated) {
            return@apply
        }

        autosleepSeconds()
        desiredState().validate()
        machineId()
        memoryMiB()
        status().validate()
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
        (if (autosleepSeconds.asKnown().isPresent) 1 else 0) +
            (desiredState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (machineId.asKnown().isPresent) 1 else 0) +
            (if (memoryMiB.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (storageGiB.asKnown().isPresent) 1 else 0) +
            (if (vcpu.asKnown().isPresent) 1 else 0)

    class DesiredState @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val RUNNING = of("running")

            @JvmField val SLEEPING = of("sleeping")

            @JvmField val DESTROYED = of("destroyed")

            @JvmStatic fun of(value: String) = DesiredState(JsonField.of(value))
        }

        /** An enum containing [DesiredState]'s known values. */
        enum class Known {
            RUNNING,
            SLEEPING,
            DESTROYED,
        }

        /**
         * An enum containing [DesiredState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DesiredState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RUNNING,
            SLEEPING,
            DESTROYED,
            /**
             * An enum member indicating that [DesiredState] was instantiated with an unknown value.
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
                RUNNING -> Value.RUNNING
                SLEEPING -> Value.SLEEPING
                DESTROYED -> Value.DESTROYED
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
                RUNNING -> Known.RUNNING
                SLEEPING -> Known.SLEEPING
                DESTROYED -> Known.DESTROYED
                else -> throw DedalusInvalidDataException("Unknown DesiredState: $value")
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
        fun validate(): DesiredState = apply {
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

            return other is DesiredState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Machine &&
            autosleepSeconds == other.autosleepSeconds &&
            desiredState == other.desiredState &&
            machineId == other.machineId &&
            memoryMiB == other.memoryMiB &&
            status == other.status &&
            storageGiB == other.storageGiB &&
            vcpu == other.vcpu &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            autosleepSeconds,
            desiredState,
            machineId,
            memoryMiB,
            status,
            storageGiB,
            vcpu,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Machine{autosleepSeconds=$autosleepSeconds, desiredState=$desiredState, machineId=$machineId, memoryMiB=$memoryMiB, status=$status, storageGiB=$storageGiB, vcpu=$vcpu, additionalProperties=$additionalProperties}"
}
