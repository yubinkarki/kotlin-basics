package com.example.kotlinbasics

fun main() {
    val name = "Yubin"
    val lastname = "Karki"

    var result = when (name) {
        "Yubin" -> "Good Name"
        "Kiran" -> "Okay Name"
        else -> 234
    }

    print("$result \n")

    val summary = "$name + $lastname"
    val charName = 'o'

    var firstAndLastCharacter: String = "${name[0]} and ${name[name.length - 1]} \n"
    print("First and last character: $firstAndLastCharacter")

    val age: Short = 20
    val isActive: Boolean = true

    val floatNumber: Float = 21.12F

    var num = 6

    var anyVar: Any = true

    when (anyVar) {
        is Boolean -> print("$anyVar is Boolean\n")
        is String -> print("$anyVar is String\n")
        is Double -> print("$anyVar is Double\n")
        is Int -> print("$anyVar is Int\n")
    }

    when (num) {
        !in 1..2 -> print("This is not between 1 and 2")
        in 3..4 -> print("This is between 3 and 4")
        5, 6, 7 -> print("This is 5, 6, or 7")
        else -> print("Outside range")
    }
}
