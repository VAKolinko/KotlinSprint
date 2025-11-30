package Lesson_1

fun main() {
    val timeInSpace = 6480
    val minutes = timeInSpace/60
    val remainingSeconds = timeInSpace%60
    println(remainingSeconds)
    val hours = minutes/60
    println(hours)
    val remainingHours = minutes%60
    println(remainingHours)
    println("0$hours:${remainingHours}:0${remainingSeconds}")
}