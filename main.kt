package com.example.handin1

fun main() {

    // ----- Opg. 1:
    checkVoteAge()

    // ----- Opg. 2
    val min : Int = getMin(1, 2,8)
    val max : Int = getMax(1, 18, -8)

    println(min)
    println(max)

    // ----- Opg. 3
    val numbers = listOf(1, 2, 3, 4, 5)
    println(calculateAverage(numbers))

    // ----- Opg. 4
    println(cprCheck())

    // ----- Opg. 5
    fizzBuzz1()
    // fizzBuzz2()

    // ----- Opg. 6
    abbreviator()

    // ----- Opg. 7
    println(calculateGrade(10))

    // ----- Opg. 8
    println(filterWordsByLength(
        words = listOf("Hi", "Hej", "Hello", "Oi", "Hey"),
        filterBy = 3))
}

// Opg 1, Define a method to find out user is eligible to vote based on user-input age.

fun checkVoteAge() {
    print("Please enter your age: ")
    val age: Int = readln().toInt()

    if (age >= 18) {
        println("You are old enough to vote!")
    } else {
        println("You are NOT old enough to vote!")
    }
}

// Opg. 2, Define two functions to print the maximum and the minimum number respectively among three numbers

fun getMin(num1: Int, num2: Int, num3: Int): Int {
    return minOf(num1, num2, num3)
}

fun getMax(num1: Int, num2: Int, num3: Int) : Int {
    return maxOf(num1, num2, num3)
}

// Opg. 3, Write a Kotlin function named calculateAverage that takes in a list of numbers and returns their average.

fun calculateAverage(numbers: List<Int>) : Int {
    var sum: Int = 0
    for (num in numbers) {
        sum += num
    }
    val average = sum / numbers.size
    return average
}

// Opg. 4, Write a method that returns if a user has input a valid CPR number.

fun cprCheck() : Boolean {
    print("Check your CPR number's validity: ")
    val cpr : String = readln()

    val day = cpr.substring(0, 2).toInt()
    val month = cpr.substring(2, 4).toInt()

    return !(cpr.length != 10 || day > 31 || month > 12)
}

// Opg. 5, Write a program that prints the numbers from 1 to 100...

fun fizzBuzz1() {
    for (i in 1..100) when {
        i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
        i % 3 == 0 -> println("Fizz")
        i % 5 == 0 -> println("Buzz")
        else -> println(i)
    }
}

fun fizzBuzz2() {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println ("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else println(i)
    }
}

// Opg. 6, Write a program that takes your full name as input and displays the abbreviations of the first and middle names.

fun abbreviator() {
    print("Write your full name here: ")
    val name : String = readln()
    val nameParts = name.trim().split(" ")
    var abbreviatedName = ""

    for (i in 0 until nameParts.size - 1) {
        if (i == 0 || i == nameParts.size - 2) {
            abbreviatedName += "${nameParts[i].substring(0, 1)}. "
        }
    }
    abbreviatedName += nameParts.last()
    println("Your abbreviated name is $abbreviatedName")
}

// Opg. 7, Write a program that takes a numerical grade (0-100) as input and prints out the corresponding american letter grade.

fun calculateGrade(grade: Int) : String {
    return when (grade) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in 0..59 -> "F"
        else -> "Enter valid numerical grade (0-100)."
    }
}

// Opg. 8, Write a Kotlin function named filterWordsByLength that takes in a list of strings and a minimum length...
fun filterWordsByLength(words: List<String>, filterBy : Int) : List<String> {
    return words.filter { it.length >= filterBy}
}