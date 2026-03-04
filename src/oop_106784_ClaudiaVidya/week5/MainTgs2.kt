package oop_106784_ClaudiaVidya.week5

fun main() {
    val myWallet = EWallet("Claudia", 50000.0)

    val myCard = CreditCard("Claudia", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(myWallet, myCard)

    println("--- Memulai Pembayaran Smart Casting ---")

    for (method in paymentList) {
        println("Metode: ${method.accountName}")
        method.processPayment(75000.0)
        println("-------------------------------------------------")

        if (method is EWallet) {
            println("Metode dipilih E-Wallet. Menjalankan top-up otomatis ...");
            method.topUp(50000.0)

            println("Mencoba pembayaran ulang setelah melakukan top-up:")
            method.processPayment(75000.0);
            println("-------------------------------------------------")
        }
    }
}