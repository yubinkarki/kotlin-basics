package com.example.kotlinbasics.examples

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val days = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    val fruits = arrayOf(Fruit("Apple", 23.21), Fruit("Mango", 48.23))
    val mixedList = arrayOf(1, 2, "Sunday", Fruit("Banana", 45.2))

    println("List of fruits: ${fruits.contentToString()}")
    println("Before changing ${numbers.contentToString()}")

    numbers[0] = 6
    numbers[1] = 7
    numbers[2] = 8
    numbers[3] = 9
    numbers[4] = 10

    println("After changing ${numbers.contentToString()}")

    println("Days of week: ${days.contentToString()}")

    for (index in fruits.indices) {
        println("${fruits[index].name} is in index $index")
    }
}

data class Fruit(val name: String, val price: Double)
