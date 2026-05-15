// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines.artifacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtifactRetrieveParamsTest {

    @Test
    fun create() {
        ArtifactRetrieveParams.builder().machineId("dm-3").artifactId("artifact_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            ArtifactRetrieveParams.builder().machineId("dm-3").artifactId("artifact_id").build()

        assertThat(params._pathParam(0)).isEqualTo("dm-3")
        assertThat(params._pathParam(1)).isEqualTo("artifact_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
