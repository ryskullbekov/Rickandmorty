package com.example.rickandmorty.ui.characters

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.data.models.RickAndMortyResponse
import com.example.rickandmorty.data.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class CharacterViewModel(val repository: Repository) : ViewModel() {

    var listCharacters = MutableLiveData<Response<RickAndMortyResponse>>()

    fun getCharacters(page:Int){
        viewModelScope.launch {
            val character = repository.getCharacters(page)
            listCharacters.value = character
        }
    }

}