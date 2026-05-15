// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.ssh

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SshRetrieveParamsTest {

    @Test
    fun create() {
        SshRetrieveParams.builder().machineId("dm-3").sessionId("session_id").build()
    }

    @Test
    fun pathParams() {
        val params = SshRetrieveParams.builder().machineId("dm-3").sessionId("session_id").build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        assertThat(params._pathParam(1)).isEqualTo("session_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
