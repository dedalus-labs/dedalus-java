// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.previews

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewRetrieveParamsTest {

    @Test
    fun create() {
        PreviewRetrieveParams.builder().machineId("dm-3").previewId("preview_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            PreviewRetrieveParams.builder().machineId("dm-3").previewId("preview_id").build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        assertThat(params._pathParam(1)).isEqualTo("preview_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
