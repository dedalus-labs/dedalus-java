// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionDeleteParamsTest {

    @Test
    fun create() {
        ExecutionDeleteParams.builder().machineId("dm-3").executionId("execution_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            ExecutionDeleteParams.builder().machineId("dm-3").executionId("execution_id").build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        assertThat(params._pathParam(1)).isEqualTo("execution_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
