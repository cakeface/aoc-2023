package com.ckfce.aoc2023.core

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class RealCalibrationDocumentTest {

    @Test
    fun `example document lines should parse`() {
        val example = "two1nine\n" +
                "eightwothree\n" +
                "abcone2threexyz\n" +
                "xtwone3four\n" +
                "4nineeightseven2\n" +
                "zoneight234\n" +
                "7pqrstsixteen"

        val d = RealCalibrationDocument(example)

        expectThat(d.lines()).isEqualTo(listOf(29, 83, 13, 24, 42, 14, 76))

        expectThat(d.sum()).isEqualTo(281)
    }

    @Test
    fun `when words overlap we find last`() {
        val example = "57eighttcspqjtxponeightffd"
        val d = RealCalibrationDocument(example)
        expectThat(d.lines()).isEqualTo(listOf(58))
    }
}