// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

import com.dedalus.api.core.AutoPagerAsync
import com.dedalus.api.core.PageAsync
import com.dedalus.api.core.checkRequired
import com.dedalus.api.services.async.machines.SshServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SshServiceAsync.list */
class SshListPageAsync
private constructor(
    private val service: SshServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SshListParams,
    private val response: SshSessionList,
) : PageAsync<SshSession> {

    /**
     * Delegates to [SshSessionList], but gracefully handles missing data.
     *
     * @see SshSessionList.items
     */
    override fun items(): List<SshSession> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SshSessionList], but gracefully handles missing data.
     *
     * @see SshSessionList.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SshListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SshListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SshSession> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SshListParams = params

    /** The response that this page was parsed from. */
    fun response(): SshSessionList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SshListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SshListPageAsync]. */
    class Builder internal constructor() {

        private var service: SshServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SshListParams? = null
        private var response: SshSessionList? = null

        @JvmSynthetic
        internal fun from(sshListPageAsync: SshListPageAsync) = apply {
            service = sshListPageAsync.service
            streamHandlerExecutor = sshListPageAsync.streamHandlerExecutor
            params = sshListPageAsync.params
            response = sshListPageAsync.response
        }

        fun service(service: SshServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SshListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SshSessionList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SshListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SshListPageAsync =
            SshListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SshListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SshListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
