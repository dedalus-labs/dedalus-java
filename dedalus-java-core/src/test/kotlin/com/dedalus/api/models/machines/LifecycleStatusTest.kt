// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.models.machines

import com.dedalus.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LifecycleStatusTest {

    @Test
    fun create() {
        val lifecycleStatus =
            LifecycleStatus.builder()
                .lastProgressAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastTransitionAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .phase(LifecycleStatus.Phase.ACCEPTED)
                .reason("reason")
                .retryable(true)
                .revision("revision")
                .lastError("last_error")
                .build()

        assertThat(lifecycleStatus.lastProgressAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lifecycleStatus.lastTransitionAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lifecycleStatus.phase()).isEqualTo(LifecycleStatus.Phase.ACCEPTED)
        assertThat(lifecycleStatus.reason()).isEqualTo("reason")
        assertThat(lifecycleStatus.retryable()).isEqualTo(true)
        assertThat(lifecycleStatus.revision()).isEqualTo("revision")
        assertThat(lifecycleStatus.lastError()).contains("last_error")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lifecycleStatus =
            LifecycleStatus.builder()
                .lastProgressAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastTransitionAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .phase(LifecycleStatus.Phase.ACCEPTED)
                .reason("reason")
                .retryable(true)
                .revision("revision")
                .lastError("last_error")
                .build()

        val roundtrippedLifecycleStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lifecycleStatus),
                jacksonTypeRef<LifecycleStatus>(),
            )

        assertThat(roundtrippedLifecycleStatus).isEqualTo(lifecycleStatus)
    }
}
