package lexa.practice

import lexa.practice.resources.exercise6.Employee

fun main() {
    val employee = Employee("Jane", "Doe", 1977)

    employee.lastName = "Smith"
    employee.salaryLast3Years = floatArrayOf(10000f, 12000.50f, 14000.25f)
}
