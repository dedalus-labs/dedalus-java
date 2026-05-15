// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.Enum
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

class Execution
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val command: JsonField<List<String>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val executionId: JsonField<String>,
    private val machineId: JsonField<String>,
    private val status: JsonField<Status>,
    private val artifacts: JsonField<List<ArtifactRef>>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val cwd: JsonField<String>,
    private val envKeys: JsonField<List<String>>,
    private val errorCode: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val exitCode: JsonField<Long>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val retryAfterMs: JsonField<Long>,
    private val signal: JsonField<Long>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val stderrBytes: JsonField<Long>,
    private val stderrTruncated: JsonField<Boolean>,
    private val stdoutBytes: JsonField<Long>,
    private val stdoutTruncated: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("command")
        @ExcludeMissing
        command: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("execution_id")
        @ExcludeMissing
        executionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("machine_id") @ExcludeMissing machineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("artifacts")
        @ExcludeMissing
        artifacts: JsonField<List<ArtifactRef>> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cwd") @ExcludeMissing cwd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("env_keys")
        @ExcludeMissing
        envKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("error_code") @ExcludeMissing errorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exit_code") @ExcludeMissing exitCode: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("retry_after_ms")
        @ExcludeMissing
        retryAfterMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("signal") @ExcludeMissing signal: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("started_at")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("stderr_bytes")
        @ExcludeMissing
        stderrBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stderr_truncated")
        @ExcludeMissing
        stderrTruncated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("stdout_bytes")
        @ExcludeMissing
        stdoutBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stdout_truncated")
        @ExcludeMissing
        stdoutTruncated: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        command,
        createdAt,
        executionId,
        machineId,
        status,
        artifacts,
        completedAt,
        cwd,
        envKeys,
        errorCode,
        errorMessage,
        exitCode,
        expiresAt,
        retryAfterMs,
        signal,
        startedAt,
        stderrBytes,
        stderrTruncated,
        stdoutBytes,
        stdoutTruncated,
        mutableMapOf(),
    )

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun command(): Optional<List<String>> = command.getOptional("command")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun executionId(): String = executionId.getRequired("execution_id")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun machineId(): String = machineId.getRequired("machine_id")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun artifacts(): Optional<List<ArtifactRef>> = artifacts.getOptional("artifacts")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cwd(): Optional<String> = cwd.getOptional("cwd")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun envKeys(): Optional<List<String>> = envKeys.getOptional("env_keys")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exitCode(): Optional<Long> = exitCode.getOptional("exit_code")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retryAfterMs(): Optional<Long> = retryAfterMs.getOptional("retry_after_ms")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signal(): Optional<Long> = signal.getOptional("signal")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

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
    fun stdoutBytes(): Optional<Long> = stdoutBytes.getOptional("stdout_bytes")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stdoutTruncated(): Optional<Boolean> = stdoutTruncated.getOptional("stdout_truncated")

    /**
     * Returns the raw JSON value of [command].
     *
     * Unlike [command], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("command") @ExcludeMissing fun _command(): JsonField<List<String>> = command

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [executionId].
     *
     * Unlike [executionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution_id")
    @ExcludeMissing
    fun _executionId(): JsonField<String> = executionId

    /**
     * Returns the raw JSON value of [machineId].
     *
     * Unlike [machineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("machine_id") @ExcludeMissing fun _machineId(): JsonField<String> = machineId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [artifacts].
     *
     * Unlike [artifacts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("artifacts")
    @ExcludeMissing
    fun _artifacts(): JsonField<List<ArtifactRef>> = artifacts

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [cwd].
     *
     * Unlike [cwd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cwd") @ExcludeMissing fun _cwd(): JsonField<String> = cwd

    /**
     * Returns the raw JSON value of [envKeys].
     *
     * Unlike [envKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("env_keys") @ExcludeMissing fun _envKeys(): JsonField<List<String>> = envKeys

    /**
     * Returns the raw JSON value of [errorCode].
     *
     * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [exitCode].
     *
     * Unlike [exitCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exit_code") @ExcludeMissing fun _exitCode(): JsonField<Long> = exitCode

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [retryAfterMs].
     *
     * Unlike [retryAfterMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retry_after_ms")
    @ExcludeMissing
    fun _retryAfterMs(): JsonField<Long> = retryAfterMs

    /**
     * Returns the raw JSON value of [signal].
     *
     * Unlike [signal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signal") @ExcludeMissing fun _signal(): JsonField<Long> = signal

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

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
         * Returns a mutable builder for constructing an instance of [Execution].
         *
         * The following fields are required:
         * ```java
         * .command()
         * .createdAt()
         * .executionId()
         * .machineId()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Execution]. */
    class Builder internal constructor() {

        private var command: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var executionId: JsonField<String>? = null
        private var machineId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var artifacts: JsonField<MutableList<ArtifactRef>>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var cwd: JsonField<String> = JsonMissing.of()
        private var envKeys: JsonField<MutableList<String>>? = null
        private var errorCode: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var exitCode: JsonField<Long> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var retryAfterMs: JsonField<Long> = JsonMissing.of()
        private var signal: JsonField<Long> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stderrBytes: JsonField<Long> = JsonMissing.of()
        private var stderrTruncated: JsonField<Boolean> = JsonMissing.of()
        private var stdoutBytes: JsonField<Long> = JsonMissing.of()
        private var stdoutTruncated: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(execution: Execution) = apply {
            command = execution.command.map { it.toMutableList() }
            createdAt = execution.createdAt
            executionId = execution.executionId
            machineId = execution.machineId
            status = execution.status
            artifacts = execution.artifacts.map { it.toMutableList() }
            completedAt = execution.completedAt
            cwd = execution.cwd
            envKeys = execution.envKeys.map { it.toMutableList() }
            errorCode = execution.errorCode
            errorMessage = execution.errorMessage
            exitCode = execution.exitCode
            expiresAt = execution.expiresAt
            retryAfterMs = execution.retryAfterMs
            signal = execution.signal
            startedAt = execution.startedAt
            stderrBytes = execution.stderrBytes
            stderrTruncated = execution.stderrTruncated
            stdoutBytes = execution.stdoutBytes
            stdoutTruncated = execution.stdoutTruncated
            additionalProperties = execution.additionalProperties.toMutableMap()
        }

        fun command(command: List<String>?) = command(JsonField.ofNullable(command))

        /** Alias for calling [Builder.command] with `command.orElse(null)`. */
        fun command(command: Optional<List<String>>) = command(command.getOrNull())

        /**
         * Sets [Builder.command] to an arbitrary JSON value.
         *
         * You should usually call [Builder.command] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun command(command: JsonField<List<String>>) = apply {
            this.command = command.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.command].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCommand(command: String) = apply {
            this.command =
                (this.command ?: JsonField.of(mutableListOf())).also {
                    checkKnown("command", it).add(command)
                }
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun executionId(executionId: String) = executionId(JsonField.of(executionId))

        /**
         * Sets [Builder.executionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionId(executionId: JsonField<String>) = apply { this.executionId = executionId }

        fun machineId(machineId: String) = machineId(JsonField.of(machineId))

        /**
         * Sets [Builder.machineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun machineId(machineId: JsonField<String>) = apply { this.machineId = machineId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun artifacts(artifacts: List<ArtifactRef>?) = artifacts(JsonField.ofNullable(artifacts))

        /** Alias for calling [Builder.artifacts] with `artifacts.orElse(null)`. */
        fun artifacts(artifacts: Optional<List<ArtifactRef>>) = artifacts(artifacts.getOrNull())

        /**
         * Sets [Builder.artifacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artifacts] with a well-typed `List<ArtifactRef>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun artifacts(artifacts: JsonField<List<ArtifactRef>>) = apply {
            this.artifacts = artifacts.map { it.toMutableList() }
        }

        /**
         * Adds a single [ArtifactRef] to [artifacts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addArtifact(artifact: ArtifactRef) = apply {
            artifacts =
                (artifacts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("artifacts", it).add(artifact)
                }
        }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun cwd(cwd: String) = cwd(JsonField.of(cwd))

        /**
         * Sets [Builder.cwd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cwd] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cwd(cwd: JsonField<String>) = apply { this.cwd = cwd }

        fun envKeys(envKeys: List<String>?) = envKeys(JsonField.ofNullable(envKeys))

        /** Alias for calling [Builder.envKeys] with `envKeys.orElse(null)`. */
        fun envKeys(envKeys: Optional<List<String>>) = envKeys(envKeys.getOrNull())

        /**
         * Sets [Builder.envKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.envKeys] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun envKeys(envKeys: JsonField<List<String>>) = apply {
            this.envKeys = envKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [envKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnvKey(envKey: String) = apply {
            envKeys =
                (envKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("envKeys", it).add(envKey)
                }
        }

        fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

        /**
         * Sets [Builder.errorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        fun exitCode(exitCode: Long) = exitCode(JsonField.of(exitCode))

        /**
         * Sets [Builder.exitCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exitCode] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exitCode(exitCode: JsonField<Long>) = apply { this.exitCode = exitCode }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        fun retryAfterMs(retryAfterMs: Long) = retryAfterMs(JsonField.of(retryAfterMs))

        /**
         * Sets [Builder.retryAfterMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryAfterMs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retryAfterMs(retryAfterMs: JsonField<Long>) = apply { this.retryAfterMs = retryAfterMs }

        fun signal(signal: Long) = signal(JsonField.of(signal))

        /**
         * Sets [Builder.signal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signal] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun signal(signal: JsonField<Long>) = apply { this.signal = signal }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

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
         * Returns an immutable instance of [Execution].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .command()
         * .createdAt()
         * .executionId()
         * .machineId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Execution =
            Execution(
                checkRequired("command", command).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("executionId", executionId),
                checkRequired("machineId", machineId),
                checkRequired("status", status),
                (artifacts ?: JsonMissing.of()).map { it.toImmutable() },
                completedAt,
                cwd,
                (envKeys ?: JsonMissing.of()).map { it.toImmutable() },
                errorCode,
                errorMessage,
                exitCode,
                expiresAt,
                retryAfterMs,
                signal,
                startedAt,
                stderrBytes,
                stderrTruncated,
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
    fun validate(): Execution = apply {
        if (validated) {
            return@apply
        }

        command()
        createdAt()
        executionId()
        machineId()
        status().validate()
        artifacts().ifPresent { it.forEach { it.validate() } }
        completedAt()
        cwd()
        envKeys()
        errorCode()
        errorMessage()
        exitCode()
        expiresAt()
        retryAfterMs()
        signal()
        startedAt()
        stderrBytes()
        stderrTruncated()
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
        (command.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (executionId.asKnown().isPresent) 1 else 0) +
            (if (machineId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (artifacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (if (cwd.asKnown().isPresent) 1 else 0) +
            (envKeys.asKnown().getOrNull()?.size ?: 0) +
            (if (errorCode.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (exitCode.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (retryAfterMs.asKnown().isPresent) 1 else 0) +
            (if (signal.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (if (stderrBytes.asKnown().isPresent) 1 else 0) +
            (if (stderrTruncated.asKnown().isPresent) 1 else 0) +
            (if (stdoutBytes.asKnown().isPresent) 1 else 0) +
            (if (stdoutTruncated.asKnown().isPresent) 1 else 0)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WAKE_IN_PROGRESS = of("wake_in_progress")

            @JvmField val QUEUED = of("queued")

            @JvmField val RUNNING = of("running")

            @JvmField val SUCCEEDED = of("succeeded")

            @JvmField val FAILED = of("failed")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val EXPIRED = of("expired")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            WAKE_IN_PROGRESS,
            QUEUED,
            RUNNING,
            SUCCEEDED,
            FAILED,
            CANCELLED,
            EXPIRED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WAKE_IN_PROGRESS,
            QUEUED,
            RUNNING,
            SUCCEEDED,
            FAILED,
            CANCELLED,
            EXPIRED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                WAKE_IN_PROGRESS -> Value.WAKE_IN_PROGRESS
                QUEUED -> Value.QUEUED
                RUNNING -> Value.RUNNING
                SUCCEEDED -> Value.SUCCEEDED
                FAILED -> Value.FAILED
                CANCELLED -> Value.CANCELLED
                EXPIRED -> Value.EXPIRED
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
                WAKE_IN_PROGRESS -> Known.WAKE_IN_PROGRESS
                QUEUED -> Known.QUEUED
                RUNNING -> Known.RUNNING
                SUCCEEDED -> Known.SUCCEEDED
                FAILED -> Known.FAILED
                CANCELLED -> Known.CANCELLED
                EXPIRED -> Known.EXPIRED
                else -> throw DedalusInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Execution &&
            command == other.command &&
            createdAt == other.createdAt &&
            executionId == other.executionId &&
            machineId == other.machineId &&
            status == other.status &&
            artifacts == other.artifacts &&
            completedAt == other.completedAt &&
            cwd == other.cwd &&
            envKeys == other.envKeys &&
            errorCode == other.errorCode &&
            errorMessage == other.errorMessage &&
            exitCode == other.exitCode &&
            expiresAt == other.expiresAt &&
            retryAfterMs == other.retryAfterMs &&
            signal == other.signal &&
            startedAt == other.startedAt &&
            stderrBytes == other.stderrBytes &&
            stderrTruncated == other.stderrTruncated &&
            stdoutBytes == other.stdoutBytes &&
            stdoutTruncated == other.stdoutTruncated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            command,
            createdAt,
            executionId,
            machineId,
            status,
            artifacts,
            completedAt,
            cwd,
            envKeys,
            errorCode,
            errorMessage,
            exitCode,
            expiresAt,
            retryAfterMs,
            signal,
            startedAt,
            stderrBytes,
            stderrTruncated,
            stdoutBytes,
            stdoutTruncated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Execution{command=$command, createdAt=$createdAt, executionId=$executionId, machineId=$machineId, status=$status, artifacts=$artifacts, completedAt=$completedAt, cwd=$cwd, envKeys=$envKeys, errorCode=$errorCode, errorMessage=$errorMessage, exitCode=$exitCode, expiresAt=$expiresAt, retryAfterMs=$retryAfterMs, signal=$signal, startedAt=$startedAt, stderrBytes=$stderrBytes, stderrTruncated=$stderrTruncated, stdoutBytes=$stdoutBytes, stdoutTruncated=$stdoutTruncated, additionalProperties=$additionalProperties}"
}
