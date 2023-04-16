package com.guitars.plugins

import com.guitars.routes.randomGuitar
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    
    routing {
        randomGuitar()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
