package com.example.kotlinbasics.examples

fun main() {
    var spongebob = Person("Sponge", "Bob", "adventure ride", 12)

    spongebob.stateHobby()

    // var patrick: Person = Person(firstName = "Patrick")

    // addNum(5)
}

// Primary constructor.
class Person(
    firstName: String = "John",
    lastName: String = "Doe",
    hobby: String = "default hobby"
) {
    // Member variables.
    var age: Int? = null ?: 0
    var hobby: String? = null
    var firstName: String? = null

    // Init method runs for every instance of the class. Adds to the primary constructor.
    init {
        this.firstName = firstName
        this.hobby = hobby
        println("Full name is $firstName $lastName.")
    }

    // Secondary constructor. Extending the member variables.
    constructor(firstName: String, lastName: String, hobby: String, age: Int) : this(
        firstName,
        lastName,
        hobby
    ) {
        this.age = age
    }

    fun stateHobby() {
        println("$firstName's hobby is $hobby.")
        println("The age is $age.")
    }
}

// Parameter and variable are different.
fun addNum(a: Int) {
    // The function will use var instead of parameter value if both have the same name.
    var a = 10

    println("The value of a is $a.")
}

