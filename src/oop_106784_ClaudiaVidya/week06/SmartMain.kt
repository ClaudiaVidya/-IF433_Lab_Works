package oop_106784_ClaudiaVidya.week06

fun main() {
    val myHub = SmartHomeHub()

    val lamp = SmartLamp(id = "L01", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "S01", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "C01", name = "Ezviz Garasi")

    println("--- Inisialisasi Perangkat ---")
    myHub.addDevice(lamp)
    myHub.addDevice(speaker)
    myHub.addDevice(cctv)

    println("\n--- Menyalakan Perangkat ---")
    lamp.turnOn()
    speaker.turnOn()
    cctv.turnOn()

    myHub.activateSecurityMode()

    myHub.turnOffAllSwitches()
}