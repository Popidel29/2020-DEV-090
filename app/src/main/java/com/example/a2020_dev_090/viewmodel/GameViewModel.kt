package com.example.a2020_dev_090.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.a2020_dev_090.model.GameRepository
import com.example.a2020_dev_090.model.Player

class GameViewModel(private val gameRepository: GameRepository) {

    val activePlayer : LiveData<Player>
        get() = mActivePlayer
    private var mActivePlayer = MutableLiveData<Player>()

    val  gameResult : LiveData<String>
        get() = mGameResult
    private var mGameResult = MutableLiveData<String>()

    fun playGame(x: Int,  y: Int){

    }

    fun checkWinner(){

    }

    fun resetGame(){

    }
    fun switchPlayer() {
    }

}