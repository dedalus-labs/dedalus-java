// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.artifacts

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtifactTest {

    @Test
    fun create() {
        val artifact =
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

        assertThat(artifact.artifactId()).isEqualTo("artifact_id")
        assertThat(artifact.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(artifact.machineId()).isEqualTo("machine_id")
        assertThat(artifact.name()).isEqualTo("name")
        assertThat(artifact.sizeBytes()).isEqualTo(0L)
        assertThat(artifact.downloadUrl()).contains("download_url")
        assertThat(artifact.executionId()).contains("execution_id")
        assertThat(artifact.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(artifact.mimeType()).contains("mime_type")
        assertThat(artifact.sha256()).contains("sha256")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artifact =
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

        val roundtrippedArtifact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artifact),
                jacksonTypeRef<Artifact>(),
            )

        assertThat(roundtrippedArtifact).isEqualTo(artifact)
    }
}
