// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.usage

import com.dedalus.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageMachineStorageParamsTest {

    @Test
    fun create() {
        UsageMachineStorageParams.builder()
            .machineId("machine_id")
            .periodEnd("period_end")
            .periodStart("period_start")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UsageMachineStorageParams.builder()
                .machineId("machine_id")
                .periodEnd("period_end")
                .periodStart("period_start")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("machine_id", "machine_id")
                    .put("period_end", "period_end")
                    .put("period_start", "period_start")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UsageMachineStorageParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
