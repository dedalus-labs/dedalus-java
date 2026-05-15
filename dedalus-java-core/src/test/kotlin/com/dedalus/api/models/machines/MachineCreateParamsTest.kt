// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineCreateParamsTest {

    @Test
    fun create() {
        MachineCreateParams.builder()
            .createParams(
                CreateParams.builder()
                    .memoryMiB(0L)
                    .storageGiB(0L)
                    .vcpu(0.0)
                    .autosleep("autosleep")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MachineCreateParams.builder()
                .createParams(
                    CreateParams.builder()
                        .memoryMiB(0L)
                        .storageGiB(0L)
                        .vcpu(0.0)
                        .autosleep("autosleep")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateParams.builder()
                    .memoryMiB(0L)
                    .storageGiB(0L)
                    .vcpu(0.0)
                    .autosleep("autosleep")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MachineCreateParams.builder()
                .createParams(CreateParams.builder().memoryMiB(0L).storageGiB(0L).vcpu(0.0).build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(CreateParams.builder().memoryMiB(0L).storageGiB(0L).vcpu(0.0).build())
    }
}
