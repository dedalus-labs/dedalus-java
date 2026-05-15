// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineTest {

    @Test
    fun create() {
        val machine =
            Machine.builder()
                .autosleepSeconds(0L)
                .desiredState(Machine.DesiredState.RUNNING)
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

        assertThat(machine.autosleepSeconds()).isEqualTo(0L)
        assertThat(machine.desiredState()).isEqualTo(Machine.DesiredState.RUNNING)
        assertThat(machine.machineId()).isEqualTo("machine_id")
        assertThat(machine.memoryMiB()).isEqualTo(0L)
        assertThat(machine.status())
            .isEqualTo(
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
        assertThat(machine.storageGiB()).isEqualTo(0L)
        assertThat(machine.vcpu()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val machine =
            Machine.builder()
                .autosleepSeconds(0L)
                .desiredState(Machine.DesiredState.RUNNING)
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

        val roundtrippedMachine =
            jsonMapper.readValue(jsonMapper.writeValueAsString(machine), jacksonTypeRef<Machine>())

        assertThat(roundtrippedMachine).isEqualTo(machine)
    }
}
