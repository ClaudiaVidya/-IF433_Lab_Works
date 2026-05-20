import java.io.BufferedReader
import java.io.File
import java.io.FileReader

data class Siswa(val nim:String, val nama:String, val uangsaku:Int){
    fun convert():String{
        return "$nim, $nama, $uangsaku"
    }
}

fun main() {
    val sis = Siswa(nim = "111", nama = "Claudia", uangsaku = 1000000)
    val file4 = File("src/oop_ClaudiaVidya/week13/data_siswa.csv")
    val dataSiswa = listOf<Siswa>(
        Siswa(nim = "222", nama = "Vidya", uangsaku = 1000000),
        Siswa(nim = "333", nama = "Yow", uangsaku = 3000000),
        Siswa(nim = "444", nama = "Yow", uangsaku = 3000000),
    )
    file4.writeText(dataSiswa.joinToString("\n") {
        it.convert()
    })

    println("=== Baca File cara pertama ===")
    val path = "src/oop_106784_ClaudiaVidya/week13/Latihanweek13.txt"
    val file = File(path)

    if (file.exists()) {
        val isiContent = file.readText()
        println(isiContent)
    } else {
        println("File tidak ditemukan! Periksa kembali path-nya.")
    }

    println("=== Baca File cara kedua ===")
    if (file.exists()) {
        val contentIsi = file.readLines()
        contentIsi.forEach {
            println(it)
        }
    }

    println("\n=== Baca File - Cara3 BUFFERED READER ===")
    val file2 = BufferedReader(FileReader("src/oop_106784_ClaudiaVidya/week13/Latihanweek13.txt"))
    var baris: String? = file2.readLine()
    while(baris != null) {
        println(baris)
        baris = file2.readLine()
    }
    file2.close()

    println("\n=== Baca File - Cara4 BUFFERED READER (Ver.USE) ===")
    File("src/oop_106784_ClaudiaVidya/week13/Latihanweek13.txt").bufferedReader().use {
        it.lineSequence()
            .filter { it.isNotEmpty() }
            .forEach { println(it) }
    }

    println("=== \n Buat File cara pertama ===")
    val fileSaya = File("src/oop_106784_ClaudiaVidya/week13/Filsaya.txt")
    fileSaya.writeText("Ini adalah manusia baik\nClaudia gacor")
    fileSaya.appendText("Saya beli makanan dan buah-buahan\n")

    val listBelanja = listOf<String>("Sushi", "Steak","Semangka")
    fileSaya.appendText(listBelanja.joinToString("\n"))
    fileSaya.printWriter().use { out ->
        out.println("Yeah")
    }



}