package oop_106784_ClaudiaVidya.week07

enum class Arah(val petunjuk:String) {
    Atas("Naik"),
    Bawah("Turun"),
    Kiri(petunjuk = "Belok"),
    Kanan( petunjuk = "Mengsong");

    fun tampilkan_isi_param(){
        println("arah ke $petunjuk")
    }
}