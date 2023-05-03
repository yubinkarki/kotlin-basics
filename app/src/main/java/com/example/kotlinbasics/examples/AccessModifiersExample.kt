package com.example.kotlinbasics.examples

fun main() {
    val base = Base()
    val derived = Derived()

    val location: Any = "Kathmandu"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int

    println("$safeString, $safeInt")
}

open class Base() {
    var a = 1
    private var b = 2 // Accessible in this class only.
    protected open val c = 3 // Accessible by child class but same file.
    internal val d = 4

    protected fun doSomething() {
        println("Doing something. $c $b")
    }
}

class Derived : Base() {
    override val c = 9 // Can not be accessed by object of the class.
}
