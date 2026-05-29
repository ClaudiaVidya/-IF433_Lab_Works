package oop_106784_ClaudiaVidya.week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String) = listOf("pg_detail", "pg_data2")
}