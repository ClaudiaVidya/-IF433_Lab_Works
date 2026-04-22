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

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println("=== CLOSED TRADES ===")
    closedTrades.forEach { println(it) }

    println("\n=== WINNING TRADES (PROFIT ONLY) ===")
    winningTrades.forEach { println(it) }

    println("\n=== LOSING TRADES (LOSS ONLY) ===")
    losingTrades.forEach { println(it) }

    println("\n=== TOP PERFORMERS ===")
    topPerformersString.forEach { println(it) }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println("\n=== WORST PERFORMERS ===")
    worstPerformersString.forEach { println(it) }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("\n=== UNIQUE TRADED PAIRS ===")
    println(uniquePairs)

    println("\n=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }
    worstPerformersString.forEach { println(it) }

    println("\nTotal Unique Pairs Traded: ${uniquePairs.size}")
    println("Pairs: $uniquePairs")

    worstPerformersString.forEach { println(it) }

    println("\n=== UNIQUE TRADED PAIRS ===")
    println(uniquePairs)

}