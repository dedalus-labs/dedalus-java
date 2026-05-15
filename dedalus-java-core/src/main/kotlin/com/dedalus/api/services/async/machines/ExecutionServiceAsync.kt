// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async.machines

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.machines.executions.Execution
import com.dedalus.api.models.machines.executions.ExecutionCreateParams
import com.dedalus.api.models.machines.executions.ExecutionDeleteParams
import com.dedalus.api.models.machines.executions.ExecutionEventsPageAsync
import com.dedalus.api.models.machines.executions.ExecutionEventsParams
import com.dedalus.api.models.machines.executions.ExecutionListPageAsync
import com.dedalus.api.models.machines.executions.ExecutionListParams
import com.dedalus.api.models.machines.executions.ExecutionOutput
import com.dedalus.api.models.machines.executions.ExecutionOutputParams
import com.dedalus.api.models.machines.executions.ExecutionRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExecutionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExecutionServiceAsync

    /** Create execution */
    fun create(params: ExecutionCreateParams): CompletableFuture<Execution> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExecutionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Execution>

    /** Get execution */
    fun retrieve(params: ExecutionRetrieveParams): CompletableFuture<Execution> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExecutionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Execution>

    /** List executions */
    fun list(params: ExecutionListParams): CompletableFuture<ExecutionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExecutionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecutionListPageAsync>

    /** Delete execution */
    fun delete(params: ExecutionDeleteParams): CompletableFuture<Execution> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ExecutionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Execution>

    /** List execution events */
    fun events(params: ExecutionEventsParams): CompletableFuture<ExecutionEventsPageAsync> =
        events(params, RequestOptions.none())

    /** @see events */
    fun events(
        params: ExecutionEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecutionEventsPageAsync>

    /** Get execution output */
    fun output(params: ExecutionOutputParams): CompletableFuture<ExecutionOutput> =
        output(params, RequestOptions.none())

    /** @see output */
    fun output(
        params: ExecutionOutputParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecutionOutput>

    /**
     * A view of [ExecutionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExecutionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/machines/{machine_id}/executions`, but is
         * otherwise the same as [ExecutionServiceAsync.create].
         */
        fun create(params: ExecutionCreateParams): CompletableFuture<HttpResponseFor<Execution>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExecutionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Execution>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/machines/{machine_id}/executions/{execution_id}`, but is otherwise the same as
         * [ExecutionServiceAsync.retrieve].
         */
        fun retrieve(
            params: ExecutionRetrieveParams
        ): CompletableFuture<HttpResponseFor<Execution>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ExecutionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Execution>>

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}/executions`, but is
         * otherwise the same as [ExecutionServiceAsync.list].
         */
        fun list(
            params: ExecutionListParams
        ): CompletableFuture<HttpResponseFor<ExecutionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ExecutionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExecutionListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/machines/{machine_id}/executions/{execution_id}`, but is otherwise the same as
         * [ExecutionServiceAsync.delete].
         */
        fun delete(params: ExecutionDeleteParams): CompletableFuture<HttpResponseFor<Execution>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ExecutionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Execution>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/machines/{machine_id}/executions/{execution_id}/events`, but is otherwise the same as
         * [ExecutionServiceAsync.events].
         */
        fun events(
            params: ExecutionEventsParams
        ): CompletableFuture<HttpResponseFor<ExecutionEventsPageAsync>> =
            events(params, RequestOptions.none())

        /** @see events */
        fun events(
            params: ExecutionEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExecutionEventsPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/machines/{machine_id}/executions/{execution_id}/output`, but is otherwise the same as
         * [ExecutionServiceAsync.output].
         */
        fun output(
            params: ExecutionOutputParams
        ): CompletableFuture<HttpResponseFor<ExecutionOutput>> =
            output(params, RequestOptions.none())

        /** @see output */
        fun output(
            params: ExecutionOutputParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExecutionOutput>>
    }
}
