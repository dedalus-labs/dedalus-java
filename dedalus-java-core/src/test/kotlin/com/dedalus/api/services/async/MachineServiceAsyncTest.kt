// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClientAsync
import com.dedalus.api.models.machines.CreateParams
import com.dedalus.api.models.machines.MachineDeleteParams
import com.dedalus.api.models.machines.MachineRetrieveParams
import com.dedalus.api.models.machines.MachineSleepParams
import com.dedalus.api.models.machines.MachineUpdateParams
import com.dedalus.api.models.machines.MachineWakeParams
import com.dedalus.api.models.machines.MachineWatchParams
import com.dedalus.api.models.machines.UpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MachineServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineServiceAsync = client.machines()

        val machineFuture =
            machineServiceAsync.create(
                CreateParams.builder()
                    .memoryMiB(0L)
                    .storageGiB(0L)
                    .vcpu(0.0)
                    .autosleep("autosleep")
                    .build()
            )

        val machine = machineFuture.get()
        machine.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineServiceAsync = client.machines()

        val machineFuture =
            machineServiceAsync.retrieve(MachineRetrieveParams.builder().machineId("dm-3").build())

        val machine = machineFuture.get()
        machine.validate()
    }

    @Test
    fun update() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineServiceAsync = client.machines()

        val machineFuture =
            machineServiceAsync.update(
                MachineUpdateParams.builder()
                    .machineId("dm-3")
                    .updateParams(
                        UpdateParams.builder()
                            .autosleep("autosleep")
                            .memoryMiB(0L)
                            .storageGiB(0L)
                            .vcpu(0.0)
                            .build()
                    )
                    .build()
            )

        val machine = machineFuture.get()
        machine.validate()
    }

    @Test
    fun list() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineServiceAsync = client.machines()

        val pageFuture = machineServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineServiceAsync = client.machines()

        val machineFuture =
            machineServiceAsync.delete(MachineDeleteParams.builder().machineId("dm-3").build())

        val machine = machineFuture.get()
        machine.validate()
    }

    @Test
    fun sleep() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineServiceAsync = client.machines()

        val machineFuture =
            machineServiceAsync.sleep(MachineSleepParams.builder().machineId("dm-3").build())

        val machine = machineFuture.get()
        machine.validate()
    }

    @Test
    fun wake() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineServiceAsync = client.machines()

        val machineFuture =
            machineServiceAsync.wake(MachineWakeParams.builder().machineId("dm-3").build())

        val machine = machineFuture.get()
        machine.validate()
    }

    @Test
    fun watchStreaming() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineServiceAsync = client.machines()

        val machineStreamResponse =
            machineServiceAsync.watchStreaming(
                MachineWatchParams.builder().machineId("dm-3").lastEventId("Last-Event-ID").build()
            )

        val onCompleteFuture =
            machineStreamResponse.subscribe { machine -> machine.validate() }.onCompleteFuture()
        onCompleteFuture.get()
    }
}
