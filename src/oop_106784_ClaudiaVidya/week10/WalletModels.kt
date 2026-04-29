package oop_106784_ClaudiaVidya.week10

data class Coin(override val name: String, val balance: Double) : NamedEntity
data class Transaction(override val name: String, val amount: Double) : NamedEntity