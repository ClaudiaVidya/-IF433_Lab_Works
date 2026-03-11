package oop_106784_ClaudiaVidya.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name sekarang menyala. Ruangan menjadi terang.")
    }

    override fun turnOff() {
        println("$name sekarang mati. Ruangan menjadi gelap.")
    }
}