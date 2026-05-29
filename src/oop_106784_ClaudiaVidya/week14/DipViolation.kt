package oop_106784_ClaudiaVidya.week14

class MySQLDatabase {
    fun query(sql:String): List<String> = listOf("data", "data2")
}

class UserService {
    private val database = MySQLDatabase()
    fun getUser(id: Int) = database.query("SELECT * FROM users WHERE id = $id")
}