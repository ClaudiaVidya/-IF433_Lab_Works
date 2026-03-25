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

    println("\n=== MODIFIKASI & SINYAL EVENT ===")

    val upgradedItem = starterWeapon.item.copy(name = "Pedang Kayu Tajam", damage = 25)
    println("Upgrade Berhasil! Senjata baru: ${upgradedItem.name} (Damage: ${upgradedItem.damage})")

    println("\n--- Memulai Petualangan ---")

    processEvent(BattleState.SafeZone)

    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))

    processEvent(BattleState.LootDropped(upgradedItem))

    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}