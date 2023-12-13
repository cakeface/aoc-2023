package com.ckfce.aoc2023.core

class CalibrationDocument(val text: String) {

    fun lines(): List<Int> {
        return text.lines().map(::lineToCalibrationValue).toList()
    }

    fun sum(): Int {
        return lines().sum()
    }
}


fun lineToCalibrationValue(line: String): Int {
    val first = line.first { it.isDigit() }
    val last = line.last { it.isDigit() }
    return "$first$last".toInt()
}