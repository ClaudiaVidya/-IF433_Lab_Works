package oop_106784_ClaudiaVidya.week03

fun main() {
    val e = Employee("Claudia Vidya")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}