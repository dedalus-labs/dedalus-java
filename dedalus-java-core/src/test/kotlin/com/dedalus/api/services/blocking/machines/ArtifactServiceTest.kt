// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking.machines

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClient
import com.dedalus.api.models.machines.artifacts.ArtifactDeleteParams
import com.dedalus.api.models.machines.artifacts.ArtifactListParams
import com.dedalus.api.models.machines.artifacts.ArtifactRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ArtifactServiceTest {

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val artifactService = client.machines().artifacts()

        val artifact =
            artifactService.retrieve(
                ArtifactRetrieveParams.builder().machineId("dm-3").artifactId("artifact_id").build()
            )

        artifact.validate()
    }

    @Test
    fun list() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val artifactService = client.machines().artifacts()

        val page = artifactService.list(ArtifactListParams.builder().machineId("dm-3").build())

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val artifactService = client.machines().artifacts()

        val artifact =
            artifactService.delete(
                ArtifactDeleteParams.builder().machineId("dm-3").artifactId("artifact_id").build()
            )

        artifact.validate()
    }
}
