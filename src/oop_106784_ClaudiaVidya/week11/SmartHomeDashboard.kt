package oop_106784_ClaudiaVidya.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val light = SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("Berhasil menambahkan: ${it.name}")
    }

    println("Jumlah perangkat di rumah: ${homeDevices.size}")

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acUnit = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device
    }
    homeDevices.add(acUnit)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera" }

    searchResult?.let {
        println("\n--- Hasil Pencarian Kamera ---")
        println(it.diagnose())
    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }

    with(homeDevices) {
        println("\n=== RANGKUMAN DASHBOARD ===")
        println("Total perangkat terdaftar: ${this.size}")
        println("Total beban daya saat ini : $totalPower Watt")

        forEach { device ->
            println(device.diagnose())
        }
    }
}