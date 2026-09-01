// File generated from our OpenAPI spec by Stainless.

package com.dedalus.api.proguard

import com.dedalus.api.client.okhttp.DedalusOkHttpClient
import com.dedalus.api.core.jsonMapper
import com.dedalus.api.models.machines.CreateParams
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/dedalus-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = DedalusOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.machines()).isNotNull()
    }

    @Test
    fun createParamsRoundtrip() {
        val jsonMapper = jsonMapper()
        val createParams =
            CreateParams.builder()
                .autosleep("autosleep")
                .memoryMiB(1L)
                .storageGiB(1L)
                .vcpu(1.0)
                .build()

        val roundtrippedCreateParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createParams),
                jacksonTypeRef<CreateParams>(),
            )

        assertThat(roundtrippedCreateParams).isEqualTo(createParams)
    }
}
