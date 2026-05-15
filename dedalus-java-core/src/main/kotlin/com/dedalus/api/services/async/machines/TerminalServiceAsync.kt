// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async.machines

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.machines.terminals.Terminal
import com.dedalus.api.models.machines.terminals.TerminalCreateParams
import com.dedalus.api.models.machines.terminals.TerminalDeleteParams
import com.dedalus.api.models.machines.terminals.TerminalListPageAsync
import com.dedalus.api.models.machines.terminals.TerminalListParams
import com.dedalus.api.models.machines.terminals.TerminalRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TerminalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TerminalServiceAsync

    /** Create terminal */
    fun create(params: TerminalCreateParams): CompletableFuture<Terminal> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TerminalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Terminal>

    /** Get terminal */
    fun retrieve(params: TerminalRetrieveParams): CompletableFuture<Terminal> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TerminalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Terminal>

    /** List terminals */
    fun list(params: TerminalListParams): CompletableFuture<TerminalListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TerminalListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TerminalListPageAsync>

    /** Delete terminal */
    fun delete(params: TerminalDeleteParams): CompletableFuture<Terminal> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TerminalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Terminal>

    /**
     * A view of [TerminalServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TerminalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/machines/{machine_id}/terminals`, but is
         * otherwise the same as [TerminalServiceAsync.create].
         */
        fun create(params: TerminalCreateParams): CompletableFuture<HttpResponseFor<Terminal>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TerminalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Terminal>>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/terminals/{terminal_id}`,
         * but is otherwise the same as [TerminalServiceAsync.retrieve].
         */
        fun retrieve(params: TerminalRetrieveParams): CompletableFuture<HttpResponseFor<Terminal>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TerminalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Terminal>>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/terminals`, but is
         * otherwise the same as [TerminalServiceAsync.list].
         */
        fun list(
            params: TerminalListParams
        ): CompletableFuture<HttpResponseFor<TerminalListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TerminalListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TerminalListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/machines/{machine_id}/terminals/{terminal_id}`, but is otherwise the same as
         * [TerminalServiceAsync.delete].
         */
        fun delete(params: TerminalDeleteParams): CompletableFuture<HttpResponseFor<Terminal>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TerminalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Terminal>>
    }
}
