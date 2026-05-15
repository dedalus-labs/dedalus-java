// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateParamsTest {

    @Test
    fun create() {
        val createParams =
            CreateParams.builder()
                .memoryMiB(0L)
                .storageGiB(0L)
                .vcpu(0.0)
                .autosleep("autosleep")
                .build()

        assertThat(createParams.memoryMiB()).isEqualTo(0L)
        assertThat(createParams.storageGiB()).isEqualTo(0L)
        assertThat(createParams.vcpu()).isEqualTo(0.0)
        assertThat(createParams.autosleep()).contains("autosleep")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createParams =
            CreateParams.builder()
                .memoryMiB(0L)
                .storageGiB(0L)
                .vcpu(0.0)
                .autosleep("autosleep")
                .build()

        val roundtrippedCreateParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createParams),
                jacksonTypeRef<CreateParams>(),
            )

        assertThat(roundtrippedCreateParams).isEqualTo(createParams)
    }
}
