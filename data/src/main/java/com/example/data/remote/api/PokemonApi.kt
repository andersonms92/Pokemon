package com.example.data.remote.api

import com.example.data.remote.model.ApiPokemonModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApi {

    @GET("v2/pokemon")
    fun getPokemon(
    ): Call<List<ApiPokemonModel>>

    @GET("v2/pokemon/id")
    fun getPokemonDetails(
        @Query("id") id: Int
    ): Call<ApiPokemonModel>
}