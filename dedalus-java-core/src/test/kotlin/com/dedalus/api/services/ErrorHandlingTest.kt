// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services

import com.dedalus.api.client.DedalusClient
import com.dedalus.api.client.okhttp.DedalusOkHttpClient
import com.dedalus.api.core.JsonValue
import com.dedalus.api.core.http.Headers
import com.dedalus.api.core.jsonMapper
import com.dedalus.api.errors.BadRequestException
import com.dedalus.api.errors.DedalusException
import com.dedalus.api.errors.InternalServerException
import com.dedalus.api.errors.NotFoundException
import com.dedalus.api.errors.PermissionDeniedException
import com.dedalus.api.errors.RateLimitException
import com.dedalus.api.errors.UnauthorizedException
import com.dedalus.api.errors.UnexpectedStatusCodeException
import com.dedalus.api.errors.UnprocessableEntityException
import com.dedalus.api.models.machines.CreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: DedalusClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            DedalusOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun machinesCreate400() {
        val machineService = client.machines()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate400WithRawResponse() {
        val machineService = client.machines().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate401() {
        val machineService = client.machines()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate401WithRawResponse() {
        val machineService = client.machines().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate403() {
        val machineService = client.machines()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate403WithRawResponse() {
        val machineService = client.machines().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate404() {
        val machineService = client.machines()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate404WithRawResponse() {
        val machineService = client.machines().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate422() {
        val machineService = client.machines()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate422WithRawResponse() {
        val machineService = client.machines().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate429() {
        val machineService = client.machines()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate429WithRawResponse() {
        val machineService = client.machines().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate500() {
        val machineService = client.machines()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate500WithRawResponse() {
        val machineService = client.machines().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate999() {
        val machineService = client.machines()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreate999WithRawResponse() {
        val machineService = client.machines().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun machinesCreateInvalidJsonBody() {
        val machineService = client.machines()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<DedalusException> {
                machineService.create(
                    CreateParams.builder()
                        .autosleep("autosleep")
                        .memoryMiB(1L)
                        .storageGiB(1L)
                        .vcpu(1.0)
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
