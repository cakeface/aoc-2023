package com.ckfce.aoc2023.day1

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class CalibrationDocumentTest {

    @Test
    fun `example calibration document then parse`() {
        val example = "1abc2\n" +
                "pqr3stu8vwx\n" +
                "a1b2c3d4e5f\n" +
                "treb7uchet"
        val doc = CalibrationDocument(example)

        expectThat(doc.lines()).isEqualTo(listOf(12, 38, 15, 77))

        expectThat(doc.sum()).isEqualTo(142)
    }
}