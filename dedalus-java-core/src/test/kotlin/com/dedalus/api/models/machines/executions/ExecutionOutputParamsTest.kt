// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionOutputParamsTest {

    @Test
    fun create() {
        ExecutionOutputParams.builder()
            .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
            .executionId("execution_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExecutionOutputParams.builder()
                .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                .executionId("execution_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
        assertThat(params._pathParam(1)).isEqualTo("execution_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
