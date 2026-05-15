// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.usage

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgUsageTest {

    @Test
    fun create() {
        val orgUsage =
            OrgUsage.builder()
                .billedAwakeSeconds(0L)
                .billedCpuMillicoreSeconds(0L)
                .billedLogicalStorageMiBSeconds(0L)
                .billedMemoryMiBSeconds(0L)
                .includedStorageGiB(0L)
                .planSlug("plan_slug")
                .provisionedStorageGiB(0L)
                .build()

        assertThat(orgUsage.billedAwakeSeconds()).isEqualTo(0L)
        assertThat(orgUsage.billedCpuMillicoreSeconds()).isEqualTo(0L)
        assertThat(orgUsage.billedLogicalStorageMiBSeconds()).isEqualTo(0L)
        assertThat(orgUsage.billedMemoryMiBSeconds()).isEqualTo(0L)
        assertThat(orgUsage.includedStorageGiB()).isEqualTo(0L)
        assertThat(orgUsage.planSlug()).isEqualTo("plan_slug")
        assertThat(orgUsage.provisionedStorageGiB()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgUsage =
            OrgUsage.builder()
                .billedAwakeSeconds(0L)
                .billedCpuMillicoreSeconds(0L)
                .billedLogicalStorageMiBSeconds(0L)
                .billedMemoryMiBSeconds(0L)
                .includedStorageGiB(0L)
                .planSlug("plan_slug")
                .provisionedStorageGiB(0L)
                .build()

        val roundtrippedOrgUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgUsage),
                jacksonTypeRef<OrgUsage>(),
            )

        assertThat(roundtrippedOrgUsage).isEqualTo(orgUsage)
    }
}
