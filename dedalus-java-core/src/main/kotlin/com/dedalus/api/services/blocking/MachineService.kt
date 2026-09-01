// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.machines.CreateParams
import com.dedalus.api.models.machines.Machine
import com.dedalus.api.models.machines.MachineCreateParams
import com.dedalus.api.models.machines.MachineDeleteParams
import com.dedalus.api.models.machines.MachineListPage
import com.dedalus.api.models.machines.MachineListParams
import com.dedalus.api.models.machines.MachineRetrieveParams
import com.dedalus.api.models.machines.MachineRetrieveResponse
import com.dedalus.api.models.machines.MachineSleepParams
import com.dedalus.api.models.machines.MachineUpdateParams
import com.dedalus.api.models.machines.MachineWakeParams
import com.dedalus.api.services.blocking.machines.ExecutionService
import com.dedalus.api.services.blocking.machines.SshService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface MachineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MachineService

    fun ssh(): SshService

    fun executions(): ExecutionService

    /** Create machine */
    fun create(params: MachineCreateParams): Machine = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MachineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Machine

    /** @see create */
    fun create(
        createParams: CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Machine =
        create(MachineCreateParams.builder().createParams(createParams).build(), requestOptions)

    /** @see create */
    fun create(createParams: CreateParams): Machine = create(createParams, RequestOptions.none())

    /** Get machine */
    fun retrieve(params: MachineRetrieveParams): MachineRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MachineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MachineRetrieveResponse

    /** Update machine */
    fun update(params: MachineUpdateParams): Machine = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MachineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Machine

    /** List machines */
    fun list(): MachineListPage = list(MachineListParams.none())

    /** @see list */
    fun list(
        params: MachineListParams = MachineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MachineListPage

    /** @see list */
    fun list(params: MachineListParams = MachineListParams.none()): MachineListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MachineListPage =
        list(MachineListParams.none(), requestOptions)

    /** Destroy machine */
    fun delete(params: MachineDeleteParams): Machine = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MachineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Machine

    /** Sleep a running machine */
    fun sleep(params: MachineSleepParams): Machine = sleep(params, RequestOptions.none())

    /** @see sleep */
    fun sleep(
        params: MachineSleepParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Machine

    /** Wake a sleeping machine */
    fun wake(params: MachineWakeParams): Machine = wake(params, RequestOptions.none())

    /** @see wake */
    fun wake(
        params: MachineWakeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Machine

    /** A view of [MachineService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MachineService.WithRawResponse

        fun ssh(): SshService.WithRawResponse

        fun executions(): ExecutionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/machines`, but is otherwise the same as
         * [MachineService.create].
         */
        @MustBeClosed
        fun create(params: MachineCreateParams): HttpResponseFor<Machine> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MachineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Machine>

        /** @see create */
        @MustBeClosed
        fun create(
            createParams: CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Machine> =
            create(MachineCreateParams.builder().createParams(createParams).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(createParams: CreateParams): HttpResponseFor<Machine> =
            create(createParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/machines/{machine_id}`, but is otherwise the
         * same as [MachineService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: MachineRetrieveParams): HttpResponseFor<MachineRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MachineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MachineRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch /v1/machines/{machine_id}`, but is otherwise the
         * same as [MachineService.update].
         */
        @MustBeClosed
        fun update(params: MachineUpdateParams): HttpResponseFor<Machine> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MachineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Machine>

        /**
         * Returns a raw HTTP response for `get /v1/machines`, but is otherwise the same as
         * [MachineService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<MachineListPage> = list(MachineListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MachineListParams = MachineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MachineListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MachineListParams = MachineListParams.none()
        ): HttpResponseFor<MachineListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MachineListPage> =
            list(MachineListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/machines/{machine_id}`, but is otherwise the
         * same as [MachineService.delete].
         */
        @MustBeClosed
        fun delete(params: MachineDeleteParams): HttpResponseFor<Machine> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MachineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Machine>

        /**
         * Returns a raw HTTP response for `post /v1/machines/{machine_id}/sleep`, but is otherwise
         * the same as [MachineService.sleep].
         */
        @MustBeClosed
        fun sleep(params: MachineSleepParams): HttpResponseFor<Machine> =
            sleep(params, RequestOptions.none())

        /** @see sleep */
        @MustBeClosed
        fun sleep(
            params: MachineSleepParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Machine>

        /**
         * Returns a raw HTTP response for `post /v1/machines/{machine_id}/wake`, but is otherwise
         * the same as [MachineService.wake].
         */
        @MustBeClosed
        fun wake(params: MachineWakeParams): HttpResponseFor<Machine> =
            wake(params, RequestOptions.none())

        /** @see wake */
        @MustBeClosed
        fun wake(
            params: MachineWakeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Machine>
    }
}
