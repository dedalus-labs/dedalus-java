// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.artifacts

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtifactListTest {

    @Test
    fun create() {
        val artifactList =
            ArtifactList.builder()
                .addItem(
                    Artifact.builder()
                        .artifactId("artifact_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .machineId("machine_id")
                        .name("name")
                        .sizeBytes(0L)
                        .downloadUrl("download_url")
                        .executionId("execution_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .mimeType("mime_type")
                        .sha256("sha256")
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(artifactList.items().getOrNull())
            .containsExactly(
                Artifact.builder()
                    .artifactId("artifact_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .machineId("machine_id")
                    .name("name")
                    .sizeBytes(0L)
                    .downloadUrl("download_url")
                    .executionId("execution_id")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .mimeType("mime_type")
                    .sha256("sha256")
                    .build()
            )
        assertThat(artifactList.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artifactList =
            ArtifactList.builder()
                .addItem(
                    Artifact.builder()
                        .artifactId("artifact_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .machineId("machine_id")
                        .name("name")
                        .sizeBytes(0L)
                        .downloadUrl("download_url")
                        .executionId("execution_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .mimeType("mime_type")
                        .sha256("sha256")
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedArtifactList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artifactList),
                jacksonTypeRef<ArtifactList>(),
            )

        assertThat(roundtrippedArtifactList).isEqualTo(artifactList)
    }
}
