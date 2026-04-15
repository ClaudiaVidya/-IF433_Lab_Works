package oop_106784_ClaudiaVidya.week08

class Alamat(val nomor:String, val kota: String)
class Mahasiswa(val name: String, val addr: Alamat?)

fun main() {
    val alm = Alamat(nomor = "49", kota = "Tangerang")
    val mhs = Mahasiswa(name = "Claudia", addr = alm)

    //val defKota = mhs.addr?:"Tidak tahu tinggal di mana"

    val defKota = mhs.addr?.let {
        alamatDefault->"Tinggal  di ${mhs.addr.kota}"
    }?:"Tidak tahu dia tinggal di mana"

    println("hai ${mhs.name} kamu tinggal di ${defKota}")
}