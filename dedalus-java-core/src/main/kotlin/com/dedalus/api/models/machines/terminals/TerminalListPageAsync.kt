// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.terminals

import com.dedalus.api.core.AutoPagerAsync
import com.dedalus.api.core.PageAsync
import com.dedalus.api.core.checkRequired
import com.dedalus.api.services.async.machines.TerminalServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TerminalServiceAsync.list */
class TerminalListPageAsync
private constructor(
    private val service: TerminalServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TerminalListParams,
    private val response: TerminalList,
) : PageAsync<Terminal> {

    /**
     * Delegates to [TerminalList], but gracefully handles missing data.
     *
     * @see TerminalList.items
     */
    override fun items(): List<Terminal> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [TerminalList], but gracefully handles missing data.
     *
     * @see TerminalList.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): TerminalListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<TerminalListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Terminal> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TerminalListParams = params

    /** The response that this page was parsed from. */
    fun response(): TerminalList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TerminalListPageAsync].
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

    /** A builder for [TerminalListPageAsync]. */
    class Builder internal constructor() {

        private var service: TerminalServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TerminalListParams? = null
        private var response: TerminalList? = null

        @JvmSynthetic
        internal fun from(terminalListPageAsync: TerminalListPageAsync) = apply {
            service = terminalListPageAsync.service
            streamHandlerExecutor = terminalListPageAsync.streamHandlerExecutor
            params = terminalListPageAsync.params
            response = terminalListPageAsync.response
        }

        fun service(service: TerminalServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TerminalListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TerminalList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TerminalListPageAsync].
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
        fun build(): TerminalListPageAsync =
            TerminalListPageAsync(
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

        return other is TerminalListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TerminalListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
