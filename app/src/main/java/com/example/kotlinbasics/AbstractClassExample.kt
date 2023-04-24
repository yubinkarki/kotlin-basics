package com.example.kotlinbasics

fun main() {
    var newAlien = Nomad("Reddit")

    newAlien.doWork("thriller")
}

abstract class Alien(private val species: String) {
    // Need to declare body in child class by overriding.
    abstract fun doWork(workCategory: String)
}

class Nomad(species: String) : Alien(species) {
    var species: String

    init {
        this.species = species
    }

    override fun doWork(workCategory: String) {
        println("The species is $species.")
        println("The work is $workCategory")
    }
}
