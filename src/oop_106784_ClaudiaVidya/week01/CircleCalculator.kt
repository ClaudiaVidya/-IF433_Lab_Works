package oop_106784_ClaudiaVidya.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pir = 3.14

    val area = pir * radius * radius

    println("Radius: $radius, Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) {
    if(area > 100){
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}