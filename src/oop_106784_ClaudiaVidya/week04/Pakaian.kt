package oop_106784_ClaudiaVidya.week04

open class Pakaian {
    private var merk: String = "";
    protected var harga: Int = 0;

    init {
        this.merk = "Uniqlo";
        println("merk is $merk");
    }

    open public fun jumlah_Penjualan() {
        println("pakaian terjual");
    }
}