package com.example.kotlinbasics.examples

fun main() {
    Animal.takePlate()
}

class Animal {
    // Companion objects can be accessed directly without creating instance of class.
    companion object Action {
        fun takePlate() {
            println("This is take plate method inside food.")
        }
    }
}
