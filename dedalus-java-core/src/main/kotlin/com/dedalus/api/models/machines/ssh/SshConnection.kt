// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

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
import kotlin.jvm.optionals.getOrNull

class SshConnection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endpoint: JsonField<String>,
    private val port: JsonField<Long>,
    private val sshUsername: JsonField<String>,
    private val hostTrust: JsonField<SshHostTrust>,
    private val userCertificate: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("endpoint") @ExcludeMissing endpoint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("port") @ExcludeMissing port: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ssh_username")
        @ExcludeMissing
        sshUsername: JsonField<String> = JsonMissing.of(),
        @JsonProperty("host_trust")
        @ExcludeMissing
        hostTrust: JsonField<SshHostTrust> = JsonMissing.of(),
        @JsonProperty("user_certificate")
        @ExcludeMissing
        userCertificate: JsonField<String> = JsonMissing.of(),
    ) : this(endpoint, port, sshUsername, hostTrust, userCertificate, mutableMapOf())

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endpoint(): String = endpoint.getRequired("endpoint")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun port(): Long = port.getRequired("port")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sshUsername(): String = sshUsername.getRequired("ssh_username")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hostTrust(): Optional<SshHostTrust> = hostTrust.getOptional("host_trust")

    /**
     * @throws DedalusInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userCertificate(): Optional<String> = userCertificate.getOptional("user_certificate")

    /**
     * Returns the raw JSON value of [endpoint].
     *
     * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

    /**
     * Returns the raw JSON value of [port].
     *
     * Unlike [port], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("port") @ExcludeMissing fun _port(): JsonField<Long> = port

    /**
     * Returns the raw JSON value of [sshUsername].
     *
     * Unlike [sshUsername], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ssh_username")
    @ExcludeMissing
    fun _sshUsername(): JsonField<String> = sshUsername

    /**
     * Returns the raw JSON value of [hostTrust].
     *
     * Unlike [hostTrust], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("host_trust")
    @ExcludeMissing
    fun _hostTrust(): JsonField<SshHostTrust> = hostTrust

    /**
     * Returns the raw JSON value of [userCertificate].
     *
     * Unlike [userCertificate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_certificate")
    @ExcludeMissing
    fun _userCertificate(): JsonField<String> = userCertificate

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
         * Returns a mutable builder for constructing an instance of [SshConnection].
         *
         * The following fields are required:
         * ```java
         * .endpoint()
         * .port()
         * .sshUsername()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SshConnection]. */
    class Builder internal constructor() {

        private var endpoint: JsonField<String>? = null
        private var port: JsonField<Long>? = null
        private var sshUsername: JsonField<String>? = null
        private var hostTrust: JsonField<SshHostTrust> = JsonMissing.of()
        private var userCertificate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sshConnection: SshConnection) = apply {
            endpoint = sshConnection.endpoint
            port = sshConnection.port
            sshUsername = sshConnection.sshUsername
            hostTrust = sshConnection.hostTrust
            userCertificate = sshConnection.userCertificate
            additionalProperties = sshConnection.additionalProperties.toMutableMap()
        }

        fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

        /**
         * Sets [Builder.endpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endpoint] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

        fun port(port: Long) = port(JsonField.of(port))

        /**
         * Sets [Builder.port] to an arbitrary JSON value.
         *
         * You should usually call [Builder.port] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun port(port: JsonField<Long>) = apply { this.port = port }

        fun sshUsername(sshUsername: String) = sshUsername(JsonField.of(sshUsername))

        /**
         * Sets [Builder.sshUsername] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sshUsername] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sshUsername(sshUsername: JsonField<String>) = apply { this.sshUsername = sshUsername }

        fun hostTrust(hostTrust: SshHostTrust) = hostTrust(JsonField.of(hostTrust))

        /**
         * Sets [Builder.hostTrust] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostTrust] with a well-typed [SshHostTrust] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hostTrust(hostTrust: JsonField<SshHostTrust>) = apply { this.hostTrust = hostTrust }

        fun userCertificate(userCertificate: String) =
            userCertificate(JsonField.of(userCertificate))

        /**
         * Sets [Builder.userCertificate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userCertificate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userCertificate(userCertificate: JsonField<String>) = apply {
            this.userCertificate = userCertificate
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
         * Returns an immutable instance of [SshConnection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endpoint()
         * .port()
         * .sshUsername()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SshConnection =
            SshConnection(
                checkRequired("endpoint", endpoint),
                checkRequired("port", port),
                checkRequired("sshUsername", sshUsername),
                hostTrust,
                userCertificate,
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
    fun validate(): SshConnection = apply {
        if (validated) {
            return@apply
        }

        endpoint()
        port()
        sshUsername()
        hostTrust().ifPresent { it.validate() }
        userCertificate()
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
        (if (endpoint.asKnown().isPresent) 1 else 0) +
            (if (port.asKnown().isPresent) 1 else 0) +
            (if (sshUsername.asKnown().isPresent) 1 else 0) +
            (hostTrust.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userCertificate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SshConnection &&
            endpoint == other.endpoint &&
            port == other.port &&
            sshUsername == other.sshUsername &&
            hostTrust == other.hostTrust &&
            userCertificate == other.userCertificate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(endpoint, port, sshUsername, hostTrust, userCertificate, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SshConnection{endpoint=$endpoint, port=$port, sshUsername=$sshUsername, hostTrust=$hostTrust, userCertificate=$userCertificate, additionalProperties=$additionalProperties}"
}
