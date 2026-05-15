// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking.machines

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.machines.terminals.Terminal
import com.dedalus.api.models.machines.terminals.TerminalCreateParams
import com.dedalus.api.models.machines.terminals.TerminalDeleteParams
import com.dedalus.api.models.machines.terminals.TerminalListPage
import com.dedalus.api.models.machines.terminals.TerminalListParams
import com.dedalus.api.models.machines.terminals.TerminalRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface TerminalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TerminalService

    /** Create terminal */
    fun create(params: TerminalCreateParams): Terminal = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TerminalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Terminal

    /** Get terminal */
    fun retrieve(params: TerminalRetrieveParams): Terminal = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TerminalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Terminal

    /** List terminals */
    fun list(params: TerminalListParams): TerminalListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TerminalListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TerminalListPage

    /** Delete terminal */
    fun delete(params: TerminalDeleteParams): Terminal = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TerminalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Terminal

    /** A view of [TerminalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TerminalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/machines/{machine_id}/terminals`, but is
         * otherwise the same as [TerminalService.create].
         */
        @MustBeClosed
        fun create(params: TerminalCreateParams): HttpResponseFor<Terminal> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TerminalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Terminal>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/terminals/{terminal_id}`,
         * but is otherwise the same as [TerminalService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: TerminalRetrieveParams): HttpResponseFor<Terminal> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TerminalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Terminal>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/terminals`, but is
         * otherwise the same as [TerminalService.list].
         */
        @MustBeClosed
        fun list(params: TerminalListParams): HttpResponseFor<TerminalListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TerminalListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TerminalListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/machines/{machine_id}/terminals/{terminal_id}`, but is otherwise the same as
         * [TerminalService.delete].
         */
        @MustBeClosed
        fun delete(params: TerminalDeleteParams): HttpResponseFor<Terminal> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TerminalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Terminal>
    }
}
