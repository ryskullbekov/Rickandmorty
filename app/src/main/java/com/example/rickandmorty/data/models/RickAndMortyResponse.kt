package com.example.rickandmorty.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RickAndMortyResponse {

    @SerializedName("info")
    @Expose
    private var info: Info? = null

    @SerializedName("results")
    @Expose
    private var characterModels: List<Model?>? = null

    fun getInfo(): Info? {
        return info
    }

    fun setInfo(info: Info?) {
        this.info = info
    }

    fun getResults(): List<Model?>? {
        return characterModels
    }

    fun setResults(characterModels: List<Model?>?) {
        this.characterModels = characterModels
    }
}