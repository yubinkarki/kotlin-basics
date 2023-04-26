package com.example.kotlinbasics.examples

fun main() {
    // Duplicate values are ignored in sets.
    val fruits = setOf<String>("Mango", "Apple", "Orange", "Apple")
    val days = mutableSetOf<String>("Sun", "Mon", "Tue")

    println(fruits.size)
    println(fruits.toSortedSet())

    days.add("Wed")
    days.add("Thurs")

    println(days)
    println(days.elementAt(3))

    // Maps are similar to objects in JS. Hold data in key-value pairs.
    val daysOfWeeks = mapOf<Int, String>(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    val gamesMap = mapOf<Int, Game>(1 to Game("Dota", 55.45), 2 to Game("COD", 32.33))

    // Accesses based on key, not index.
    println(daysOfWeeks[2] + "\n")

    for (item in daysOfWeeks.keys) {
        println("Value of $item is ${daysOfWeeks[item]}")
    }

    for (item in gamesMap.keys) {
        println("Value of $item is ${gamesMap[item]}")
    }

    val numbers: ArrayList<Double> = ArrayList()

    numbers.add(12.45)
    numbers.add(45.42)
    numbers.add(84.21)

    var total: Double = 0.0

    for (value in numbers) {
        total += value
    }

    var average: Double = total / numbers.size

    println("The average is ${String.format("%.2f", average)}.")

    val sum = { a: Int, b: Int -> println("The sum is ${a + b}.") }
    sum(10, 10)
}

data class Game(val name: String, val price: Double)
