package com.ckfce.aoc2023.day1

class CalibrationDocument(private val text: String) {

    fun lines(): List<Int> {
        return text.lines().map(::lineToCalibrationValue).toList()
    }

    fun sum(): Int {
        return lines().sum()
    }

    private fun lineToCalibrationValue(line: String): Int {
        val first = line.first { it.isDigit() }
        val last = line.last { it.isDigit() }
        return "$first$last".toInt()
    }
}

