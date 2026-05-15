// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.previews

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewCreateParamsTest {

    @Test
    fun create() {
        PreviewCreateParams.builder()
            .machineId("dm-3")
            .previewCreateParams(
                PreviewCreateParams.builder()
                    .port(0L)
                    .protocol(PreviewCreateParams.Protocol.HTTP)
                    .visibility(PreviewCreateParams.Visibility.PUBLIC)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PreviewCreateParams.builder()
                .machineId("dm-3")
                .previewCreateParams(PreviewCreateParams.builder().port(0L).build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PreviewCreateParams.builder()
                .machineId("dm-3")
                .previewCreateParams(
                    PreviewCreateParams.builder()
                        .port(0L)
                        .protocol(PreviewCreateParams.Protocol.HTTP)
                        .visibility(PreviewCreateParams.Visibility.PUBLIC)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PreviewCreateParams.builder()
                    .port(0L)
                    .protocol(PreviewCreateParams.Protocol.HTTP)
                    .visibility(PreviewCreateParams.Visibility.PUBLIC)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PreviewCreateParams.builder()
                .machineId("dm-3")
                .previewCreateParams(PreviewCreateParams.builder().port(0L).build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PreviewCreateParams.builder().port(0L).build())
    }
}
