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
                    .autosleep("autosleep")
                    .memoryMiB(1L)
                    .storageGiB(1L)
                    .vcpu(1.0)
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
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateParams.builder()
                    .autosleep("autosleep")
                    .memoryMiB(1L)
                    .storageGiB(1L)
                    .vcpu(1.0)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MachineCreateParams.builder().createParams(CreateParams.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(CreateParams.builder().build())
    }
}
