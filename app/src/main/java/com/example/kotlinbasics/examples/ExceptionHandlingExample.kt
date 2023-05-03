package com.example.kotlinbasics.examples

import java.lang.Exception

fun main() {
    try {
        val numbers = intArrayOf(5)
        numbers[6] = 10 / 2
    } catch (e: ArithmeticException) {
        println("Arithmetic error catch: $e")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Array out of bounds catch: $e")
    } catch (e: Exception) {
        println("Parent exception class: $e")
    } finally {
        println("This is finally block.")
    }

    println("After try catch block.")

    validateAge(17)
}

fun validateAge(age: Int) {
    if (age < 18) {
        // Throwing custom error.
        throw ArithmeticException("Age is less than 18.")
    } else {
        println("Eligible for driving.")
    }
}
