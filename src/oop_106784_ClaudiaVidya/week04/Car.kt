package oop_106784_ClaudiaVidya.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTruck(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka");
    }

    override fun honk() {
        println("TIN TIN!! Mobil $brand lewat");
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transisi gigi untuk menambahkan kecepatan");
    }
}