package oop_106784_ClaudiaVidya.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== Simulasi Jadwal Makan Pagi ===")

    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        println("Sisa stok kibble: $currentKibbleStock gr")
    } catch (e: DispenserJamException) {
        println("Gagal: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Gagal: ${e.message}")
    } catch (e: Exception) {
        println("Terjadi kesalahan umum: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n=== Simulasi Jadwal Makan Sore ===")
    val result = runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }

    result.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { e ->
        println("Peringatan ke Pemilik: ${e.message}")
    }

    println("Program berjalan dengan lancar")
}