// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.artifacts

import com.dedalus.api.core.AutoPager
import com.dedalus.api.core.Page
import com.dedalus.api.core.checkRequired
import com.dedalus.api.services.blocking.machines.ArtifactService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ArtifactService.list */
class ArtifactListPage
private constructor(
    private val service: ArtifactService,
    private val params: ArtifactListParams,
    private val response: ArtifactList,
) : Page<Artifact> {

    /**
     * Delegates to [ArtifactList], but gracefully handles missing data.
     *
     * @see ArtifactList.items
     */
    override fun items(): List<Artifact> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ArtifactList], but gracefully handles missing data.
     *
     * @see ArtifactList.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ArtifactListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ArtifactListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Artifact> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ArtifactListParams = params

    /** The response that this page was parsed from. */
    fun response(): ArtifactList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ArtifactListPage].
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

    /** A builder for [ArtifactListPage]. */
    class Builder internal constructor() {

        private var service: ArtifactService? = null
        private var params: ArtifactListParams? = null
        private var response: ArtifactList? = null

        @JvmSynthetic
        internal fun from(artifactListPage: ArtifactListPage) = apply {
            service = artifactListPage.service
            params = artifactListPage.params
            response = artifactListPage.response
        }

        fun service(service: ArtifactService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ArtifactListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ArtifactList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ArtifactListPage].
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
        fun build(): ArtifactListPage =
            ArtifactListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ArtifactListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ArtifactListPage{service=$service, params=$params, response=$response}"
}
