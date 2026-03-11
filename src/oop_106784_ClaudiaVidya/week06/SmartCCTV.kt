package oop_106784_ClaudiaVidya.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("$name menyala. Sistem pemantauan aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("$name dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("Kamera mulai merekam ke penyimpanan lokal.")
    }
}