package com.ckfce.aoc2023

import com.ckfce.aoc2023.core.CalibrationDocument
import com.ckfce.aoc2023.core.RealCalibrationDocument

fun day1Part1() {
    val day1 = loadResource("Day1.txt")
    val c = CalibrationDocument(day1)
    println("Day 1 part 1: ${c.sum()}")
}

fun day1Part2() {
    val day1 = loadResource("Day1.txt")
    val c = RealCalibrationDocument(day1)
    println("Day 1 part 2: ${c.sum()}")
}

fun main() {
    day1Part2()
}

fun loadResource(path: String): String =
    object {}.javaClass.getResource(path)!!.readText()
