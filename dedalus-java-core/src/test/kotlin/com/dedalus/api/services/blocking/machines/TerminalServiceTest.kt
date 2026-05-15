// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking.machines

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClient
import com.dedalus.api.core.JsonValue
import com.dedalus.api.models.machines.terminals.TerminalCreateParams
import com.dedalus.api.models.machines.terminals.TerminalDeleteParams
import com.dedalus.api.models.machines.terminals.TerminalListParams
import com.dedalus.api.models.machines.terminals.TerminalRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TerminalServiceTest {

    @Test
    fun create() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val terminalService = client.machines().terminals()

        val terminal =
            terminalService.create(
                TerminalCreateParams.builder()
                    .machineId("dm-3")
                    .terminalCreateParams(
                        TerminalCreateParams.builder()
                            .height(0L)
                            .width(0L)
                            .cwd("cwd")
                            .env(
                                TerminalCreateParams.Env.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .shell("shell")
                            .build()
                    )
                    .build()
            )

        terminal.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val terminalService = client.machines().terminals()

        val terminal =
            terminalService.retrieve(
                TerminalRetrieveParams.builder().machineId("dm-3").terminalId("terminal_id").build()
            )

        terminal.validate()
    }

    @Test
    fun list() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val terminalService = client.machines().terminals()

        val page = terminalService.list(TerminalListParams.builder().machineId("dm-3").build())

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val terminalService = client.machines().terminals()

        val terminal =
            terminalService.delete(
                TerminalDeleteParams.builder().machineId("dm-3").terminalId("terminal_id").build()
            )

        terminal.validate()
    }
}
