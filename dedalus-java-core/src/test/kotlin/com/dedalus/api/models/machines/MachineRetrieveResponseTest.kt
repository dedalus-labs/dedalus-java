// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineRetrieveResponseTest {

    @Test
    fun create() {
        val machineRetrieveResponse =
            MachineRetrieveResponse.builder()
                .autosleepSeconds(0L)
                .desiredState(MachineRetrieveResponse.DesiredState.RUNNING)
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

        assertThat(machineRetrieveResponse.autosleepSeconds()).isEqualTo(0L)
        assertThat(machineRetrieveResponse.desiredState())
            .isEqualTo(MachineRetrieveResponse.DesiredState.RUNNING)
        assertThat(machineRetrieveResponse.machineId()).isEqualTo("machine_id")
        assertThat(machineRetrieveResponse.memoryMiB()).isEqualTo(0L)
        assertThat(machineRetrieveResponse.status())
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
        assertThat(machineRetrieveResponse.storageGiB()).isEqualTo(0L)
        assertThat(machineRetrieveResponse.vcpu()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val machineRetrieveResponse =
            MachineRetrieveResponse.builder()
                .autosleepSeconds(0L)
                .desiredState(MachineRetrieveResponse.DesiredState.RUNNING)
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

        val roundtrippedMachineRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(machineRetrieveResponse),
                jacksonTypeRef<MachineRetrieveResponse>(),
            )

        assertThat(roundtrippedMachineRetrieveResponse).isEqualTo(machineRetrieveResponse)
    }
}
