package oop_106784_ClaudiaVidya.week14

class khs_mahasiswa {
    fun hitung_tugas(quiz: Double, tugasHarian: Double): Double {
        return (quiz * 0.3) + (tugasHarian * 0.7)
    }

    fun hitung_na(tugas: Double, uts: Double, uas: Double, kurikulum: kurikulum_kampus): Double {
        return kurikulum.bobot_nilai(uts, uas, tugas)
    }
}

interface kurikulum_kampus {
    fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double
}

class kur_merdeka : kurikulum_kampus {
    override fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.2) + (uas * 0.2) + (tugas * 0.3)
    }
}

// Tambahkan class ini jika ingin mendukung opsi selain merdeka
class kur_2013 : kurikulum_kampus {
    override fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}

class khs_db {
    fun simpan_nilai(nim: String, nama: String, na: Double): String {
        return "nilai $nim $nama dengan nilai $na berhasil simpan"
    }
}

fun main() {
    val khsMhs = khs_mahasiswa()
    val db = khs_db()
    val tugasMhs = khsMhs.hitung_tugas(83.0, 90.0)
    val kurikulumDigunakan = kur_merdeka()
    val naMhs = khsMhs.hitung_na(tugasMhs, 90.0, 80.0, kurikulumDigunakan)
    val statSimpan = db.simpan_nilai(nim = "123", nama = "Claudia Vidya", na = naMhs)

    println(statSimpan)
}