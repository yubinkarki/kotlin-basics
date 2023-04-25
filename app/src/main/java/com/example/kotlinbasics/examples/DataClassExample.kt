package com.example.kotlinbasics.examples

// Can not be abstract or inner classes and such.
data class User(val id: Long, val name: String)

fun main() {
    val yubin = User(1, "Yubin")
    val naruto = User(2, "Naruto")

    /*
    println(yubin.name)
    println(naruto.name)
    println(yubin == naruto)
    */

    val updatedUser = yubin.copy(name = "Karki")
    println("User before change: $yubin")
    println("User after change: $updatedUser")

    val (identifier, fullName) = updatedUser
    println("id: $identifier, name: $fullName")
}
