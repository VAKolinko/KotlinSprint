package Lesson_2

fun main() {
    val expensesForPermanentEmployees = 30000*50
    val generalExpenses = expensesForPermanentEmployees + 20000*30
    val averageSalary = generalExpenses / (50+30)
    println(expensesForPermanentEmployees)
    println(generalExpenses)
    println(averageSalary)
}