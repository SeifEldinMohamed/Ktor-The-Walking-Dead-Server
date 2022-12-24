package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.CharacterRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun Route.getAllCharacters() {
    val characterRepository: CharacterRepository by inject()
    get("/characters") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1 // page get from call
            require(page in 1..5)

            val apiResponse = characterRepository.getAllCharacters(page = page)

            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) { // when user pass any type except int
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        }
        catch (e:IllegalArgumentException){
            call.respond(
                message = ApiResponse(success = false, message = "Characters not found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}