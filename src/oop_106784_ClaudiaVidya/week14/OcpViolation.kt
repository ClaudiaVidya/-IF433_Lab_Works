package oop_106784_ClaudiaVidya.week14

class DiscountCalculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "student" -> price * 0.80
            "number" -> price * 0.85
            "employee" -> price * 0.70
            else -> price
        }
    }
}