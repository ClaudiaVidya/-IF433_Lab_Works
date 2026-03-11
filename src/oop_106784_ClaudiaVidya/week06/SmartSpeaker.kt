package oop_106784_ClaudiaVidya.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name menyala. Siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("$name mati. Menghentikan pendengaran.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}