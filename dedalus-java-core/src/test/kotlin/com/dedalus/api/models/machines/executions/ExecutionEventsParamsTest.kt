// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionEventsParamsTest {

    @Test
    fun create() {
        ExecutionEventsParams.builder()
            .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
            .executionId("execution_id")
            .cursor("cursor")
            .limit(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExecutionEventsParams.builder()
                .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                .executionId("execution_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
        assertThat(params._pathParam(1)).isEqualTo("execution_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ExecutionEventsParams.builder()
                .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                .executionId("execution_id")
                .cursor("cursor")
                .limit(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ExecutionEventsParams.builder()
                .machineId("dm-ecc2efdd-ddfa-31a9-c6f1-b833d337aa7c")
                .executionId("execution_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
