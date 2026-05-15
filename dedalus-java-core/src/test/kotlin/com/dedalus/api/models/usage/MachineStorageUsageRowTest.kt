// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.usage

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineStorageUsageRowTest {

    @Test
    fun create() {
        val machineStorageUsageRow =
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

        assertThat(machineStorageUsageRow.bucketEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(machineStorageUsageRow.bucketStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(machineStorageUsageRow.logicalStorageBytes()).isEqualTo(0L)
        assertThat(machineStorageUsageRow.machineId()).isEqualTo("machine_id")
        assertThat(machineStorageUsageRow.orgMeteringBucketId()).isEqualTo("org_metering_bucket_id")
        assertThat(machineStorageUsageRow.storageMiBSeconds()).isEqualTo(0L)
        assertThat(machineStorageUsageRow.stripeStorageIdentifier())
            .isEqualTo("stripe_storage_identifier")
        assertThat(machineStorageUsageRow.latestStripeEmittedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val machineStorageUsageRow =
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

        val roundtrippedMachineStorageUsageRow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(machineStorageUsageRow),
                jacksonTypeRef<MachineStorageUsageRow>(),
            )

        assertThat(roundtrippedMachineStorageUsageRow).isEqualTo(machineStorageUsageRow)
    }
}
