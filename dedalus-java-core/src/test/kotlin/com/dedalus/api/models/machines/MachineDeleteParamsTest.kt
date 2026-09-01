// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineDeleteParamsTest {

    @Test
    fun create() {
        MachineDeleteParams.builder().machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c").build()
    }

    @Test
    fun pathParams() {
        val params =
            MachineDeleteParams.builder()
                .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
