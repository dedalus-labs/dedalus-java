// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

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
import java.util.Optional

class ExecutionOutput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val executionId: JsonField<String>,
    private val stderr: JsonField<String>,
    private val stderrBytes: JsonField<Long>,
    private val stderrTruncated: JsonField<Boolean>,
    private val stdout: JsonField<String>,
    private val stdoutBytes: JsonField<Long>,
    private val stdoutTruncated: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("execution_id")
        @ExcludeMissing
        executionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stderr") @ExcludeMissing stderr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stderr_bytes")
        @ExcludeMissing
        stderrBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stderr_truncated")
        @ExcludeMissing
        stderrTruncated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("stdout") @ExcludeMissing stdout: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stdout_bytes")
        @ExcludeMissing
        stdoutBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stdout_truncated")
        @ExcludeMissing
        stdoutTruncated: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        executionId,
        stderr,
        stderrBytes,
        stderrTruncated,
        stdout,
        stdoutBytes,
        stdoutTruncated,
        mutableMapOf(),
    )

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun executionId(): String = executionId.getRequired("execution_id")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stderr(): Optional<String> = stderr.getOptional("stderr")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stderrBytes(): Optional<Long> = stderrBytes.getOptional("stderr_bytes")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stderrTruncated(): Optional<Boolean> = stderrTruncated.getOptional("stderr_truncated")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stdout(): Optional<String> = stdout.getOptional("stdout")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stdoutBytes(): Optional<Long> = stdoutBytes.getOptional("stdout_bytes")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stdoutTruncated(): Optional<Boolean> = stdoutTruncated.getOptional("stdout_truncated")

    /**
     * Returns the raw JSON value of [executionId].
     *
     * Unlike [executionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution_id")
    @ExcludeMissing
    fun _executionId(): JsonField<String> = executionId

    /**
     * Returns the raw JSON value of [stderr].
     *
     * Unlike [stderr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stderr") @ExcludeMissing fun _stderr(): JsonField<String> = stderr

    /**
     * Returns the raw JSON value of [stderrBytes].
     *
     * Unlike [stderrBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stderr_bytes") @ExcludeMissing fun _stderrBytes(): JsonField<Long> = stderrBytes

    /**
     * Returns the raw JSON value of [stderrTruncated].
     *
     * Unlike [stderrTruncated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stderr_truncated")
    @ExcludeMissing
    fun _stderrTruncated(): JsonField<Boolean> = stderrTruncated

    /**
     * Returns the raw JSON value of [stdout].
     *
     * Unlike [stdout], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stdout") @ExcludeMissing fun _stdout(): JsonField<String> = stdout

    /**
     * Returns the raw JSON value of [stdoutBytes].
     *
     * Unlike [stdoutBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stdout_bytes") @ExcludeMissing fun _stdoutBytes(): JsonField<Long> = stdoutBytes

    /**
     * Returns the raw JSON value of [stdoutTruncated].
     *
     * Unlike [stdoutTruncated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stdout_truncated")
    @ExcludeMissing
    fun _stdoutTruncated(): JsonField<Boolean> = stdoutTruncated

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
         * Returns a mutable builder for constructing an instance of [ExecutionOutput].
         *
         * The following fields are required:
         * ```java
         * .executionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExecutionOutput]. */
    class Builder internal constructor() {

        private var executionId: JsonField<String>? = null
        private var stderr: JsonField<String> = JsonMissing.of()
        private var stderrBytes: JsonField<Long> = JsonMissing.of()
        private var stderrTruncated: JsonField<Boolean> = JsonMissing.of()
        private var stdout: JsonField<String> = JsonMissing.of()
        private var stdoutBytes: JsonField<Long> = JsonMissing.of()
        private var stdoutTruncated: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(executionOutput: ExecutionOutput) = apply {
            executionId = executionOutput.executionId
            stderr = executionOutput.stderr
            stderrBytes = executionOutput.stderrBytes
            stderrTruncated = executionOutput.stderrTruncated
            stdout = executionOutput.stdout
            stdoutBytes = executionOutput.stdoutBytes
            stdoutTruncated = executionOutput.stdoutTruncated
            additionalProperties = executionOutput.additionalProperties.toMutableMap()
        }

        fun executionId(executionId: String) = executionId(JsonField.of(executionId))

        /**
         * Sets [Builder.executionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionId(executionId: JsonField<String>) = apply { this.executionId = executionId }

        fun stderr(stderr: String) = stderr(JsonField.of(stderr))

        /**
         * Sets [Builder.stderr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stderr] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stderr(stderr: JsonField<String>) = apply { this.stderr = stderr }

        fun stderrBytes(stderrBytes: Long) = stderrBytes(JsonField.of(stderrBytes))

        /**
         * Sets [Builder.stderrBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stderrBytes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stderrBytes(stderrBytes: JsonField<Long>) = apply { this.stderrBytes = stderrBytes }

        fun stderrTruncated(stderrTruncated: Boolean) =
            stderrTruncated(JsonField.of(stderrTruncated))

        /**
         * Sets [Builder.stderrTruncated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stderrTruncated] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stderrTruncated(stderrTruncated: JsonField<Boolean>) = apply {
            this.stderrTruncated = stderrTruncated
        }

        fun stdout(stdout: String) = stdout(JsonField.of(stdout))

        /**
         * Sets [Builder.stdout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stdout] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stdout(stdout: JsonField<String>) = apply { this.stdout = stdout }

        fun stdoutBytes(stdoutBytes: Long) = stdoutBytes(JsonField.of(stdoutBytes))

        /**
         * Sets [Builder.stdoutBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stdoutBytes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stdoutBytes(stdoutBytes: JsonField<Long>) = apply { this.stdoutBytes = stdoutBytes }

        fun stdoutTruncated(stdoutTruncated: Boolean) =
            stdoutTruncated(JsonField.of(stdoutTruncated))

        /**
         * Sets [Builder.stdoutTruncated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stdoutTruncated] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stdoutTruncated(stdoutTruncated: JsonField<Boolean>) = apply {
            this.stdoutTruncated = stdoutTruncated
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
         * Returns an immutable instance of [ExecutionOutput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .executionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExecutionOutput =
            ExecutionOutput(
                checkRequired("executionId", executionId),
                stderr,
                stderrBytes,
                stderrTruncated,
                stdout,
                stdoutBytes,
                stdoutTruncated,
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
    fun validate(): ExecutionOutput = apply {
        if (validated) {
            return@apply
        }

        executionId()
        stderr()
        stderrBytes()
        stderrTruncated()
        stdout()
        stdoutBytes()
        stdoutTruncated()
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
        (if (executionId.asKnown().isPresent) 1 else 0) +
            (if (stderr.asKnown().isPresent) 1 else 0) +
            (if (stderrBytes.asKnown().isPresent) 1 else 0) +
            (if (stderrTruncated.asKnown().isPresent) 1 else 0) +
            (if (stdout.asKnown().isPresent) 1 else 0) +
            (if (stdoutBytes.asKnown().isPresent) 1 else 0) +
            (if (stdoutTruncated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExecutionOutput &&
            executionId == other.executionId &&
            stderr == other.stderr &&
            stderrBytes == other.stderrBytes &&
            stderrTruncated == other.stderrTruncated &&
            stdout == other.stdout &&
            stdoutBytes == other.stdoutBytes &&
            stdoutTruncated == other.stdoutTruncated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            executionId,
            stderr,
            stderrBytes,
            stderrTruncated,
            stdout,
            stdoutBytes,
            stdoutTruncated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExecutionOutput{executionId=$executionId, stderr=$stderr, stderrBytes=$stderrBytes, stderrTruncated=$stderrTruncated, stdout=$stdout, stdoutBytes=$stdoutBytes, stdoutTruncated=$stdoutTruncated, additionalProperties=$additionalProperties}"
}
