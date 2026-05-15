// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineListTest {

    @Test
    fun create() {
        val machineList =
            MachineList.builder()
                .addItem(
                    MachineListItem.builder()
                        .autosleepSeconds(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .desiredState(MachineListItem.DesiredState.RUNNING)
                        .machineId("machine_id")
                        .memoryMiB(0L)
                        .status(
                            LifecycleStatus.builder()
                                .lastProgressAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .lastTransitionAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .phase(LifecycleStatus.Phase.ACCEPTED)
                                .reason("reason")
                                .retryable(true)
                                .revision("revision")
                                .lastError("last_error")
                                .build()
                        )
                        .storageGiB(0L)
                        .vcpu(0.0)
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(machineList.items().getOrNull())
            .containsExactly(
                MachineListItem.builder()
                    .autosleepSeconds(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .desiredState(MachineListItem.DesiredState.RUNNING)
                    .machineId("machine_id")
                    .memoryMiB(0L)
                    .status(
                        LifecycleStatus.builder()
                            .lastProgressAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .lastTransitionAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .phase(LifecycleStatus.Phase.ACCEPTED)
                            .reason("reason")
                            .retryable(true)
                            .revision("revision")
                            .lastError("last_error")
                            .build()
                    )
                    .storageGiB(0L)
                    .vcpu(0.0)
                    .build()
            )
        assertThat(machineList.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val machineList =
            MachineList.builder()
                .addItem(
                    MachineListItem.builder()
                        .autosleepSeconds(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .desiredState(MachineListItem.DesiredState.RUNNING)
                        .machineId("machine_id")
                        .memoryMiB(0L)
                        .status(
                            LifecycleStatus.builder()
                                .lastProgressAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .lastTransitionAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .phase(LifecycleStatus.Phase.ACCEPTED)
                                .reason("reason")
                                .retryable(true)
                                .revision("revision")
                                .lastError("last_error")
                                .build()
                        )
                        .storageGiB(0L)
                        .vcpu(0.0)
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedMachineList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(machineList),
                jacksonTypeRef<MachineList>(),
            )

        assertThat(roundtrippedMachineList).isEqualTo(machineList)
    }
}
