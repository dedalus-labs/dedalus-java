// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.blocking.machines

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClient
import com.dedalus.api.models.machines.ssh.SshCreateParams
import com.dedalus.api.models.machines.ssh.SshDeleteParams
import com.dedalus.api.models.machines.ssh.SshListParams
import com.dedalus.api.models.machines.ssh.SshRetrieveParams
import com.dedalus.api.models.machines.ssh.SshSessionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SshServiceTest {

    @Test
    fun create() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sshService = client.machines().ssh()

        val sshSession =
            sshService.create(
                SshCreateParams.builder()
                    .machineId("dm-3")
                    .sshSessionCreateParams(
                        SshSessionCreateParams.builder().publicKey("public_key").build()
                    )
                    .build()
            )

        sshSession.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sshService = client.machines().ssh()

        val sshSession =
            sshService.retrieve(
                SshRetrieveParams.builder().machineId("dm-3").sessionId("session_id").build()
            )

        sshSession.validate()
    }

    @Test
    fun list() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sshService = client.machines().ssh()

        val page = sshService.list(SshListParams.builder().machineId("dm-3").build())

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DedalusOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sshService = client.machines().ssh()

        val sshSession =
            sshService.delete(
                SshDeleteParams.builder().machineId("dm-3").sessionId("session_id").build()
            )

        sshSession.validate()
    }
}
