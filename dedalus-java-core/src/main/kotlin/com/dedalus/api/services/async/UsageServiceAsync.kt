// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async

import com.dedalus.api.core.ClientOptions
import com.dedalus.api.core.RequestOptions
import com.dedalus.api.core.http.HttpResponseFor
import com.dedalus.api.models.usage.MachineComputeUsage
import com.dedalus.api.models.usage.MachineStorageUsage
import com.dedalus.api.models.usage.OrgUsage
import com.dedalus.api.models.usage.UsageMachineComputeParams
import com.dedalus.api.models.usage.UsageMachineStorageParams
import com.dedalus.api.models.usage.UsageRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UsageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageServiceAsync

    /** Get usage summary */
    fun retrieve(): CompletableFuture<OrgUsage> = retrieve(UsageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: UsageRetrieveParams = UsageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgUsage>

    /** @see retrieve */
    fun retrieve(
        params: UsageRetrieveParams = UsageRetrieveParams.none()
    ): CompletableFuture<OrgUsage> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<OrgUsage> =
        retrieve(UsageRetrieveParams.none(), requestOptions)

    /** List machine compute usage breakdown */
    fun machineCompute(): CompletableFuture<MachineComputeUsage> =
        machineCompute(UsageMachineComputeParams.none())

    /** @see machineCompute */
    fun machineCompute(
        params: UsageMachineComputeParams = UsageMachineComputeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MachineComputeUsage>

    /** @see machineCompute */
    fun machineCompute(
        params: UsageMachineComputeParams = UsageMachineComputeParams.none()
    ): CompletableFuture<MachineComputeUsage> = machineCompute(params, RequestOptions.none())

    /** @see machineCompute */
    fun machineCompute(requestOptions: RequestOptions): CompletableFuture<MachineComputeUsage> =
        machineCompute(UsageMachineComputeParams.none(), requestOptions)

    /** List machine storage usage breakdown */
    fun machineStorage(): CompletableFuture<MachineStorageUsage> =
        machineStorage(UsageMachineStorageParams.none())

    /** @see machineStorage */
    fun machineStorage(
        params: UsageMachineStorageParams = UsageMachineStorageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MachineStorageUsage>

    /** @see machineStorage */
    fun machineStorage(
        params: UsageMachineStorageParams = UsageMachineStorageParams.none()
    ): CompletableFuture<MachineStorageUsage> = machineStorage(params, RequestOptions.none())

    /** @see machineStorage */
    fun machineStorage(requestOptions: RequestOptions): CompletableFuture<MachineStorageUsage> =
        machineStorage(UsageMachineStorageParams.none(), requestOptions)

    /** A view of [UsageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/usage`, but is otherwise the same as
         * [UsageServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<OrgUsage>> =
            retrieve(UsageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: UsageRetrieveParams = UsageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgUsage>>

        /** @see retrieve */
        fun retrieve(
            params: UsageRetrieveParams = UsageRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<OrgUsage>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OrgUsage>> =
            retrieve(UsageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/usage/machines/compute`, but is otherwise the
         * same as [UsageServiceAsync.machineCompute].
         */
        fun machineCompute(): CompletableFuture<HttpResponseFor<MachineComputeUsage>> =
            machineCompute(UsageMachineComputeParams.none())

        /** @see machineCompute */
        fun machineCompute(
            params: UsageMachineComputeParams = UsageMachineComputeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MachineComputeUsage>>

        /** @see machineCompute */
        fun machineCompute(
            params: UsageMachineComputeParams = UsageMachineComputeParams.none()
        ): CompletableFuture<HttpResponseFor<MachineComputeUsage>> =
            machineCompute(params, RequestOptions.none())

        /** @see machineCompute */
        fun machineCompute(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MachineComputeUsage>> =
            machineCompute(UsageMachineComputeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/usage/machines/storage`, but is otherwise the
         * same as [UsageServiceAsync.machineStorage].
         */
        fun machineStorage(): CompletableFuture<HttpResponseFor<MachineStorageUsage>> =
            machineStorage(UsageMachineStorageParams.none())

        /** @see machineStorage */
        fun machineStorage(
            params: UsageMachineStorageParams = UsageMachineStorageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MachineStorageUsage>>

        /** @see machineStorage */
        fun machineStorage(
            params: UsageMachineStorageParams = UsageMachineStorageParams.none()
        ): CompletableFuture<HttpResponseFor<MachineStorageUsage>> =
            machineStorage(params, RequestOptions.none())

        /** @see machineStorage */
        fun machineStorage(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MachineStorageUsage>> =
            machineStorage(UsageMachineStorageParams.none(), requestOptions)
    }
}
