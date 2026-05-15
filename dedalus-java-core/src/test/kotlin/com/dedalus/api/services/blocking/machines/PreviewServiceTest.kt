// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking.machines

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClient
import com.dedalus.api.models.machines.previews.PreviewCreateParams
import com.dedalus.api.models.machines.previews.PreviewDeleteParams
import com.dedalus.api.models.machines.previews.PreviewListParams
import com.dedalus.api.models.machines.previews.PreviewRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PreviewServiceTest {

    @Test
    fun create() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val previewService = client.machines().previews()

        val preview =
            previewService.create(
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
            )

        preview.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val previewService = client.machines().previews()

        val preview =
            previewService.retrieve(
                PreviewRetrieveParams.builder().machineId("dm-3").previewId("preview_id").build()
            )

        preview.validate()
    }

    @Test
    fun list() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val previewService = client.machines().previews()

        val page = previewService.list(PreviewListParams.builder().machineId("dm-3").build())

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val previewService = client.machines().previews()

        val preview =
            previewService.delete(
                PreviewDeleteParams.builder().machineId("dm-3").previewId("preview_id").build()
            )

        preview.validate()
    }
}
