package com.example

import com.example.dii.koinModule
import com.example.models.ApiResponse
import io.ktor.http.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.example.plugins.*
import com.example.repository.CharacterRepository
import com.example.repository.CharacterRepositoryImp
import com.example.repository.NEXT_PAGE_KEY
import com.example.repository.PREV_PAGE_KEY
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.junit.After
import org.junit.Assert
import org.koin.core.context.GlobalContext.stopKoin
import org.koin.core.context.startKoin
import org.koin.java.KoinJavaComponent.inject
import org.koin.ktor.plugin.Koin

class ApplicationTest {

    private val characterRepository: CharacterRepository by inject(CharacterRepository::class.java)

    @Test
    fun `access root endpoint, then assert correct information`() = testApplication {
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

    @Test
    fun `access all characters endpoint, assert correct information`() = testApplication {
        environment {
            developmentMode = false
        }

        application {
            configureRouting()
        }
        client.get("/characters").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status // The HttpStatusCode returned by the server. It includes both, the HttpStatusCode.description and the HttpStatusCode.value (code).
            )
            val expected = ApiResponse(
                success = true,
                message = "ok",
                prevPage = null,
                nextPage = 2,
                characters = characterRepository.page1
            )
            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
            assertEquals(
                expected = expected.success,
                actual = actual.success
            )
            assertEquals(
                expected = expected.characters,
                actual = actual.characters
            )
            assertEquals(
                expected = expected.message,
                actual = actual.message
            )
            assertEquals(
                expected = expected.prevPage,
                actual = actual.prevPage
            )
            assertEquals(
                expected = expected.nextPage,
                actual = actual.nextPage
            )
        }
    }

    @Test
    fun `access all characters endpoint with second page query, assert correct information`() = testApplication {
        environment {
            developmentMode = false
        }

        application {
            configureRouting()
        }
        client.get("/characters?page=2").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status // The HttpStatusCode returned by the server. It includes both, the HttpStatusCode.description and the HttpStatusCode.value (code).
            )
            val expected = ApiResponse(
                success = true,
                message = "ok",
                prevPage = 1,
                nextPage = 3,
                characters = characterRepository.page2
            )
            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
            assertEquals(
                expected = expected.success,
                actual = actual.success
            )
            assertEquals(
                expected = expected.characters,
                actual = actual.characters
            )
            assertEquals(
                expected = expected.message,
                actual = actual.message
            )
            assertEquals(
                expected = expected.prevPage,
                actual = actual.prevPage
            )
            assertEquals(
                expected = expected.nextPage,
                actual = actual.nextPage
            )
        }
    }

//    @Test
//    fun `access all characters endpoint with query all pages assert correct information`() = testApplication {
//
//        environment {
//            developmentMode = false
//        }
//        application {
//            configureRouting()
//        }
//        val pages = 1..5
//        val characters = listOf(
//            characterRepository.page1,
//            characterRepository.page2,
//            characterRepository.page3,
//            characterRepository.page4,
//            characterRepository.page5,
//        )
//        pages.forEach{page ->
//            client.get("/characters?page=$page").apply {
//                assertEquals(
//                    expected = HttpStatusCode.OK,
//                    actual = status // The HttpStatusCode returned by the server. It includes both, the HttpStatusCode.description and the HttpStatusCode.value (code).
//                )
//                val expected = ApiResponse(
//                    success = true,
//                    message = "ok",
//                    prevPage = calculatePage(page)[PREV_PAGE_KEY],
//                    nextPage = calculatePage(page)[NEXT_PAGE_KEY],
//                    characters = characters[page-1]
//                )
//                val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
//                assertEquals(
//                    expected = expected.success,
//                    actual = actual.success
//                )
//                assertEquals(
//                    expected = expected.characters,
//                    actual = actual.characters
//                )
//                assertEquals(
//                    expected = expected.message,
//                    actual = actual.message
//                )
//                assertEquals(
//                    expected = expected.prevPage,
//                    actual = actual.prevPage
//                )
//                assertEquals(
//                    expected = expected.nextPage,
//                    actual = actual.nextPage
//                )
//            }
//        }
//
//    }
//    private fun calculatePage(page: Int): Map<String, Int?> {
//        var prevPage: Int? = page
//        var nextPage: Int? = page
//        if (page in 1..4)
//            nextPage = nextPage?.plus(1)
//        if (page in 2..5)
//            prevPage = prevPage?.minus(1)
//        if (page == 1)
//            prevPage = null
//        if (page == 5)
//            nextPage = null
//        return mapOf(PREV_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
//    }

}
// we use Json to deserialize the result from our server and to convert this json response back into this apiResponse object