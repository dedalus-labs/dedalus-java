// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async.machines

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.machines.artifacts.Artifact
import com.dedalus.api.models.machines.artifacts.ArtifactDeleteParams
import com.dedalus.api.models.machines.artifacts.ArtifactListPageAsync
import com.dedalus.api.models.machines.artifacts.ArtifactListParams
import com.dedalus.api.models.machines.artifacts.ArtifactRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ArtifactServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtifactServiceAsync

    /** Get artifact */
    fun retrieve(params: ArtifactRetrieveParams): CompletableFuture<Artifact> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ArtifactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Artifact>

    /** List artifacts */
    fun list(params: ArtifactListParams): CompletableFuture<ArtifactListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ArtifactListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArtifactListPageAsync>

    /** Delete artifact */
    fun delete(params: ArtifactDeleteParams): CompletableFuture<Artifact> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ArtifactDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Artifact>

    /**
     * A view of [ArtifactServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ArtifactServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/artifacts/{artifact_id}`,
         * but is otherwise the same as [ArtifactServiceAsync.retrieve].
         */
        fun retrieve(params: ArtifactRetrieveParams): CompletableFuture<HttpResponseFor<Artifact>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ArtifactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Artifact>>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/artifacts`, but is
         * otherwise the same as [ArtifactServiceAsync.list].
         */
        fun list(
            params: ArtifactListParams
        ): CompletableFuture<HttpResponseFor<ArtifactListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ArtifactListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArtifactListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/machines/{machine_id}/artifacts/{artifact_id}`, but is otherwise the same as
         * [ArtifactServiceAsync.delete].
         */
        fun delete(params: ArtifactDeleteParams): CompletableFuture<HttpResponseFor<Artifact>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ArtifactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Artifact>>
    }
}
