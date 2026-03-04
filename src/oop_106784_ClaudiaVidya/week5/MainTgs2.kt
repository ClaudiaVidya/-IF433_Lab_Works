package oop_106784_ClaudiaVidya.week5

fun main() {
    val myWallet = EWallet("Claudia", 50000.0)

    val myCard = CreditCard("Claudia", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(myWallet, myCard)

    println("--- Memulai Pembayaran (Tagihan: 75.000) ---")

    for (method in paymentList) {
        println("Memproses metode: ${method.accountName}")
        method.processPayment(75000.0)
        println("-------------------------------------------------")
    }
}