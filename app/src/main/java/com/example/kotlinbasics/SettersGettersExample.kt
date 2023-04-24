package com.example.kotlinbasics

import java.lang.IllegalArgumentException

fun main() {
    var ferrari: Car = Car()

    ferrari.maxSpeed = 1

    println("Max speed is ${ferrari.maxSpeed}")
    println("Owner is ${ferrari.owner}")
    println("Brand is ${ferrari.brand}")
}

class Car() {
    lateinit var owner: String

    var brand: String = "BMW"
        get() {
            return field.lowercase()
        }

    var maxSpeed: Int = 20
        // get() = field
        set(value) {
            field =
                if (value > 0) value else throw IllegalArgumentException("Max speed should be greater than 0.")
        }

    init {
        this.owner = "Yubin"
    }
}

