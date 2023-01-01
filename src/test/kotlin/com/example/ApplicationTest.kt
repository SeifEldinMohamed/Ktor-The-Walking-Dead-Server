package com.example

import io.ktor.http.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.example.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        application {
            configureRouting()
        }
        client.get("/").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status // The HttpStatusCode returned by the server. It includes both, the HttpStatusCode.description and the HttpStatusCode.value (code).
            )
            assertEquals(
                expected = "Welcome to The Walking Dead API !",
                actual = bodyAsText() // Read the HttpResponse.content as a String.
            )
        }
    }
}