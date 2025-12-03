package Lesson_2

fun main() {
    val numberOfStudents = 4
    val firstStudentScore = 3
    val secondStudentScore = 4
    val thirdStudentScore = 3
    val fourthStudentScore = 5
    val averageScore = (firstStudentScore + secondStudentScore +
            thirdStudentScore + fourthStudentScore) / numberOfStudents.toFloat()
    println(averageScore)
}