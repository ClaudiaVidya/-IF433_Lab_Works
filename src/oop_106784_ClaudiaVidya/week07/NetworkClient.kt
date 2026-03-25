package oop_106784_ClaudiaVidya.week07

class NetworkClient private constructor(val url:String) {
    fun connect(){
        println("Connecting to $url...")
    }
}