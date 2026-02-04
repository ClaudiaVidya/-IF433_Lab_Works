package oop_106784_ClaudiaVidya.week01

fun main() {
    val gameTitle = "Black Myth: Starlight"
    val price = 800000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, finalPrice = finalPrice, userNote = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    println("=== STRUK PEMBELIAN ===")
    println("Judul Game : $title")
    println("Total Bayar: Rp $finalPrice")
    println("Catatan    : ${userNote ?: "Tidak ada catatan"}")
    println("=======================")
}