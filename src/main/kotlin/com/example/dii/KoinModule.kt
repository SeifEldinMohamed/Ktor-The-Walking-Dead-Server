package com.example.dii

import com.example.repository.CharacterRepository
import com.example.repository.CharacterRepositoryImp
import org.koin.dsl.module

// to specify how i want to inject certain times
val koinModule = module {
    single<CharacterRepository> {
        CharacterRepositoryImp()
    }
}