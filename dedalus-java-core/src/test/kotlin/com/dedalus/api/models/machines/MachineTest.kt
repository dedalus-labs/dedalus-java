// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
                .phase(Machine.Phase.ACCEPTED)
                .storageGiB(0L)
                .vcpu(0.0)
                .build()

        assertThat(machine.autosleepSeconds()).isEqualTo(0L)
        assertThat(machine.desiredState()).isEqualTo(Machine.DesiredState.RUNNING)
        assertThat(machine.machineId()).isEqualTo("machine_id")
        assertThat(machine.memoryMiB()).isEqualTo(0L)
        assertThat(machine.phase()).isEqualTo(Machine.Phase.ACCEPTED)
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
                .phase(Machine.Phase.ACCEPTED)
                .storageGiB(0L)
                .vcpu(0.0)
                .build()

        val roundtrippedMachine =
            jsonMapper.readValue(jsonMapper.writeValueAsString(machine), jacksonTypeRef<Machine>())

        assertThat(roundtrippedMachine).isEqualTo(machine)
    }
}
