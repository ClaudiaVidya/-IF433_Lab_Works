package oop_106784_ClaudiaVidya.week5

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

}