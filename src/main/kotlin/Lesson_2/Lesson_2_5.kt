package Lesson_2

import kotlin.math.pow

const val oneHundredPercent = 100

fun main() {
    val depositPeriod = 20
    val depositAmount = 70000
    val interestRate = 16.7
    val totalAmount = depositAmount * ((oneHundredPercent + interestRate) / oneHundredPercent).pow(depositPeriod)
    println("%.3f".format(totalAmount))
}