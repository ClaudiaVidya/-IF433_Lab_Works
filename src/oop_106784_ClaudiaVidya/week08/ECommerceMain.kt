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
                parser.checkout(it)
            } ?: println("Log: Skipping item (Unknown type or null product)")

        } catch (e: IllegalArgumentException) {
            println("Log Warning: Data korup ditemukan! Reason: ${e.message}")
        }
    }

    println("\n=== PROCESSING COMPLETE ===")
}