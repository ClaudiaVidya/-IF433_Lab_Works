package oop_106784_ClaudiaVidya.week01

fun main() {
    var name: String = "Jhon Thor"
    var score : Int = 80

    println("Nama : $name, Nilai : $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade : $grade")





}