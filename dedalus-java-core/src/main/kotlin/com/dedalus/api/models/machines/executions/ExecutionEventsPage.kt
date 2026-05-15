// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.AutoPager
import com.dedalus.api.core.Page
import com.dedalus.api.core.checkRequired
import com.dedalus.api.services.blocking.machines.ExecutionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExecutionService.events */
class ExecutionEventsPage
private constructor(
    private val service: ExecutionService,
    private val params: ExecutionEventsParams,
    private val response: ExecutionEvents,
) : Page<ExecutionEvent> {

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

    override fun nextPage(): ExecutionEventsPage = service.events(nextPageParams())

    fun autoPager(): AutoPager<ExecutionEvent> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExecutionEventsParams = params

    /** The response that this page was parsed from. */
    fun response(): ExecutionEvents = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExecutionEventsPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExecutionEventsPage]. */
    class Builder internal constructor() {

        private var service: ExecutionService? = null
        private var params: ExecutionEventsParams? = null
        private var response: ExecutionEvents? = null

        @JvmSynthetic
        internal fun from(executionEventsPage: ExecutionEventsPage) = apply {
            service = executionEventsPage.service
            params = executionEventsPage.params
            response = executionEventsPage.response
        }

        fun service(service: ExecutionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExecutionEventsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExecutionEvents) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExecutionEventsPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExecutionEventsPage =
            ExecutionEventsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExecutionEventsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExecutionEventsPage{service=$service, params=$params, response=$response}"
}
