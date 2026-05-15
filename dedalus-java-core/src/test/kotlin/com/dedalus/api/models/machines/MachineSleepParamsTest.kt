// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineSleepParamsTest {

    @Test
    fun create() {
        MachineSleepParams.builder().machineId("dm-3").build()
    }

    @Test
    fun pathParams() {
        val params = MachineSleepParams.builder().machineId("dm-3").build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
