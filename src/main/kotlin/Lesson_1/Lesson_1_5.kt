package Lesson_1

const val constantlyTime = 60 // Значение секунд в одной минуте либо минут в одном часе
fun main() {
    val timeInSpace = 6480 //время в секундах
    val minutes = timeInSpace / constantlyTime
    val remainingSeconds = timeInSpace % constantlyTime
    println(remainingSeconds)
    val hours = minutes / constantlyTime
    println(hours)
    val remainingMinutes = minutes % constantlyTime
    println(remainingMinutes)
    println(String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds))


}