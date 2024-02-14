package com.example.handin2

// Task 2.1, Create a class called Employee that includes three pieces of information as instance variables...
class Employee(val firstName: String, val lastName: String, var monthlySalaryInDkk: Double) {
    // If the monthly salary is not positive, set it to 0.0:
    init {
        if (monthlySalaryInDkk < 0.0) { monthlySalaryInDkk = 0.0 }
    }
    fun yearlySalary(): Double {
        return monthlySalaryInDkk * 12
    }
    fun raiseSalaryInPercent(percentage: Double) {
        monthlySalaryInDkk *= (1 + percentage / 100)
    }
}