// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.AutoPagerAsync
import com.dedalus.api.core.PageAsync
import com.dedalus.api.core.checkRequired
import com.dedalus.api.services.async.MachineServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see MachineServiceAsync.list */
class MachineListPageAsync
private constructor(
    private val service: MachineServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MachineListParams,
    private val response: MachineList,
) : PageAsync<MachineListItem> {

    /**
     * Delegates to [MachineList], but gracefully handles missing data.
     *
     * @see MachineList.items
     */
    override fun items(): List<MachineListItem> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [MachineList], but gracefully handles missing data.
     *
     * @see MachineList.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): MachineListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MachineListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MachineListItem> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MachineListParams = params

    /** The response that this page was parsed from. */
    fun response(): MachineList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MachineListPageAsync].
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

    /** A builder for [MachineListPageAsync]. */
    class Builder internal constructor() {

        private var service: MachineServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MachineListParams? = null
        private var response: MachineList? = null

        @JvmSynthetic
        internal fun from(machineListPageAsync: MachineListPageAsync) = apply {
            service = machineListPageAsync.service
            streamHandlerExecutor = machineListPageAsync.streamHandlerExecutor
            params = machineListPageAsync.params
            response = machineListPageAsync.response
        }

        fun service(service: MachineServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MachineListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MachineList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MachineListPageAsync].
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
        fun build(): MachineListPageAsync =
            MachineListPageAsync(
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

        return other is MachineListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MachineListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
