package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*
import java.time.Duration

fun Application.configureDefaultHeader() { // we will attach a custom header to every response we sent from our server
    // this custom header will allow us to cache the data in the app every time we recieve a value from server
    install(DefaultHeaders) {
        val oneYearInSecond =
            Duration.ofDays(365).seconds // get the seconds from 365 days and we need this value to specify how long i want to cache the data which will be send form our server
        header(
            name = HttpHeaders.CacheControl,
            value = "public, max-age=$oneYearInSecond, immutable"
        )
    }
}