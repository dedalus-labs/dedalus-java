// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionListParamsTest {

    @Test
    fun create() {
        ExecutionListParams.builder().machineId("dm-3").cursor("cursor").limit(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ExecutionListParams.builder().machineId("dm-3").build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ExecutionListParams.builder().machineId("dm-3").cursor("cursor").limit(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExecutionListParams.builder().machineId("dm-3").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
