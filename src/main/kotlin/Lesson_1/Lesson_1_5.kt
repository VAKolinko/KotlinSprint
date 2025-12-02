package Lesson_1

const val MINUTES_PER_HOUR = 60
fun main() {
    val timeInSpace = 6480
    val minutes = timeInSpace / MINUTES_PER_HOUR
    val remainingSeconds = timeInSpace % MINUTES_PER_HOUR
    println(remainingSeconds)
    val hours = minutes / MINUTES_PER_HOUR
    println(hours)
    val remainingMinutes = minutes % MINUTES_PER_HOUR
    println(remainingMinutes)
    println(String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds))


}