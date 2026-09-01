// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineListItemTest {

    @Test
    fun create() {
        val machineListItem =
            MachineListItem.builder()
                .autosleepSeconds(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .desiredState(MachineListItem.DesiredState.RUNNING)
                .machineId("machine_id")
                .memoryMiB(0L)
                .phase(MachineListItem.Phase.ACCEPTED)
                .storageGiB(0L)
                .vcpu(0.0)
                .build()

        assertThat(machineListItem.autosleepSeconds()).isEqualTo(0L)
        assertThat(machineListItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(machineListItem.desiredState()).isEqualTo(MachineListItem.DesiredState.RUNNING)
        assertThat(machineListItem.machineId()).isEqualTo("machine_id")
        assertThat(machineListItem.memoryMiB()).isEqualTo(0L)
        assertThat(machineListItem.phase()).isEqualTo(MachineListItem.Phase.ACCEPTED)
        assertThat(machineListItem.storageGiB()).isEqualTo(0L)
        assertThat(machineListItem.vcpu()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val machineListItem =
            MachineListItem.builder()
                .autosleepSeconds(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .desiredState(MachineListItem.DesiredState.RUNNING)
                .machineId("machine_id")
                .memoryMiB(0L)
                .phase(MachineListItem.Phase.ACCEPTED)
                .storageGiB(0L)
                .vcpu(0.0)
                .build()

        val roundtrippedMachineListItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(machineListItem),
                jacksonTypeRef<MachineListItem>(),
            )

        assertThat(roundtrippedMachineListItem).isEqualTo(machineListItem)
    }
}
