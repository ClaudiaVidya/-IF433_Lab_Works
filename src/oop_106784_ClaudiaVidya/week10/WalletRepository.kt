package oop_106784_ClaudiaVidya.week10

interface NamedEntity {
    val name: String
}

class WalletRepository<T: NamedEntity> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(name: String): T? {
        return items.find { it.name.equals(name, ignoreCase = true) }
    }
}