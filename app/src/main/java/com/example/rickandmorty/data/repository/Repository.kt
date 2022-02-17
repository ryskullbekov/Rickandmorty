package com.example.rickandmorty.data.repository

import com.example.rickandmorty.data.models.RickAndMortyResponse
import com.example.rickandmorty.data.remote.retrofit.RetrofitClient
import retrofit2.Response

class Repository {

    suspend fun getCharacters(page:Int): Response<RickAndMortyResponse> {
        return RetrofitClient.api.getCharacters(page)
    }
}