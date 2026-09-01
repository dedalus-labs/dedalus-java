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
                    .autosleep("autosleep")
                    .memoryMiB(1L)
                    .storageGiB(1L)
                    .vcpu(1.0)
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
            machineService.retrieve(
                MachineRetrieveParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .build()
            )

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
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
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

        val machine =
            machineService.delete(
                MachineDeleteParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .build()
            )

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

        val machine =
            machineService.sleep(
                MachineSleepParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .build()
            )

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

        val machine =
            machineService.wake(
                MachineWakeParams.builder()
                    .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                    .build()
            )

        machine.validate()
    }
}
