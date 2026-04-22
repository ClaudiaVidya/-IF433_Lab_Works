package oop_106784_ClaudiaVidya.week09

fun main() {
    println("=== LIST OF IMUT ===")
    val arSiswa = listOf("Ali", "Budi", "Cica")
    println(arSiswa)
    println("Nama siswa: " + arSiswa[1])
    println("Banyak siswa: " + arSiswa.size)

    for(i in arSiswa) {
        println("ini siswanya: " + i)
    }

    println("=== LIST OF MUTABLE ===")

    val arMatkul = mutableListOf("OOP", "Matdis", "GameDev")
    arMatkul.add("Kalkulus")
    arMatkul.remove("Matdis")

    println(arMatkul)


    println("=== SET OF IMMUTABLE")
    var arNilai = setOf(80,90,20,10,100,40,30,50,50,90,80,20)
    println("Banyak data: ${arNilai.size}")
    println("Angka 20 apakah ada? ${arNilai.contains(20)}")
    println(arNilai)

    println("=== SET OF MUTABLE ===")
    var arMakanan = mutableSetOf("Snack", "Nasgor", "Tempe Goreng", "Tahu")
    arMakanan.add("Mie")
    arMakanan.remove("Nasgoreng")
    arMakanan.add("Terong Goreng")
    println(arMakanan)

    println("=== MAP OF IMMUTABLE ===")
    val arrDataMhs = mapOf(
        "Acong" to 89,
        "Siska" to 90,
        "Udin" to 83
    )

    println("Banyak Data: ${arrDataMhs.size}")
    println("Acong Nilainya: ${arrDataMhs["Acong"]}")
    println("List Semua Mhs: ${arrDataMhs.keys}")
    println("List Semua Nilai: ${arrDataMhs.values}")
    println(arrDataMhs)

    println("=== MAP OF MUTABLE ===")

    val arrMenuResto = mutableMapOf(
        "Mie ayam" to 5000,
        "Mie bakso" to 6000,
        "Mie pangsit" to 6500
    )

    arrMenuResto["Mie bakso"] = 6200

    arrMenuResto.remove("Mie ayam")

    println(arrMenuResto)
}