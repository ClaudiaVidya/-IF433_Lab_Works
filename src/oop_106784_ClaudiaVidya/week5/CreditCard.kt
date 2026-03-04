package oop_106784_ClaudiaVidya.week5

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran sebesar $amount menggunakan Kartu Kredit berhasil.")
            println("Total penggunaan limit $accountName: $usedAmount / $limit")
        } else {
            println("Transaksi ditolak: Pembayaran sebesar $amount akan melebihi limit kartu kredit.")
        }
    }
}