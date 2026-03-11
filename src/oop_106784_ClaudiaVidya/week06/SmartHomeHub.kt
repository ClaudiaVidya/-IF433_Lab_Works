package oop_106784_ClaudiaVidya.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} (ID: ${device.id}) telah ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Seluruh Perangkat ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            } else {
                println("Info: ${device.name} tidak memiliki saklar (bukan Switchable).")
            }
        }
    }
}