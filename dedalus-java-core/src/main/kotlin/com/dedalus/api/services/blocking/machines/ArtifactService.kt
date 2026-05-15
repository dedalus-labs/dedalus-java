// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking.machines

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.machines.artifacts.Artifact
import com.dedalus.api.models.machines.artifacts.ArtifactDeleteParams
import com.dedalus.api.models.machines.artifacts.ArtifactListPage
import com.dedalus.api.models.machines.artifacts.ArtifactListParams
import com.dedalus.api.models.machines.artifacts.ArtifactRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ArtifactService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtifactService

    /** Get artifact */
    fun retrieve(params: ArtifactRetrieveParams): Artifact = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ArtifactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Artifact

    /** List artifacts */
    fun list(params: ArtifactListParams): ArtifactListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ArtifactListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtifactListPage

    /** Delete artifact */
    fun delete(params: ArtifactDeleteParams): Artifact = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ArtifactDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Artifact

    /** A view of [ArtifactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtifactService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/artifacts/{artifact_id}`,
         * but is otherwise the same as [ArtifactService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ArtifactRetrieveParams): HttpResponseFor<Artifact> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ArtifactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Artifact>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/artifacts`, but is
         * otherwise the same as [ArtifactService.list].
         */
        @MustBeClosed
        fun list(params: ArtifactListParams): HttpResponseFor<ArtifactListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ArtifactListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtifactListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/machines/{machine_id}/artifacts/{artifact_id}`, but is otherwise the same as
         * [ArtifactService.delete].
         */
        @MustBeClosed
        fun delete(params: ArtifactDeleteParams): HttpResponseFor<Artifact> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ArtifactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Artifact>
    }
}
