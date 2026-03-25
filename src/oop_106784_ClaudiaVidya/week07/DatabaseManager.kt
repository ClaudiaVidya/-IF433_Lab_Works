package oop_106784_ClaudiaVidya.week07

object DatabaseManager {
    var connectionStatus: String = "Dissconected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}