package oop_106784_ClaudiaVidya.week07


fun main() {
    koneksi.alamatServer = "sadadadjlabda"
    println("Servernya  ada di " + koneksi.alamatServer);
    koneksi.konek_db();

    println("Nama kampus: " + Hitungan.nameKampus)
    println("Nomor " + Hitungan.nomorInduk)
    println("Tambahan: " + Hitungan.penambahan(a = 10, b = 2))

    Hitungan.pindah_halaman(namaHal = "Home")
    val siswa = Murid(nama = "Claudia", nim = "123", angkatan = "824")
    val siswa2 = siswa.copy(nama = "Vidya")
    println(siswa)
    println(siswa2)

    println(LaluLintas.MERAH)
    println(LaluLintas.KUNING)
    println(LaluLintas.HIJAU)

    LaluLintas.KUNING.cetak_lalulintas()
}