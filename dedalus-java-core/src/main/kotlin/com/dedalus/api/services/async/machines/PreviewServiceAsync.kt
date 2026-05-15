// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async.machines

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.machines.previews.Preview
import com.dedalus.api.models.machines.previews.PreviewCreateParams
import com.dedalus.api.models.machines.previews.PreviewDeleteParams
import com.dedalus.api.models.machines.previews.PreviewListPageAsync
import com.dedalus.api.models.machines.previews.PreviewListParams
import com.dedalus.api.models.machines.previews.PreviewRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PreviewServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewServiceAsync

    /** Create preview */
    fun create(params: PreviewCreateParams): CompletableFuture<Preview> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PreviewCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Preview>

    /** Get preview */
    fun retrieve(params: PreviewRetrieveParams): CompletableFuture<Preview> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PreviewRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Preview>

    /** List previews */
    fun list(params: PreviewListParams): CompletableFuture<PreviewListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PreviewListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreviewListPageAsync>

    /** Delete preview */
    fun delete(params: PreviewDeleteParams): CompletableFuture<Preview> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PreviewDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Preview>

    /**
     * A view of [PreviewServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreviewServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/machines/{machine_id}/previews`, but is
         * otherwise the same as [PreviewServiceAsync.create].
         */
        fun create(params: PreviewCreateParams): CompletableFuture<HttpResponseFor<Preview>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PreviewCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Preview>>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/previews/{preview_id}`,
         * but is otherwise the same as [PreviewServiceAsync.retrieve].
         */
        fun retrieve(params: PreviewRetrieveParams): CompletableFuture<HttpResponseFor<Preview>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PreviewRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Preview>>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/previews`, but is
         * otherwise the same as [PreviewServiceAsync.list].
         */
        fun list(
            params: PreviewListParams
        ): CompletableFuture<HttpResponseFor<PreviewListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PreviewListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreviewListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /v1/machines/{machine_id}/previews/{preview_id}`,
         * but is otherwise the same as [PreviewServiceAsync.delete].
         */
        fun delete(params: PreviewDeleteParams): CompletableFuture<HttpResponseFor<Preview>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PreviewDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Preview>>
    }
}
