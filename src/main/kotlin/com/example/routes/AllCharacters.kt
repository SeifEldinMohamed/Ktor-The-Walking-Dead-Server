package com.example.routes

import com.example.models.ApiResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun Route.getAllCharacters() {
    get("/characters") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)
            call.respond(message = page)
        } catch (e: NumberFormatException) { // when user pass any type except int
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        }
        catch (e:IllegalArgumentException){
            call.respond(
                message = ApiResponse(success = false, message = "Characters not found."),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}