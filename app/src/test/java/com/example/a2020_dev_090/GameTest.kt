package com.example.a2020_dev_090

import com.example.a2020_dev_090.model.GameRepository
import org.junit.Before
import org.junit.Test

class GameTest {
    lateinit var gameRepository: GameRepository

    @Before
    fun setup() {
        gameRepository = GameRepository("Player1", "Player2")
    }

    @Test
    fun testPlayer1WinningHorizontalRow1() {
        gameRepository.playGame(0, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 2)
        gameRepository.switchPlayer()
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player1")
    }

    @Test
    fun testPlayer1WinningHorizontalRow2() {
        gameRepository.playGame(1, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 2)
        gameRepository.switchPlayer()
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player1")
    }

    @Test
    fun testPlayer1WinningHorizontalRow3() {
        gameRepository.playGame(2, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 2)
        gameRepository.switchPlayer()
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player1")
    }

    @Test
    fun testPlayer1WinningVerticalCol1() {
        gameRepository.playGame(0, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 0)
        gameRepository.switchPlayer()
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player1")
    }

    @Test
    fun testPlayer1WinningVerticalCol2() {
        gameRepository.playGame(1, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 2)
        gameRepository.switchPlayer()
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player1")
    }

    @Test
    fun testPlayer1WinningVerticalCol3() {
        gameRepository.playGame(2, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 2)
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player1")
    }

    @Test
    fun testPlayer2WinningVerticalCol1() {
        gameRepository.playGame(2, 2)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 2)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 0)
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player2")
    }

    @Test
    fun testPlayer2WinningVerticalCol2() {
        gameRepository.playGame(2, 2)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 2)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 0)
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player2")
    }

    @Test
    fun testPlayer2WinningVerticalCol3() {
        gameRepository.playGame(0, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 2)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 2)
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player2")
    }

    @Test
    fun testPlayer2WinningHorizontalRow1() {
        gameRepository.playGame(1, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 2)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 2)
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player2")
    }

    @Test
    fun testPlayer2WinningHorizontalRow2() {
        gameRepository.playGame(2, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 2)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 2)
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player2")
    }

    @Test
    fun testPlayer2WinningHorizontalRow3() {
        gameRepository.playGame(0, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 2)
        val winner = gameRepository.checkWinner()
        assert(winner?.name == "Player2")
    }

    @Test
    fun testDraw() {
        gameRepository.playGame(0, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(0, 2)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 0)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 2)
        gameRepository.switchPlayer()
        gameRepository.playGame(1, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 1)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 2)
        gameRepository.switchPlayer()
        gameRepository.playGame(2, 0)
        val winner = gameRepository.checkWinner()
        assert(winner == null && gameRepository.isDraw() )
    }
}