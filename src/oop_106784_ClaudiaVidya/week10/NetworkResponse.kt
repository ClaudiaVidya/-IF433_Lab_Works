package oop_106784_ClaudiaVidya.week10

data class ApiResponse<T : NamedEntity>(val status: String, val data: List<T>)