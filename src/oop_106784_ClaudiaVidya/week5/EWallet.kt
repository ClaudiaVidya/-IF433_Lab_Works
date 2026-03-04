package oop_106784_ClaudiaVidya.week5

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sebesar $amount berhasil menggunakan E-Wallet.")
            println("Sisa saldo $accountName: $balance")
        } else {
            println("Pembayaran gagal: Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Top-up berhasil! Saldo $accountName sekarang: $balance")
        } else {
            println("Jumlah top-up harus lebih dari 0.")
        }
    }
}