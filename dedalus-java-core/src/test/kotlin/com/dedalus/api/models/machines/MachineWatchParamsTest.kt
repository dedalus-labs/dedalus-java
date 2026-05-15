// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineWatchParamsTest {

    @Test
    fun create() {
        MachineWatchParams.builder().machineId("dm-3").lastEventId("Last-Event-ID").build()
    }

    @Test
    fun pathParams() {
        val params = MachineWatchParams.builder().machineId("dm-3").build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            MachineWatchParams.builder().machineId("dm-3").lastEventId("Last-Event-ID").build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Last-Event-ID", "Last-Event-ID").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = MachineWatchParams.builder().machineId("dm-3").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
