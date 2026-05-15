// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.AutoPagerAsync
import com.dedalus.api.core.PageAsync
import com.dedalus.api.core.checkRequired
import com.dedalus.api.services.async.machines.ExecutionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ExecutionServiceAsync.events */
class ExecutionEventsPageAsync
private constructor(
    private val service: ExecutionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExecutionEventsParams,
    private val response: ExecutionEvents,
) : PageAsync<ExecutionEvent> {

    /**
     * Delegates to [ExecutionEvents], but gracefully handles missing data.
     *
     * @see ExecutionEvents.items
     */
    override fun items(): List<ExecutionEvent> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExecutionEvents], but gracefully handles missing data.
     *
     * @see ExecutionEvents.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ExecutionEventsParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ExecutionEventsPageAsync> =
        service.events(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExecutionEvent> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExecutionEventsParams = params

    /** The response that this page was parsed from. */
    fun response(): ExecutionEvents = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExecutionEventsPageAsync].
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

    /** A builder for [ExecutionEventsPageAsync]. */
    class Builder internal constructor() {

        private var service: ExecutionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExecutionEventsParams? = null
        private var response: ExecutionEvents? = null

        @JvmSynthetic
        internal fun from(executionEventsPageAsync: ExecutionEventsPageAsync) = apply {
            service = executionEventsPageAsync.service
            streamHandlerExecutor = executionEventsPageAsync.streamHandlerExecutor
            params = executionEventsPageAsync.params
            response = executionEventsPageAsync.response
        }

        fun service(service: ExecutionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExecutionEventsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExecutionEvents) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExecutionEventsPageAsync].
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
        fun build(): ExecutionEventsPageAsync =
            ExecutionEventsPageAsync(
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

        return other is ExecutionEventsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ExecutionEventsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
