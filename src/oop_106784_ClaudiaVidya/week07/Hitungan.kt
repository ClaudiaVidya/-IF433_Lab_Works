package oop_106784_ClaudiaVidya.week07

class Hitungan private constructor(var halaman: String) {
    companion object {
        const val nameKampus: String = "UMN"
        const val nomorInduk: String = "00000106784"

        fun penambahan(a: Int, b: Int): Int {
            return a + b
        }

        fun pindah_halaman(namaHal: String) {
            Hitungan(halaman = namaHal)
        }
    }

    init {
        if(halaman.equals("home", ignoreCase = true)) {
            println("Welcome home")
        } else {
            println("Halaman lainnya")
        }
    }
}