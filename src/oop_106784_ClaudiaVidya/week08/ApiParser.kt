package oop_106784_ClaudiaVidya.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        return try {
            val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
            val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

            val type = rawJson["type"] as? String

            when (type) {
                "ELECTRONIC" -> {
                    val warranty = rawJson["warranty"] as? Int ?: 12
                    Electronic(id, name, warranty)
                }
                "CLOTHING" -> {
                    val size = rawJson["size"] as? String ?: "All Size"
                    Clothing(id, name, size)
                }
                else -> null
            }
        } catch (e: IllegalArgumentException) {
            println(e.message)
            null
        }
    }

    fun checkout(product: Product) {
        val productId = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }
        val transactionId = JavaPaymentService.processPayment(productId)!!

        println("Transaction ID: $transactionId")
    }
}