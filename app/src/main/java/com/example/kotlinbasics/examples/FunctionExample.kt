package com.example.kotlinbasics

fun main() {
    var fullName: String? = "Random Name"

    var lengthFullName = fullName?.length

    println("Length of name: $lengthFullName")

    fullName?.let { println(fullName.length) }

    var anotherName = fullName ?: "Guest"

    // Non null assertion.
    println(fullName!!.lowercase())

    println(anotherName)

    printName()

    var result = addNum(2, 2)
    println("Sum is $result.")
}

fun printName() {
    println("This is printName function.")
}

fun addNum(num1: Int, num2: Int): Int {
    return num1 + num2
}
