package oop_106784_ClaudiaVidya.week5

abstract class Karyawan {
    val nama: String = "Claudia"

    abstract fun bekerja(Kecepatan: Int = 12): String
}

class staff : Karyawan() {
    override fun bekerja(Kecepatan: Int): String {
        return "Staff sedang bekerja, dengan $Kecepatan"
    }

    fun pegang_uang(): String {
        return "Staffnya pegang uang"
    }
}

class Manager : Karyawan() {
    override fun bekerja(Kecepatan: Int): String {
        return "Manager mengawasi $Kecepatan Km/jam"
    }
    fun quality_control(): String {
        return "Manager sedang melakukan quality control"
    }
}

fun main() {
    val listKry: List<Karyawan> = listOf(
        staff(),
        Manager()
    )
    println("Jenis Karyawan ada " + listKry.size)

    for (kry in listKry) {
        println("Karyawan kerja: " + kry.bekerja(3))

        if (kry is staff) {
            println("karyawan pegang uang: ${kry.pegang_uang()}")
        } else if (kry is Manager) {
            println(kry.quality_control())
        }
    }

    /*val staf = staff()

    println("Staff kerja ${staf.bekerja(3)}");
    val manager = Manager()

    println("Manager kerja ${manager.bekerja(3)}");*/

}