package oop_106784_ClaudiaVidya.week08

class set_krs(val nim: String, val tahun: Int?) {
    fun pilih_matkul(kodeMatkul: String?) {
        println("Matkul dipilih: $kodeMatkul")
    }
}

fun main() {
    var name: String? = "Claudia"
    name = null
    println("Hai $name")

    val setKRS = set_krs(nim = "0123456789", tahun = null)

    println("si ${setKRS.nim} masuk tahun ${setKRS.tahun}")

    setKRS.pilih_matkul(null)
}