package oop_106784_ClaudiaVidya.week04

class Vehicle(val brand: String) {
    var speed: Int = 0;

    open fun accelerate() {
        speed+= 10;
        println("$brand melanju. Kecepetan: $speed km/jam");
    }
    open fun honk() {
        println("Beep beep!")
    }
}