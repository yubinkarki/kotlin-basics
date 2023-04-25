package com.example.kotlinbasics.examples

interface Driveable {
    val maxSpeed: Double
    fun ride(): String
    fun brake() {
        println("The interface is braking.")
    }
}

fun main() {
    var ferrari = Tempo(120.23, "Ferrari", "Ferry")
    var electricFerrari = ElectricTempo(113.45, "Mclaren", "Mc", 80.2)

    ferrari.drive(40.4)
    /*electricFerrari.drive(32.1)
    electricFerrari.extendRange(50.2)*/

    println(ferrari.ride())
    ferrari.brake()
    electricFerrari.brake()
}

// Need to make class open for inheritance. Final by default.
open class Tempo(override val maxSpeed: Double, val name: String, val brand: String) : Driveable {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }

        println("The updated range is $range.")
    }

    override fun ride(): String = "This is overridden ride method of Drivable interface."


    open fun drive(distance: Double) {
        println("Drove for $distance kilometers")
    }
}

class ElectricTempo(maxSpeed: Double, name: String, brand: String, batteryLife: Double) :
    Tempo(maxSpeed, name, brand) {
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        // super.drive(distance)
        println("Inside overridden drive method $range.")
    }

    override fun brake() {
        // Super calls the method of the parent class.
        // super.brake()
        println("The subclass is braking.")
    }
}
