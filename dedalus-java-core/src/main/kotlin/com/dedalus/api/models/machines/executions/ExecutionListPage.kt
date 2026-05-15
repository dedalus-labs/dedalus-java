// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.AutoPager
import com.dedalus.api.core.Page
import com.dedalus.api.core.checkRequired
import com.dedalus.api.services.blocking.machines.ExecutionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExecutionService.list */
class ExecutionListPage
private constructor(
    private val service: ExecutionService,
    private val params: ExecutionListParams,
    private val response: ExecutionList,
) : Page<Execution> {

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

    override fun nextPage(): ExecutionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Execution> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExecutionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExecutionList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExecutionListPage].
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

    /** A builder for [ExecutionListPage]. */
    class Builder internal constructor() {

        private var service: ExecutionService? = null
        private var params: ExecutionListParams? = null
        private var response: ExecutionList? = null

        @JvmSynthetic
        internal fun from(executionListPage: ExecutionListPage) = apply {
            service = executionListPage.service
            params = executionListPage.params
            response = executionListPage.response
        }

        fun service(service: ExecutionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExecutionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExecutionList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExecutionListPage].
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
        fun build(): ExecutionListPage =
            ExecutionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExecutionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExecutionListPage{service=$service, params=$params, response=$response}"
}
