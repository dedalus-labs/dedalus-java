// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking.machines

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.machines.previews.Preview
import com.dedalus.api.models.machines.previews.PreviewCreateParams
import com.dedalus.api.models.machines.previews.PreviewDeleteParams
import com.dedalus.api.models.machines.previews.PreviewListPage
import com.dedalus.api.models.machines.previews.PreviewListParams
import com.dedalus.api.models.machines.previews.PreviewRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface PreviewService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewService

    /** Create preview */
    fun create(params: PreviewCreateParams): Preview = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PreviewCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Preview

    /** Get preview */
    fun retrieve(params: PreviewRetrieveParams): Preview = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PreviewRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Preview

    /** List previews */
    fun list(params: PreviewListParams): PreviewListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PreviewListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreviewListPage

    /** Delete preview */
    fun delete(params: PreviewDeleteParams): Preview = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PreviewDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Preview

    /** A view of [PreviewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/machines/{machine_id}/previews`, but is
         * otherwise the same as [PreviewService.create].
         */
        @MustBeClosed
        fun create(params: PreviewCreateParams): HttpResponseFor<Preview> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PreviewCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Preview>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/previews/{preview_id}`,
         * but is otherwise the same as [PreviewService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PreviewRetrieveParams): HttpResponseFor<Preview> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PreviewRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Preview>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/previews`, but is
         * otherwise the same as [PreviewService.list].
         */
        @MustBeClosed
        fun list(params: PreviewListParams): HttpResponseFor<PreviewListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PreviewListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreviewListPage>

        /**
         * Returns a raw HTTP response for `delete /v1/machines/{machine_id}/previews/{preview_id}`,
         * but is otherwise the same as [PreviewService.delete].
         */
        @MustBeClosed
        fun delete(params: PreviewDeleteParams): HttpResponseFor<Preview> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PreviewDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Preview>
    }
}
