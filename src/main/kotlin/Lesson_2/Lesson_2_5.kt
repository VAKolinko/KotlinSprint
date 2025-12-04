package Lesson_2

import kotlin.math.pow

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    val depositPeriod = 20
    val depositAmount = 70000
    val interestRate = 16.7
    val totalAmount = depositAmount * ((ONE_HUNDRED_PERCENT + interestRate) / ONE_HUNDRED_PERCENT).pow(depositPeriod)
    println("%.3f".format(totalAmount))
}