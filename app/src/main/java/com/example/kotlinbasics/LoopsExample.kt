package com.example.kotlinbasics

fun main() {
    var x = 15

    while (x >= 1) {
        println("While $x")
        x--
    }

    // Executes once even if the condition is false.
    do {
        println("Do while $x")
        x++
    } while (x <= 10)

    var feltTemp = "cold"
    var roomTemp = 10

    while (feltTemp == "cold") {
        roomTemp++
        println("Room temp: $roomTemp")

        if (roomTemp >= 20) {
            feltTemp = "hot"
            println("Room temp is good enough, exiting if and while statements.")
        }
    }

    for (num in 1..10) {
        println("$num")
    }

    for (i in 20 downTo 1 step 2) {
        println("Eye: $i")
    }

    // Break stops the entire loop.
    for (i in 1 until 20) {
        println("$i")

        if (i == 10) {
            break
        }
    }

    // Continue breaks from the if condition but keeps the for loop running.
    for (i in 1 until 20) {
        if (i / 2 == 5) {
            println("Inside if $i")

            continue
        }

        println("$i")
    }

    print("Done with loop.")
}
