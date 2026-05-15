// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionEventsParamsTest {

    @Test
    fun create() {
        ExecutionEventsParams.builder()
            .machineId("dm-3")
            .executionId("execution_id")
            .cursor("cursor")
            .limit(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExecutionEventsParams.builder().machineId("dm-3").executionId("execution_id").build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        assertThat(params._pathParam(1)).isEqualTo("execution_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ExecutionEventsParams.builder()
                .machineId("dm-3")
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
            ExecutionEventsParams.builder().machineId("dm-3").executionId("execution_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
