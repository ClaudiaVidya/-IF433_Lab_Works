package oop_106784_ClaudiaVidya.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    println("=== STARTING COMMERCE PROCESSING ===\n")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                when(it) {
                    is Electronic -> println("Info: ${it.name} (Warranty ${it.warrantyMonths})")
                    is Clothing -> println("Info: ${it.name} (Size ${it.size})")
                }
                parser.checkout(it)
            } ?: println("Log: Skip item dengan tipe tidak dikenal (FOOD)")

        } catch (e: IllegalArgumentException) {
            println("Caught Exception: ${e.message}")
        }
    }

    println("\n=== PROCESSING COMPLETE ===")
}