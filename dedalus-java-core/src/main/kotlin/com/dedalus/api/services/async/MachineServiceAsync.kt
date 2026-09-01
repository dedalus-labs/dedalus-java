// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.machines.CreateParams
import com.dedalus.api.models.machines.Machine
import com.dedalus.api.models.machines.MachineCreateParams
import com.dedalus.api.models.machines.MachineDeleteParams
import com.dedalus.api.models.machines.MachineListPageAsync
import com.dedalus.api.models.machines.MachineListParams
import com.dedalus.api.models.machines.MachineRetrieveParams
import com.dedalus.api.models.machines.MachineRetrieveResponse
import com.dedalus.api.models.machines.MachineSleepParams
import com.dedalus.api.models.machines.MachineUpdateParams
import com.dedalus.api.models.machines.MachineWakeParams
import com.dedalus.api.services.async.machines.ExecutionServiceAsync
import com.dedalus.api.services.async.machines.SshServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MachineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MachineServiceAsync

    fun ssh(): SshServiceAsync

    fun executions(): ExecutionServiceAsync

    /** Create machine */
    fun create(params: MachineCreateParams): CompletableFuture<Machine> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MachineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Machine>

    /** @see create */
    fun create(
        createParams: CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Machine> =
        create(MachineCreateParams.builder().createParams(createParams).build(), requestOptions)

    /** @see create */
    fun create(createParams: CreateParams): CompletableFuture<Machine> =
        create(createParams, RequestOptions.none())

    /** Get machine */
    fun retrieve(params: MachineRetrieveParams): CompletableFuture<MachineRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MachineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MachineRetrieveResponse>

    /** Update machine */
    fun update(params: MachineUpdateParams): CompletableFuture<Machine> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MachineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Machine>

    /** List machines */
    fun list(): CompletableFuture<MachineListPageAsync> = list(MachineListParams.none())

    /** @see list */
    fun list(
        params: MachineListParams = MachineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MachineListPageAsync>

    /** @see list */
    fun list(
        params: MachineListParams = MachineListParams.none()
    ): CompletableFuture<MachineListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MachineListPageAsync> =
        list(MachineListParams.none(), requestOptions)

    /** Destroy machine */
    fun delete(params: MachineDeleteParams): CompletableFuture<Machine> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MachineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Machine>

    /** Sleep a running machine */
    fun sleep(params: MachineSleepParams): CompletableFuture<Machine> =
        sleep(params, RequestOptions.none())

    /** @see sleep */
    fun sleep(
        params: MachineSleepParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Machine>

    /** Wake a sleeping machine */
    fun wake(params: MachineWakeParams): CompletableFuture<Machine> =
        wake(params, RequestOptions.none())

    /** @see wake */
    fun wake(
        params: MachineWakeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Machine>

    /**
     * A view of [MachineServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MachineServiceAsync.WithRawResponse

        fun ssh(): SshServiceAsync.WithRawResponse

        fun executions(): ExecutionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/machines`, but is otherwise the same as
         * [MachineServiceAsync.create].
         */
        fun create(params: MachineCreateParams): CompletableFuture<HttpResponseFor<Machine>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MachineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Machine>>

        /** @see create */
        fun create(
            createParams: CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Machine>> =
            create(MachineCreateParams.builder().createParams(createParams).build(), requestOptions)

        /** @see create */
        fun create(createParams: CreateParams): CompletableFuture<HttpResponseFor<Machine>> =
            create(createParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}`, but is otherwise the
         * same as [MachineServiceAsync.retrieve].
         */
        fun retrieve(
            params: MachineRetrieveParams
        ): CompletableFuture<HttpResponseFor<MachineRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MachineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MachineRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch /v1/machines/{machine_id}`, but is otherwise the
         * same as [MachineServiceAsync.update].
         */
        fun update(params: MachineUpdateParams): CompletableFuture<HttpResponseFor<Machine>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MachineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Machine>>

        /**
         * Returns a raw HTTP response for `get /v1/machines`, but is otherwise the same as
         * [MachineServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MachineListPageAsync>> =
            list(MachineListParams.none())

        /** @see list */
        fun list(
            params: MachineListParams = MachineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MachineListPageAsync>>

        /** @see list */
        fun list(
            params: MachineListParams = MachineListParams.none()
        ): CompletableFuture<HttpResponseFor<MachineListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MachineListPageAsync>> =
            list(MachineListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/machines/{machine_id}`, but is otherwise the
         * same as [MachineServiceAsync.delete].
         */
        fun delete(params: MachineDeleteParams): CompletableFuture<HttpResponseFor<Machine>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MachineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Machine>>

        /**
         * Returns a raw HTTP response for `post /v1/machines/{machine_id}/sleep`, but is otherwise
         * the same as [MachineServiceAsync.sleep].
         */
        fun sleep(params: MachineSleepParams): CompletableFuture<HttpResponseFor<Machine>> =
            sleep(params, RequestOptions.none())

        /** @see sleep */
        fun sleep(
            params: MachineSleepParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Machine>>

        /**
         * Returns a raw HTTP response for `post /v1/machines/{machine_id}/wake`, but is otherwise
         * the same as [MachineServiceAsync.wake].
         */
        fun wake(params: MachineWakeParams): CompletableFuture<HttpResponseFor<Machine>> =
            wake(params, RequestOptions.none())

        /** @see wake */
        fun wake(
            params: MachineWakeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Machine>>
    }
}
