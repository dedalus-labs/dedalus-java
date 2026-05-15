// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.usage

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineStorageUsageTest {

    @Test
    fun create() {
        val machineStorageUsage =
            MachineStorageUsage.builder()
                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRow(
                    MachineStorageUsageRow.builder()
                        .bucketEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .bucketStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .logicalStorageBytes(0L)
                        .machineId("machine_id")
                        .orgMeteringBucketId("org_metering_bucket_id")
                        .storageMiBSeconds(0L)
                        .stripeStorageIdentifier("stripe_storage_identifier")
                        .latestStripeEmittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(machineStorageUsage.periodEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(machineStorageUsage.periodStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(machineStorageUsage.rows().getOrNull())
            .containsExactly(
                MachineStorageUsageRow.builder()
                    .bucketEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .bucketStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .logicalStorageBytes(0L)
                    .machineId("machine_id")
                    .orgMeteringBucketId("org_metering_bucket_id")
                    .storageMiBSeconds(0L)
                    .stripeStorageIdentifier("stripe_storage_identifier")
                    .latestStripeEmittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val machineStorageUsage =
            MachineStorageUsage.builder()
                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRow(
                    MachineStorageUsageRow.builder()
                        .bucketEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .bucketStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .logicalStorageBytes(0L)
                        .machineId("machine_id")
                        .orgMeteringBucketId("org_metering_bucket_id")
                        .storageMiBSeconds(0L)
                        .stripeStorageIdentifier("stripe_storage_identifier")
                        .latestStripeEmittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedMachineStorageUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(machineStorageUsage),
                jacksonTypeRef<MachineStorageUsage>(),
            )

        assertThat(roundtrippedMachineStorageUsage).isEqualTo(machineStorageUsage)
    }
}
