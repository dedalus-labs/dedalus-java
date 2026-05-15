// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.services.async.machines

import com.dedalus.api.TestServerExtension
import com.dedalus.api.client.okhttp.DedalusOkHttpClientAsync
import com.dedalus.api.models.machines.ssh.SshCreateParams
import com.dedalus.api.models.machines.ssh.SshDeleteParams
import com.dedalus.api.models.machines.ssh.SshListParams
import com.dedalus.api.models.machines.ssh.SshRetrieveParams
import com.dedalus.api.models.machines.ssh.SshSessionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SshServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sshServiceAsync = client.machines().ssh()

        val sshSessionFuture =
            sshServiceAsync.create(
                SshCreateParams.builder()
                    .machineId("dm-3")
                    .sshSessionCreateParams(
                        SshSessionCreateParams.builder().publicKey("public_key").build()
                    )
                    .build()
            )

        val sshSession = sshSessionFuture.get()
        sshSession.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sshServiceAsync = client.machines().ssh()

        val sshSessionFuture =
            sshServiceAsync.retrieve(
                SshRetrieveParams.builder().machineId("dm-3").sessionId("session_id").build()
            )

        val sshSession = sshSessionFuture.get()
        sshSession.validate()
    }

    @Test
    fun list() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sshServiceAsync = client.machines().ssh()

        val pageFuture = sshServiceAsync.list(SshListParams.builder().machineId("dm-3").build())

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DedalusOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sshServiceAsync = client.machines().ssh()

        val sshSessionFuture =
            sshServiceAsync.delete(
                SshDeleteParams.builder().machineId("dm-3").sessionId("session_id").build()
            )

        val sshSession = sshSessionFuture.get()
        sshSession.validate()
    }
}
