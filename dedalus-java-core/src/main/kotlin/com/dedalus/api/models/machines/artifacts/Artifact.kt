// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.artifacts

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

class Artifact
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val artifactId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val machineId: JsonField<String>,
    private val name: JsonField<String>,
    private val sizeBytes: JsonField<Long>,
    private val downloadUrl: JsonField<String>,
    private val executionId: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val mimeType: JsonField<String>,
    private val sha256: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("artifact_id")
        @ExcludeMissing
        artifactId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("machine_id") @ExcludeMissing machineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size_bytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("download_url")
        @ExcludeMissing
        downloadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("execution_id")
        @ExcludeMissing
        executionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("mime_type") @ExcludeMissing mimeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sha256") @ExcludeMissing sha256: JsonField<String> = JsonMissing.of(),
    ) : this(
        artifactId,
        createdAt,
        machineId,
        name,
        sizeBytes,
        downloadUrl,
        executionId,
        expiresAt,
        mimeType,
        sha256,
        mutableMapOf(),
    )

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun artifactId(): String = artifactId.getRequired("artifact_id")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun machineId(): String = machineId.getRequired("machine_id")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sizeBytes(): Long = sizeBytes.getRequired("size_bytes")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downloadUrl(): Optional<String> = downloadUrl.getOptional("download_url")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionId(): Optional<String> = executionId.getOptional("execution_id")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mimeType(): Optional<String> = mimeType.getOptional("mime_type")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sha256(): Optional<String> = sha256.getOptional("sha256")

    /**
     * Returns the raw JSON value of [artifactId].
     *
     * Unlike [artifactId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("artifact_id") @ExcludeMissing fun _artifactId(): JsonField<String> = artifactId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [machineId].
     *
     * Unlike [machineId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("machine_id") @ExcludeMissing fun _machineId(): JsonField<String> = machineId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [sizeBytes].
     *
     * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size_bytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

    /**
     * Returns the raw JSON value of [downloadUrl].
     *
     * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("download_url")
    @ExcludeMissing
    fun _downloadUrl(): JsonField<String> = downloadUrl

    /**
     * Returns the raw JSON value of [executionId].
     *
     * Unlike [executionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution_id")
    @ExcludeMissing
    fun _executionId(): JsonField<String> = executionId

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [mimeType].
     *
     * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mime_type") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

    /**
     * Returns the raw JSON value of [sha256].
     *
     * Unlike [sha256], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sha256") @ExcludeMissing fun _sha256(): JsonField<String> = sha256

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
         * Returns a mutable builder for constructing an instance of [Artifact].
         *
         * The following fields are required:
         * ```java
         * .artifactId()
         * .createdAt()
         * .machineId()
         * .name()
         * .sizeBytes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Artifact]. */
    class Builder internal constructor() {

        private var artifactId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var machineId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var sizeBytes: JsonField<Long>? = null
        private var downloadUrl: JsonField<String> = JsonMissing.of()
        private var executionId: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var mimeType: JsonField<String> = JsonMissing.of()
        private var sha256: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(artifact: Artifact) = apply {
            artifactId = artifact.artifactId
            createdAt = artifact.createdAt
            machineId = artifact.machineId
            name = artifact.name
            sizeBytes = artifact.sizeBytes
            downloadUrl = artifact.downloadUrl
            executionId = artifact.executionId
            expiresAt = artifact.expiresAt
            mimeType = artifact.mimeType
            sha256 = artifact.sha256
            additionalProperties = artifact.additionalProperties.toMutableMap()
        }

        fun artifactId(artifactId: String) = artifactId(JsonField.of(artifactId))

        /**
         * Sets [Builder.artifactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artifactId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun artifactId(artifactId: JsonField<String>) = apply { this.artifactId = artifactId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun machineId(machineId: String) = machineId(JsonField.of(machineId))

        /**
         * Sets [Builder.machineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun machineId(machineId: JsonField<String>) = apply { this.machineId = machineId }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

        /**
         * Sets [Builder.sizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

        fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

        /**
         * Sets [Builder.downloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

        fun executionId(executionId: String) = executionId(JsonField.of(executionId))

        /**
         * Sets [Builder.executionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionId(executionId: JsonField<String>) = apply { this.executionId = executionId }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

        /**
         * Sets [Builder.mimeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mimeType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

        fun sha256(sha256: String) = sha256(JsonField.of(sha256))

        /**
         * Sets [Builder.sha256] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sha256] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sha256(sha256: JsonField<String>) = apply { this.sha256 = sha256 }

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
         * Returns an immutable instance of [Artifact].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .artifactId()
         * .createdAt()
         * .machineId()
         * .name()
         * .sizeBytes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Artifact =
            Artifact(
                checkRequired("artifactId", artifactId),
                checkRequired("createdAt", createdAt),
                checkRequired("machineId", machineId),
                checkRequired("name", name),
                checkRequired("sizeBytes", sizeBytes),
                downloadUrl,
                executionId,
                expiresAt,
                mimeType,
                sha256,
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
    fun validate(): Artifact = apply {
        if (validated) {
            return@apply
        }

        artifactId()
        createdAt()
        machineId()
        name()
        sizeBytes()
        downloadUrl()
        executionId()
        expiresAt()
        mimeType()
        sha256()
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
        (if (artifactId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (machineId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (sizeBytes.asKnown().isPresent) 1 else 0) +
            (if (downloadUrl.asKnown().isPresent) 1 else 0) +
            (if (executionId.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (mimeType.asKnown().isPresent) 1 else 0) +
            (if (sha256.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Artifact &&
            artifactId == other.artifactId &&
            createdAt == other.createdAt &&
            machineId == other.machineId &&
            name == other.name &&
            sizeBytes == other.sizeBytes &&
            downloadUrl == other.downloadUrl &&
            executionId == other.executionId &&
            expiresAt == other.expiresAt &&
            mimeType == other.mimeType &&
            sha256 == other.sha256 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            artifactId,
            createdAt,
            machineId,
            name,
            sizeBytes,
            downloadUrl,
            executionId,
            expiresAt,
            mimeType,
            sha256,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Artifact{artifactId=$artifactId, createdAt=$createdAt, machineId=$machineId, name=$name, sizeBytes=$sizeBytes, downloadUrl=$downloadUrl, executionId=$executionId, expiresAt=$expiresAt, mimeType=$mimeType, sha256=$sha256, additionalProperties=$additionalProperties}"
}
