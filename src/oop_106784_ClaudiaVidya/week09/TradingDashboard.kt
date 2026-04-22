package oop_106784_ClaudiaVidya.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 50, 120.0, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 5, -12.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 45.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 10, -2.0, "CLOSED")
    )

    println("=== TRADING PERFORMANCE SUMMARY ===")

    val tradingSummaries = tradeHistory
        .filter { it.status == "CLOSED" }
        .sortedByDescending { it.roe }
        .map {
            val result = if (it.roe > 0) "PROFIT" else "LOSS"
            "Pair: ${it.pair} | ROE: ${it.roe}% | Status: $result"
        }

    tradingSummaries.forEach { println(it) }
}