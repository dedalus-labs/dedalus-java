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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LifecycleStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lastProgressAt: JsonField<OffsetDateTime>,
    private val lastTransitionAt: JsonField<OffsetDateTime>,
    private val phase: JsonField<Phase>,
    private val reason: JsonField<String>,
    private val retryable: JsonField<Boolean>,
    private val revision: JsonField<String>,
    private val lastError: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("last_progress_at")
        @ExcludeMissing
        lastProgressAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_transition_at")
        @ExcludeMissing
        lastTransitionAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("phase") @ExcludeMissing phase: JsonField<Phase> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retryable") @ExcludeMissing retryable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("revision") @ExcludeMissing revision: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_error") @ExcludeMissing lastError: JsonField<String> = JsonMissing.of(),
    ) : this(
        lastProgressAt,
        lastTransitionAt,
        phase,
        reason,
        retryable,
        revision,
        lastError,
        mutableMapOf(),
    )

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastProgressAt(): OffsetDateTime = lastProgressAt.getRequired("last_progress_at")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastTransitionAt(): OffsetDateTime = lastTransitionAt.getRequired("last_transition_at")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phase(): Phase = phase.getRequired("phase")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reason(): String = reason.getRequired("reason")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun retryable(): Boolean = retryable.getRequired("retryable")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun revision(): String = revision.getRequired("revision")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastError(): Optional<String> = lastError.getOptional("last_error")

    /**
     * Returns the raw JSON value of [lastProgressAt].
     *
     * Unlike [lastProgressAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_progress_at")
    @ExcludeMissing
    fun _lastProgressAt(): JsonField<OffsetDateTime> = lastProgressAt

    /**
     * Returns the raw JSON value of [lastTransitionAt].
     *
     * Unlike [lastTransitionAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_transition_at")
    @ExcludeMissing
    fun _lastTransitionAt(): JsonField<OffsetDateTime> = lastTransitionAt

    /**
     * Returns the raw JSON value of [phase].
     *
     * Unlike [phase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phase") @ExcludeMissing fun _phase(): JsonField<Phase> = phase

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [retryable].
     *
     * Unlike [retryable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retryable") @ExcludeMissing fun _retryable(): JsonField<Boolean> = retryable

    /**
     * Returns the raw JSON value of [revision].
     *
     * Unlike [revision], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revision") @ExcludeMissing fun _revision(): JsonField<String> = revision

    /**
     * Returns the raw JSON value of [lastError].
     *
     * Unlike [lastError], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_error") @ExcludeMissing fun _lastError(): JsonField<String> = lastError

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
         * Returns a mutable builder for constructing an instance of [LifecycleStatus].
         *
         * The following fields are required:
         * ```java
         * .lastProgressAt()
         * .lastTransitionAt()
         * .phase()
         * .reason()
         * .retryable()
         * .revision()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LifecycleStatus]. */
    class Builder internal constructor() {

        private var lastProgressAt: JsonField<OffsetDateTime>? = null
        private var lastTransitionAt: JsonField<OffsetDateTime>? = null
        private var phase: JsonField<Phase>? = null
        private var reason: JsonField<String>? = null
        private var retryable: JsonField<Boolean>? = null
        private var revision: JsonField<String>? = null
        private var lastError: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lifecycleStatus: LifecycleStatus) = apply {
            lastProgressAt = lifecycleStatus.lastProgressAt
            lastTransitionAt = lifecycleStatus.lastTransitionAt
            phase = lifecycleStatus.phase
            reason = lifecycleStatus.reason
            retryable = lifecycleStatus.retryable
            revision = lifecycleStatus.revision
            lastError = lifecycleStatus.lastError
            additionalProperties = lifecycleStatus.additionalProperties.toMutableMap()
        }

        fun lastProgressAt(lastProgressAt: OffsetDateTime) =
            lastProgressAt(JsonField.of(lastProgressAt))

        /**
         * Sets [Builder.lastProgressAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastProgressAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastProgressAt(lastProgressAt: JsonField<OffsetDateTime>) = apply {
            this.lastProgressAt = lastProgressAt
        }

        fun lastTransitionAt(lastTransitionAt: OffsetDateTime) =
            lastTransitionAt(JsonField.of(lastTransitionAt))

        /**
         * Sets [Builder.lastTransitionAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastTransitionAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastTransitionAt(lastTransitionAt: JsonField<OffsetDateTime>) = apply {
            this.lastTransitionAt = lastTransitionAt
        }

        fun phase(phase: Phase) = phase(JsonField.of(phase))

        /**
         * Sets [Builder.phase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phase] with a well-typed [Phase] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phase(phase: JsonField<Phase>) = apply { this.phase = phase }

        fun reason(reason: String) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        fun retryable(retryable: Boolean) = retryable(JsonField.of(retryable))

        /**
         * Sets [Builder.retryable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retryable(retryable: JsonField<Boolean>) = apply { this.retryable = retryable }

        fun revision(revision: String) = revision(JsonField.of(revision))

        /**
         * Sets [Builder.revision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revision] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revision(revision: JsonField<String>) = apply { this.revision = revision }

        fun lastError(lastError: String) = lastError(JsonField.of(lastError))

        /**
         * Sets [Builder.lastError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastError] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastError(lastError: JsonField<String>) = apply { this.lastError = lastError }

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
         * Returns an immutable instance of [LifecycleStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lastProgressAt()
         * .lastTransitionAt()
         * .phase()
         * .reason()
         * .retryable()
         * .revision()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LifecycleStatus =
            LifecycleStatus(
                checkRequired("lastProgressAt", lastProgressAt),
                checkRequired("lastTransitionAt", lastTransitionAt),
                checkRequired("phase", phase),
                checkRequired("reason", reason),
                checkRequired("retryable", retryable),
                checkRequired("revision", revision),
                lastError,
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
    fun validate(): LifecycleStatus = apply {
        if (validated) {
            return@apply
        }

        lastProgressAt()
        lastTransitionAt()
        phase().validate()
        reason()
        retryable()
        revision()
        lastError()
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
        (if (lastProgressAt.asKnown().isPresent) 1 else 0) +
            (if (lastTransitionAt.asKnown().isPresent) 1 else 0) +
            (phase.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reason.asKnown().isPresent) 1 else 0) +
            (if (retryable.asKnown().isPresent) 1 else 0) +
            (if (revision.asKnown().isPresent) 1 else 0) +
            (if (lastError.asKnown().isPresent) 1 else 0)

    class Phase @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCEPTED = of("accepted")

            @JvmField val PLACEMENT_PENDING = of("placement_pending")

            @JvmField val STARTING = of("starting")

            @JvmField val RUNNING = of("running")

            @JvmField val STOPPING = of("stopping")

            @JvmField val SLEEPING = of("sleeping")

            @JvmField val DESTROYING = of("destroying")

            @JvmField val DESTROYED = of("destroyed")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Phase(JsonField.of(value))
        }

        /** An enum containing [Phase]'s known values. */
        enum class Known {
            ACCEPTED,
            PLACEMENT_PENDING,
            STARTING,
            RUNNING,
            STOPPING,
            SLEEPING,
            DESTROYING,
            DESTROYED,
            FAILED,
        }

        /**
         * An enum containing [Phase]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Phase] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCEPTED,
            PLACEMENT_PENDING,
            STARTING,
            RUNNING,
            STOPPING,
            SLEEPING,
            DESTROYING,
            DESTROYED,
            FAILED,
            /** An enum member indicating that [Phase] was instantiated with an unknown value. */
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
                ACCEPTED -> Value.ACCEPTED
                PLACEMENT_PENDING -> Value.PLACEMENT_PENDING
                STARTING -> Value.STARTING
                RUNNING -> Value.RUNNING
                STOPPING -> Value.STOPPING
                SLEEPING -> Value.SLEEPING
                DESTROYING -> Value.DESTROYING
                DESTROYED -> Value.DESTROYED
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
                ACCEPTED -> Known.ACCEPTED
                PLACEMENT_PENDING -> Known.PLACEMENT_PENDING
                STARTING -> Known.STARTING
                RUNNING -> Known.RUNNING
                STOPPING -> Known.STOPPING
                SLEEPING -> Known.SLEEPING
                DESTROYING -> Known.DESTROYING
                DESTROYED -> Known.DESTROYED
                FAILED -> Known.FAILED
                else -> throw DedalusInvalidDataException("Unknown Phase: $value")
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
        fun validate(): Phase = apply {
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

            return other is Phase && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LifecycleStatus &&
            lastProgressAt == other.lastProgressAt &&
            lastTransitionAt == other.lastTransitionAt &&
            phase == other.phase &&
            reason == other.reason &&
            retryable == other.retryable &&
            revision == other.revision &&
            lastError == other.lastError &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            lastProgressAt,
            lastTransitionAt,
            phase,
            reason,
            retryable,
            revision,
            lastError,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LifecycleStatus{lastProgressAt=$lastProgressAt, lastTransitionAt=$lastTransitionAt, phase=$phase, reason=$reason, retryable=$retryable, revision=$revision, lastError=$lastError, additionalProperties=$additionalProperties}"
}
