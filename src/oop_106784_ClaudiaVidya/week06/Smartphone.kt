package oop_106784_ClaudiaVidya.week06

class Smartphone: Camera, Phone {
    override fun turnon() {
        super<Camera>.turnon()
        super<Phone>.turnon()
        println("Sistem operasi Smartphone berhasil shoooting...")
    }
}