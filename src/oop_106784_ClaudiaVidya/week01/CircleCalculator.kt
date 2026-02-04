package oop_106784_ClaudiaVidya.week01

fun main(args: Array<String>) {
    var radius: Double = 7.0
    var pir: Double = 3.14

    var area: Double = pir * radius * radius

    print("Radius: " + radius + ", Area: " + area)

    checkSize(area)
}

fun checkSize(area: Double) {
    if(area > 100){
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}