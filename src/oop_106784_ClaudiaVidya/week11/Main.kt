package oop_106784_ClaudiaVidya.week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Claudia".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}