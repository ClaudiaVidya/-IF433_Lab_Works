package oop_106784_ClaudiaVidya.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTruck(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka");
    }
}