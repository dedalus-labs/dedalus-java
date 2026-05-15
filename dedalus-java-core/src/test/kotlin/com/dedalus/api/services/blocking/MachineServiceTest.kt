// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClient
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
internal class MachineServiceTest {

    @Test
    fun create() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineService = client.machines()

        val machine =
            machineService.create(
                CreateParams.builder()
                    .memoryMiB(0L)
                    .storageGiB(0L)
                    .vcpu(0.0)
                    .autosleep("autosleep")
                    .build()
            )

        machine.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineService = client.machines()

        val machine =
            machineService.retrieve(MachineRetrieveParams.builder().machineId("dm-3").build())

        machine.validate()
    }

    @Test
    fun update() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineService = client.machines()

        val machine =
            machineService.update(
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

        machine.validate()
    }

    @Test
    fun list() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineService = client.machines()

        val page = machineService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineService = client.machines()

        val machine = machineService.delete(MachineDeleteParams.builder().machineId("dm-3").build())

        machine.validate()
    }

    @Test
    fun sleep() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineService = client.machines()

        val machine = machineService.sleep(MachineSleepParams.builder().machineId("dm-3").build())

        machine.validate()
    }

    @Test
    fun wake() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineService = client.machines()

        val machine = machineService.wake(MachineWakeParams.builder().machineId("dm-3").build())

        machine.validate()
    }

    @Test
    fun watchStreaming() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val machineService = client.machines()

        val machineStreamResponse =
            machineService.watchStreaming(
                MachineWatchParams.builder().machineId("dm-3").lastEventId("Last-Event-ID").build()
            )

        machineStreamResponse.use {
            machineStreamResponse.stream().forEach { machine -> machine.validate() }
        }
    }
}
