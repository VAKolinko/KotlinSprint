package Lesson_2

fun main() {
    val numberOfEmployees = 50
    val employeeSalary = 30000
    val numberOfInterns = 30
    val internSalary = 20000
    val expensesForPermanentEmployees = employeeSalary * numberOfEmployees
    val generalExpenses = expensesForPermanentEmployees + internSalary * numberOfInterns
    val averageSalary = generalExpenses / (numberOfEmployees + numberOfInterns)
    println(expensesForPermanentEmployees)
    println(generalExpenses)
    println(averageSalary)
}