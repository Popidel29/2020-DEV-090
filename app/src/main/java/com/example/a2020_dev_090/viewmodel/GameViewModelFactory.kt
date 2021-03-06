package com.example.a2020_dev_090.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.a2020_dev_090.model.GameRepository

class GameViewModelFactory(private val gameRepository: GameRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GameViewModel(gameRepository) as T
    }
}