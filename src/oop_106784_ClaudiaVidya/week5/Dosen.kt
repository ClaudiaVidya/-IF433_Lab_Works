package oop_106784_ClaudiaVidya.week5

class Dosen(nama: String, val nidn: String): Pegawai(nama) {
    override fun bekerja() {
        println("${nama} sedang menyampaikan materi perkuliahan dan mervisi RPKPS");
    }

    fun mengajar(){
        println("${nama} sedang mengajar mahasiswa di kelas");
    }
}