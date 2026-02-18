package oop_106784_ClaudiaVidya

open class pelajar {
    private var nama = "belum ada nama"
    private var nilai: Int = 0
    protected var jmlsks: Int = 0;

    public fun set_nama(namaorang: String) {
        if (namaorang.isEmpty()) {
            println("Eh, nama orang ga boleh kosong")
        } else {
            this.nama = namaorang
        }
    }

    public fun get_nama(): String {
        return this.nama
    }

     fun set_nilai(skor: Int) {
        if (skor < 0) {
            println("Peringatan: Nilai tidak boleh minus! Data tidak disimpan.")
        } else {
            this.nilai = skor
        }
    }

      fun get_nilai(): Int {
        return nilai;
    }
}

class Matakuliah:pelajar() {
    fun muncul_namasks(): Int {
        return this.jmlsks;
    }
}

fun main() {
    val mahasiswa = Matakuliah();

    mahasiswa.set_nama("Udin")

    mahasiswa.set_nilai(-20)

    mahasiswa.set_nilai(90)

    println("Jumlah Sks kamu: " + mahasiswa.get_nilai());
    println("Nama kamu: ${mahasiswa.get_nama()}")
    println("Nilai kamu: ${mahasiswa.get_nilai()}")

    //println("hai" + mahasiswa.nama + "Nilai kamu ${mahasiswa.nilai}");
}