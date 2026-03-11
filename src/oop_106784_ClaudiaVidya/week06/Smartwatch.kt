package oop_106784_ClaudiaVidya.week06

class Smartwatch: Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED mennyala: 14.00 WIB")
    }

    override fun connectTabluetooth() {
        println("Mencari perangkat HP di sekitar untuk sharing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W")
    }
}