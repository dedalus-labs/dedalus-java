// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.usage

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineComputeUsageTest {

    @Test
    fun create() {
        val machineComputeUsage =
            MachineComputeUsage.builder()
                .granularity("granularity")
                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRow(
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
                )
                .build()

        assertThat(machineComputeUsage.granularity()).isEqualTo("granularity")
        assertThat(machineComputeUsage.periodEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(machineComputeUsage.periodStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(machineComputeUsage.rows().getOrNull())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val machineComputeUsage =
            MachineComputeUsage.builder()
                .granularity("granularity")
                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRow(
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
                )
                .build()

        val roundtrippedMachineComputeUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(machineComputeUsage),
                jacksonTypeRef<MachineComputeUsage>(),
            )

        assertThat(roundtrippedMachineComputeUsage).isEqualTo(machineComputeUsage)
    }
}
