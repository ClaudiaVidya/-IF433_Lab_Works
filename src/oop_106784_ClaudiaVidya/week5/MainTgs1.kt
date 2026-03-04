package oop_106784_ClaudiaVidya.week5

fun main() {
    val helper = MathHelper()

    val hasilPersegi = helper.hitungLuas(5)
    println("Hasil Luas Persegi: $hasilPersegi")

    val hasilPersegiPanjang = helper.hitungLuas(10, 8)
    println("Hasil Luas Persegi Panjang: $hasilPersegiPanjang")

    val hasilLingkaran = helper.hitungLuas(7.0)
    println("Hasil Luas Lingkaran: $hasilLingkaran")
}