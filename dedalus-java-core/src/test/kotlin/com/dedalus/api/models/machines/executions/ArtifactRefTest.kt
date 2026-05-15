// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.executions

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtifactRefTest {

    @Test
    fun create() {
        val artifactRef = ArtifactRef.builder().artifactId("artifact_id").name("name").build()

        assertThat(artifactRef.artifactId()).isEqualTo("artifact_id")
        assertThat(artifactRef.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artifactRef = ArtifactRef.builder().artifactId("artifact_id").name("name").build()

        val roundtrippedArtifactRef =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artifactRef),
                jacksonTypeRef<ArtifactRef>(),
            )

        assertThat(roundtrippedArtifactRef).isEqualTo(artifactRef)
    }
}
