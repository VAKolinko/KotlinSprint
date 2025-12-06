package Lesson_3

fun main() {
    val dataString = "D2-D4;0"
    val parsedString = dataString.split("-", ";")
    val startingSquare = parsedString[0]
    val finalSquare = parsedString[1]
    val moveCount = parsedString[2]
    println("откуда: $startingSquare, куда: $finalSquare, номер хода: $moveCount")
}