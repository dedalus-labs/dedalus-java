// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.AutoPager
import com.dedalus.api.core.Page
import com.dedalus.api.core.checkRequired
import com.dedalus.api.services.blocking.MachineService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MachineService.list */
class MachineListPage
private constructor(
    private val service: MachineService,
    private val params: MachineListParams,
    private val response: MachineList,
) : Page<MachineListItem> {

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

    override fun nextPage(): MachineListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MachineListItem> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MachineListParams = params

    /** The response that this page was parsed from. */
    fun response(): MachineList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MachineListPage].
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

    /** A builder for [MachineListPage]. */
    class Builder internal constructor() {

        private var service: MachineService? = null
        private var params: MachineListParams? = null
        private var response: MachineList? = null

        @JvmSynthetic
        internal fun from(machineListPage: MachineListPage) = apply {
            service = machineListPage.service
            params = machineListPage.params
            response = machineListPage.response
        }

        fun service(service: MachineService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MachineListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MachineList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MachineListPage].
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
        fun build(): MachineListPage =
            MachineListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MachineListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MachineListPage{service=$service, params=$params, response=$response}"
}
