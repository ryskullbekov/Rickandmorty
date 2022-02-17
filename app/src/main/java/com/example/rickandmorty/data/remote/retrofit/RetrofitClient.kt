package com.example.rickandmorty.data.remote.retrofit

import com.example.rickandmorty.data.remote.api.CharacterApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: CharacterApi by lazy {
        retrofit.create(CharacterApi::class.java)
    }
}