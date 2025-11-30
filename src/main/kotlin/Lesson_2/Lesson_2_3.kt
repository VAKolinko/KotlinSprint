package Lesson_2

const val const = 60 // минут в одном часе

fun main() {
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTime = 457
    val departureTime = const * departureTimeHours + departureTimeMinutes
    val arrivalTime = departureTime + travelTime
    val arrivalTimeHours = arrivalTime / const
    val arrivalTimeMinutes = arrivalTime % const
    println(String.format("arrivalTime: %02d:%02d", arrivalTimeHours, arrivalTimeMinutes))
}