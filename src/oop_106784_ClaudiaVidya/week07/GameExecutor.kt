package oop_106784_ClaudiaVidya.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Waspada! Monster ${event.monsterName} muncul dari semak-semak!")
        }
        is BattleState.LootDropped -> {
            val item = event.item
            println("Hoki! Kamu menemukan [${item.name}] dengan kelangkaan ${item.rarity} (Drop Chance: ${item.rarity.dropChance}%)")
        }
        is BattleState.GameOver -> {
            println("Permainan Berakhir! Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu memasuki Safe Zone. Silakan beristirahat sejenak.")
        }
    }
}