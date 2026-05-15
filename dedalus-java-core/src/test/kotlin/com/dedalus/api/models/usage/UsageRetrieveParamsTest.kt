// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.usage

import com.dedalus.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageRetrieveParamsTest {

    @Test
    fun create() {
        UsageRetrieveParams.builder().periodStart("period_start").build()
    }

    @Test
    fun queryParams() {
        val params = UsageRetrieveParams.builder().periodStart("period_start").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("period_start", "period_start").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UsageRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
