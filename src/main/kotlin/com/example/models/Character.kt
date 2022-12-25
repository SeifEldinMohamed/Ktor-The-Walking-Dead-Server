package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val id: Int,
    val name: String,
    val realName: String,
    val about:String,
    val totalAppearances: Int,
    val image: String,
    val day: String,
    val month: String,
    val rating: Double
)
