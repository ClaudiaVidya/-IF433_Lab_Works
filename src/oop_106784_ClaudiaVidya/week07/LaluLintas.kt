package oop_106784_ClaudiaVidya.week07

enum class LaluLintas(val arti:String){
    MERAH(arti = "Horizontal"),
    KUNING(arti = "Hati-hati"),
    HIJAU(arti = "Jalan");

    fun cetak_lalulintas() {
        println("Lampu lalu  lintas : " +  arti)
    }
}