// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.previews

import com.dedalus.api.core.AutoPager
import com.dedalus.api.core.Page
import com.dedalus.api.core.checkRequired
import com.dedalus.api.services.blocking.machines.PreviewService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PreviewService.list */
class PreviewListPage
private constructor(
    private val service: PreviewService,
    private val params: PreviewListParams,
    private val response: PreviewList,
) : Page<Preview> {

    /**
     * Delegates to [PreviewList], but gracefully handles missing data.
     *
     * @see PreviewList.items
     */
    override fun items(): List<Preview> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [PreviewList], but gracefully handles missing data.
     *
     * @see PreviewList.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): PreviewListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): PreviewListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Preview> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PreviewListParams = params

    /** The response that this page was parsed from. */
    fun response(): PreviewList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PreviewListPage].
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

    /** A builder for [PreviewListPage]. */
    class Builder internal constructor() {

        private var service: PreviewService? = null
        private var params: PreviewListParams? = null
        private var response: PreviewList? = null

        @JvmSynthetic
        internal fun from(previewListPage: PreviewListPage) = apply {
            service = previewListPage.service
            params = previewListPage.params
            response = previewListPage.response
        }

        fun service(service: PreviewService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PreviewListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PreviewList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PreviewListPage].
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
        fun build(): PreviewListPage =
            PreviewListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreviewListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PreviewListPage{service=$service, params=$params, response=$response}"
}
