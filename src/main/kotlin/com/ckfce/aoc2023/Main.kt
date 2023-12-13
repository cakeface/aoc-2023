package com.ckfce.aoc2023

import com.ckfce.aoc2023.core.CalibrationDocument

fun main() {
    val day1p1 = object {}.javaClass.getResource("Day1_1.txt").readText()
    val c = CalibrationDocument(day1p1)
    println(c.sum())
}