// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            MachineUpdateParams.builder()
                .machineId("dm-3")
                .updateParams(UpdateParams.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateParams.builder()
                    .autosleep("autosleep")
                    .memoryMiB(0L)
                    .storageGiB(0L)
                    .vcpu(0.0)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MachineUpdateParams.builder()
                .machineId("dm-3")
                .updateParams(UpdateParams.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(UpdateParams.builder().build())
    }
}
