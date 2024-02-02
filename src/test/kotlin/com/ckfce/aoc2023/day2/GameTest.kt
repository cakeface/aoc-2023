package com.ckfce.aoc2023.day2

import org.junit.jupiter.api.Test
import strikt.api.expectThat

class GameTest {
    @Test
    fun `example should parse to records`() {
        val text = "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green\n" +
                "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue\n" +
                "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red\n" +
                "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red\n" +
                "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"

        val gameRecords = GameRecords(text)

        expectThat(gameRecords.records()).isEqualTo(listOf(Game(id=1, listOf(Set()))))
    }
}