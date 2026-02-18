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
    val myWeapon = Weapon("Soul Star")

    println("--- Test 1: Set damage ke -50 ---")
    myWeapon.damage = -50
    println("Damage sekarang: ${myWeapon.damage}")

    println()

    println("--- Test 2: Set damage ke 9999 ---")
    myWeapon.damage = 9999
    println("Damage sekarang: ${myWeapon.damage}")

    println()

    println("--- Hasil Akhir ---")
    println("Nama Senjata: ${myWeapon.name}")
    println("Tier Senjata: ${myWeapon.tier}")
}