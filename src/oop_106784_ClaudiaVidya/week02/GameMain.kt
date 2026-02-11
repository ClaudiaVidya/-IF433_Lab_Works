package oop_106784_ClaudiaVidya.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    println("\nBattle dimulai! ${hero.name} (HP: ${hero.hp}) VS Enemy (HP: $enemyHp)")

    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- MENU ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy membalas dengan damage $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("Sisa HP ${hero.name}: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} LEAVE NOW!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n--- HASIL PERTARUNGAN ---")
    if (enemyHp <= 0) {
        println("${hero.name} YOU ARE WIN! Enemy telah dikalahkan!")
    } else if (!hero.isAlive()) {
        println("${hero.name} YOU ARE LOSE! Hero telah gugur...")
    } else {
        println("${hero.name} YOU ARE LOSER!!")
    }
}
