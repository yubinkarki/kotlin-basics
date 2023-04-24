package com.example.kotlinbasics

fun main() {
    val names: List<String> = listOf("Matt", "Chris", "Damon", "Potter", "Weasely")
    val anyList: List<Any> = listOf("Hermoine", 12, 20.22)

    for (value in anyList) {
        when (value) {
            is Int -> println("Value $value is int.")
            is Double -> println("Value $value is double.")
            is String -> println("Value $value is string.")
            else -> println("Unknown value.")
        }
    }

    val stringName: Any = "This is string value."
    val numberObject: Any = 123

    val stringOne: String = stringName as String
    val stringTwo: String? = numberObject as? String

    println("Length: ${stringOne.length}")
    println("Length: $stringTwo")
}
