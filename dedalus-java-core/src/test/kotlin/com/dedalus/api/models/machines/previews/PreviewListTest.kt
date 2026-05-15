// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.previews

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewListTest {

    @Test
    fun create() {
        val previewList =
            PreviewList.builder()
                .addItem(
                    Preview.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .machineId("machine_id")
                        .port(0L)
                        .previewId("preview_id")
                        .status(Preview.Status.WAKE_IN_PROGRESS)
                        .visibility(Preview.Visibility.PUBLIC)
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .protocol(Preview.Protocol.HTTP)
                        .readyAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .retryAfterMs(0L)
                        .url("url")
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(previewList.items().getOrNull())
            .containsExactly(
                Preview.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .machineId("machine_id")
                    .port(0L)
                    .previewId("preview_id")
                    .status(Preview.Status.WAKE_IN_PROGRESS)
                    .visibility(Preview.Visibility.PUBLIC)
                    .errorCode("error_code")
                    .errorMessage("error_message")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .protocol(Preview.Protocol.HTTP)
                    .readyAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .retryAfterMs(0L)
                    .url("url")
                    .build()
            )
        assertThat(previewList.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val previewList =
            PreviewList.builder()
                .addItem(
                    Preview.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .machineId("machine_id")
                        .port(0L)
                        .previewId("preview_id")
                        .status(Preview.Status.WAKE_IN_PROGRESS)
                        .visibility(Preview.Visibility.PUBLIC)
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .protocol(Preview.Protocol.HTTP)
                        .readyAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .retryAfterMs(0L)
                        .url("url")
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedPreviewList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(previewList),
                jacksonTypeRef<PreviewList>(),
            )

        assertThat(roundtrippedPreviewList).isEqualTo(previewList)
    }
}
