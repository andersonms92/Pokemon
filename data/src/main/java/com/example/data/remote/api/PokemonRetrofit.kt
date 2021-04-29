package com.example.data.remote.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokemonRetrofit {

    fun getApiInstance() : PokemonApi {
        val retrofit  = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(PokemonApi::class.java)
    }
}