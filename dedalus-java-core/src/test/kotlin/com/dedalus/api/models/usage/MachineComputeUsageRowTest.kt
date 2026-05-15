// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.usage

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineComputeUsageRowTest {

    @Test
    fun create() {
        val machineComputeUsageRow =
            MachineComputeUsageRow.builder()
                .awakeSeconds(0L)
                .bucketEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .bucketStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cpuMillicoreSeconds(0L)
                .lastWindowEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .machineId("machine_id")
                .memoryMiBSeconds(0L)
                .addOrgMeteringBucketId("string")
                .requestedMemoryMiB(0)
                .requestedStorageGiB(0)
                .requestedVcpu(0.0)
                .specFingerprint("spec_fingerprint")
                .addStripeCpuIdentifier("string")
                .addStripeMemoryIdentifier("string")
                .windowCount(0L)
                .latestStripeEmittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(machineComputeUsageRow.awakeSeconds()).isEqualTo(0L)
        assertThat(machineComputeUsageRow.bucketEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(machineComputeUsageRow.bucketStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(machineComputeUsageRow.cpuMillicoreSeconds()).isEqualTo(0L)
        assertThat(machineComputeUsageRow.lastWindowEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(machineComputeUsageRow.machineId()).isEqualTo("machine_id")
        assertThat(machineComputeUsageRow.memoryMiBSeconds()).isEqualTo(0L)
        assertThat(machineComputeUsageRow.orgMeteringBucketIds().getOrNull())
            .containsExactly("string")
        assertThat(machineComputeUsageRow.requestedMemoryMiB()).isEqualTo(0)
        assertThat(machineComputeUsageRow.requestedStorageGiB()).isEqualTo(0)
        assertThat(machineComputeUsageRow.requestedVcpu()).isEqualTo(0.0)
        assertThat(machineComputeUsageRow.specFingerprint()).isEqualTo("spec_fingerprint")
        assertThat(machineComputeUsageRow.stripeCpuIdentifiers().getOrNull())
            .containsExactly("string")
        assertThat(machineComputeUsageRow.stripeMemoryIdentifiers().getOrNull())
            .containsExactly("string")
        assertThat(machineComputeUsageRow.windowCount()).isEqualTo(0L)
        assertThat(machineComputeUsageRow.latestStripeEmittedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val machineComputeUsageRow =
            MachineComputeUsageRow.builder()
                .awakeSeconds(0L)
                .bucketEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .bucketStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cpuMillicoreSeconds(0L)
                .lastWindowEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .machineId("machine_id")
                .memoryMiBSeconds(0L)
                .addOrgMeteringBucketId("string")
                .requestedMemoryMiB(0)
                .requestedStorageGiB(0)
                .requestedVcpu(0.0)
                .specFingerprint("spec_fingerprint")
                .addStripeCpuIdentifier("string")
                .addStripeMemoryIdentifier("string")
                .windowCount(0L)
                .latestStripeEmittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMachineComputeUsageRow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(machineComputeUsageRow),
                jacksonTypeRef<MachineComputeUsageRow>(),
            )

        assertThat(roundtrippedMachineComputeUsageRow).isEqualTo(machineComputeUsageRow)
    }
}
