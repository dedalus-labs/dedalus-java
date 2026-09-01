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
                .autosleep("autosleep")
                .memoryMiB(1L)
                .storageGiB(1L)
                .vcpu(1.0)
                .build()

        assertThat(createParams.autosleep()).contains("autosleep")
        assertThat(createParams.memoryMiB()).contains(1L)
        assertThat(createParams.storageGiB()).contains(1L)
        assertThat(createParams.vcpu()).contains(1.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createParams =
            CreateParams.builder()
                .autosleep("autosleep")
                .memoryMiB(1L)
                .storageGiB(1L)
                .vcpu(1.0)
                .build()

        val roundtrippedCreateParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createParams),
                jacksonTypeRef<CreateParams>(),
            )

        assertThat(roundtrippedCreateParams).isEqualTo(createParams)
    }
}
