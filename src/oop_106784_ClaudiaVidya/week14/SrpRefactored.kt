package oop_106784_ClaudiaVidya.week14

class UserValidator {
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 18
}

class UserRepository {
    fun save(user:User) {
        println("Saving User: ${user.name} to database")
    }
}

class EmailService {
    fun sendWelcomeEmail(user:User) {
        println("Welcome Email -> ${user.name}")
    }
}