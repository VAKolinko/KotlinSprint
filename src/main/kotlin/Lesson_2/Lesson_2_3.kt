package Lesson_2

const val MINUTES_PER_HOUR = 60

fun main() {
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTime = 457
    val departureTime = MINUTES_PER_HOUR * departureTimeHours + departureTimeMinutes
    val arrivalTime = departureTime + travelTime
    val arrivalTimeHours = arrivalTime / MINUTES_PER_HOUR
    val arrivalTimeMinutes = arrivalTime % MINUTES_PER_HOUR
    println(String.format("arrivalTime: %02d:%02d", arrivalTimeHours, arrivalTimeMinutes))
}