package com.guitars.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Guitar(
    val name: String,
    val description: String,
    val imageURL: String
)
