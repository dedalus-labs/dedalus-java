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

/** @see ExecutionServiceAsync.list */
class ExecutionListPageAsync
private constructor(
    private val service: ExecutionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExecutionListParams,
    private val response: ExecutionList,
) : PageAsync<Execution> {

    /**
     * Delegates to [ExecutionList], but gracefully handles missing data.
     *
     * @see ExecutionList.items
     */
    override fun items(): List<Execution> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExecutionList], but gracefully handles missing data.
     *
     * @see ExecutionList.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ExecutionListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ExecutionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Execution> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExecutionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExecutionList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExecutionListPageAsync].
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

    /** A builder for [ExecutionListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExecutionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExecutionListParams? = null
        private var response: ExecutionList? = null

        @JvmSynthetic
        internal fun from(executionListPageAsync: ExecutionListPageAsync) = apply {
            service = executionListPageAsync.service
            streamHandlerExecutor = executionListPageAsync.streamHandlerExecutor
            params = executionListPageAsync.params
            response = executionListPageAsync.response
        }

        fun service(service: ExecutionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExecutionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExecutionList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExecutionListPageAsync].
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
        fun build(): ExecutionListPageAsync =
            ExecutionListPageAsync(
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

        return other is ExecutionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ExecutionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
