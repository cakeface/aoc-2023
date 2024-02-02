package com.ckfce.aoc2023.day1

class RealCalibrationDocument(private val text: String) {

    fun lines(): List<Int> {
        return text.lines().map(::lineToCalibrationValue).toList()
    }

    private fun lineToCalibrationValue(line: String): Int {
        val regex = "(one|two|three|four|five|six|seven|eight|nine|[0-9])".toRegex()
        val first = regex.find(line)!!.value
        var lastMatch = regex.find(line)
        var last = "0"
        while (lastMatch != null) {
            last = lastMatch.value
            lastMatch = regex.find(line, lastMatch.range.first + 1)
        }
        val firstDigit = digitMap(first)
        val lastDigit = digitMap(last)
        val num = "$firstDigit$lastDigit".toInt()
        println("$firstDigit$lastDigit | $num | $line")
        return num
    }



    fun sum(): Int {
        return lines().sum()
    }

    private fun digitMap(word: String): String {
        return when(word) {
            "one" -> "1"
            "two" -> "2"
            "three" -> "3"
            "four" -> "4"
            "five" -> "5"
            "six" -> "6"
            "seven" -> "7"
            "eight" -> "8"
            "nine" -> "9"
            else -> word
        }
    }
}

