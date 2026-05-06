package oop_106784_ClaudiaVidya.week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Claudia".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result")

    println("=== TEST APPLY ===")
    val user = user().apply {
        name = "Claudia"
        age = 19
    }
    println(user)

    println("\n=== TEST ALSO ===")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Log Sebelum ditambah: $it")
    }.add(4)
    println("Setelah ditambah: $numbers")
}