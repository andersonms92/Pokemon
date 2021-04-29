package com.example.data.remote.model

data class ApiPokemonModel (
        val count: Int,
        val next: String?,
        val previous: String?,
        val results: List<Pokemon>

        )