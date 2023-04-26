package com.example.kotlinbasics.examples

fun main() {
    // Can not change items in a list unless made mutable.
    val mixedList = listOf<Any>("Name", 1, 2, true)

    println(mixedList.size)

    // New mutable list.
    val mutableMixedList = mixedList.toMutableList()
    val additonalItems = listOf<Any>("New", "Items", false, 3)

    println("Values of mutable list made from the previous mixed list: \n$mutableMixedList")

    mutableMixedList.addAll(additonalItems)
    println("\nValues of mutable list after adding new items: \n$mutableMixedList")

    // Creating a mutable list.
    val days = mutableListOf<String>("Sun", "Mon")
    days.add("Tue")
    // days.clear()

    println(days)
}
