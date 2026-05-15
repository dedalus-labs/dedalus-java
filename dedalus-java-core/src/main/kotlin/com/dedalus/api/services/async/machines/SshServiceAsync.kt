// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async.machines

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.machines.ssh.SshCreateParams
import com.dedalus.api.models.machines.ssh.SshDeleteParams
import com.dedalus.api.models.machines.ssh.SshListPageAsync
import com.dedalus.api.models.machines.ssh.SshListParams
import com.dedalus.api.models.machines.ssh.SshRetrieveParams
import com.dedalus.api.models.machines.ssh.SshSession
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SshServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SshServiceAsync

    /** Create SSH session */
    fun create(params: SshCreateParams): CompletableFuture<SshSession> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SshCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SshSession>

    /** Get SSH session */
    fun retrieve(params: SshRetrieveParams): CompletableFuture<SshSession> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SshRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SshSession>

    /** List SSH sessions */
    fun list(params: SshListParams): CompletableFuture<SshListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SshListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SshListPageAsync>

    /** Delete SSH session */
    fun delete(params: SshDeleteParams): CompletableFuture<SshSession> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SshDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SshSession>

    /** A view of [SshServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SshServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/machines/{machine_id}/ssh`, but is otherwise
         * the same as [SshServiceAsync.create].
         */
        fun create(params: SshCreateParams): CompletableFuture<HttpResponseFor<SshSession>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SshCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SshSession>>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/ssh/{session_id}`, but is
         * otherwise the same as [SshServiceAsync.retrieve].
         */
        fun retrieve(params: SshRetrieveParams): CompletableFuture<HttpResponseFor<SshSession>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SshRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SshSession>>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/ssh`, but is otherwise the
         * same as [SshServiceAsync.list].
         */
        fun list(params: SshListParams): CompletableFuture<HttpResponseFor<SshListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SshListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SshListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /v1/machines/{machine_id}/ssh/{session_id}`, but
         * is otherwise the same as [SshServiceAsync.delete].
         */
        fun delete(params: SshDeleteParams): CompletableFuture<HttpResponseFor<SshSession>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SshDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SshSession>>
    }
}
