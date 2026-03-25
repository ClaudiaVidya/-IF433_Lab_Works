package oop_106784_ClaudiaVidya.week07

fun main() {
    println("=== SIMULASI GAME START ===")

    GameManager.startGame()
    GameManager.startGame()

    println("\n=== SIMULASI FACTORY & ENUM ===")

    val legendaryChance = ItemRarity.LEGENDARY.dropChance
    println("Drop Chance Legendary: $legendaryChance%")

    val starterWeapon = Weapon.forgeStarterSword()

    println("Senjata Baru Didapat: ${starterWeapon.item.name}")
    println("Detail: Damage ${starterWeapon.item.damage}, Rarity ${starterWeapon.item.rarity}, Durability ${starterWeapon.durability}")
}