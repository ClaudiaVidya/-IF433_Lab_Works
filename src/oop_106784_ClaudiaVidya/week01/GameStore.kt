package oop_106784_ClaudiaVidya.week01

fun main() {
    val gameTitle = "Black Myth: Starlight"
    val price = 800000

    val discount = calculateDiscount(price)

    val finalPrice = price - discount
    printReceipt(title = gameTitle, finalPrice = finalPrice)

}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int) {
    println("=== STRUK PEMBELIAN ===")
    println("Judul Game : $title")
    println("Total Bayar: Rp $finalPrice")
    println("=======================")
}