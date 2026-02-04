package oop_106784_ClaudiaVidya.week01

fun main() {
    val gameTitle = "Black Myth: Starlight"
    val price = 800000

    val discount = calculateDiscount(price)

    println("Judul      : $gameTitle")
    println("Harga: Rp $price")
    println("Diskon     : Rp $discount")

}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()