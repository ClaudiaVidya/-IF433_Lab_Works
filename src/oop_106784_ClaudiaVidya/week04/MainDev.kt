package oop_106784_ClaudiaVidya.week04

fun main() {
    val dev = Developer("Claudia", 5000000, "Kotlin")
    dev.work()
    println("Bonus: ${dev.calculateBonus()}")
}