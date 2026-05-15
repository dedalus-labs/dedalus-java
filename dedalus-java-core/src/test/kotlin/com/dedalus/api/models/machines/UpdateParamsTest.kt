// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateParamsTest {

    @Test
    fun create() {
        val updateParams =
            UpdateParams.builder()
                .autosleep("autosleep")
                .memoryMiB(0L)
                .storageGiB(0L)
                .vcpu(0.0)
                .build()

        assertThat(updateParams.autosleep()).contains("autosleep")
        assertThat(updateParams.memoryMiB()).contains(0L)
        assertThat(updateParams.storageGiB()).contains(0L)
        assertThat(updateParams.vcpu()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateParams =
            UpdateParams.builder()
                .autosleep("autosleep")
                .memoryMiB(0L)
                .storageGiB(0L)
                .vcpu(0.0)
                .build()

        val roundtrippedUpdateParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateParams),
                jacksonTypeRef<UpdateParams>(),
            )

        assertThat(roundtrippedUpdateParams).isEqualTo(updateParams)
    }
}
