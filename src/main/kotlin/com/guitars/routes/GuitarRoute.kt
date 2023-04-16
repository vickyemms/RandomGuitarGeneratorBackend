package com.guitars.routes

import com.guitars.data.model.Guitar
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.14.76:8080"

private val guitars = listOf(
    Guitar("Fender Stratocaster", "A solid-body electric guitar with a contoured asymmetric double-cutaway body with an extended upper horn", "$BASE_URL/guitars/fender_stratocaster.jpeg"),
    Guitar("Fender Telecaster", "A solid-body electric guitar with a flat asymmetric single-cutaway body", "$BASE_URL/guitars/fender_telecaster.jpeg"),
    Guitar("Gibson Les Paul", "Its typical design features a solid mahogany body with a carved maple top and a single cutaway", "$BASE_URL/guitars/gibson_les_paul.jpeg"),
    Guitar("Gibson SG", "A rounded profile mahogany neck, bound rosewood fingerboard and a solid mahogany body", "$BASE_URL/guitars/gibson_sg.jpeg"),
    Guitar("Gibson ES 335", "A semi-hollow body semi-acoustic guitar", "$BASE_URL/guitars/gibson_es_335.jpeg"),
)

fun Route.randomGuitar(){
    get("/randomguitar") {
        call.respond(
            HttpStatusCode.OK,
            guitars.random()
        )
    }
}