package oop_106784_ClaudiaVidya.week08

fun main() {
    var name: String? = null

    try {
        println("nama kamu ${name!!.uppercase()}")
    }catch(ex: Exception){
        println("kamu kena error, ini pesan error: ${ex.message}")
    }

}