package oop_106784_ClaudiaVidya.week5

fun main() {
    val dosen1 = Dosen( nama = "Claudia", nidn = "0123456");
    val admin1 = Admin(nama = "Vidya");

    val  daftarPegawai: List<Pegawai> = listOf(dosen1, admin1);

    println("=== AKTIVITAS PEGAWAI ===");
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when(pegawai) {
            is  Dosen -> {
                println("=> Terdeteksi sebagai dosen dengan (NIDN: ${pegawai.nama})");
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    }
    println("--------------------------------------")
}