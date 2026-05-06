package oop_106784_ClaudiaVidya.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Claudia"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}