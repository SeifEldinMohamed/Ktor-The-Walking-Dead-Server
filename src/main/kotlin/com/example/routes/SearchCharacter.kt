package com.example.routes

import com.example.repository.CharacterRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchCharacter() {
    val characterRepository: CharacterRepository by inject()
    get("/character/search") {
        val name = call.request.queryParameters["name"]
        val apiResponse = characterRepository.searchCharacters(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}