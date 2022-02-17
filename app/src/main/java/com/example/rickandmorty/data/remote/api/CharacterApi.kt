package com.example.rickandmorty.data.remote.api

import com.example.rickandmorty.data.models.RickAndMortyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApi {

    @GET("api/character")
    suspend fun getCharacters(@Query("page") page: Int): Response<RickAndMortyResponse>
}