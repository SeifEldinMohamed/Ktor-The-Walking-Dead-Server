package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Character

interface CharacterRepository {
    val characters: Map<Int, List<Character>>

    val page1: List<Character>
    val page2: List<Character>
    val page3: List<Character>
    val page4: List<Character>
    val page5: List<Character>

    suspend fun getAllCharacters(page: Int = 1): ApiResponse
    suspend fun searchCharacters(name: String?): ApiResponse
}