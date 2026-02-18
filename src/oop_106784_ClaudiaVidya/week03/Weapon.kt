package oop_106784_ClaudiaVidya.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("WARNING!! Damage tidak boleh negatif! Nilai tetap $field.")
            } else if (value > 1000) {
                println("WARNING!!!! DAMAGE OVERLOAD!! Dipaksa ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}

fun main() {
    val sword = Weapon("Excalibur")

    sword.damage = 600
    println("Tier: ${sword.tier}")

    sword.damage = 1200
    println("Tier: ${sword.tier}")

    sword.damage = -50
}