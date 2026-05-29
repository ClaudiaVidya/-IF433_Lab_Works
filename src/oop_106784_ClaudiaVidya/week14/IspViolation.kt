package oop_106784_ClaudiaVidya.week14

interface MultifanctionDevice {
    fun print(doc:String)
    fun scan(doc: String)
    fun fax(doc:String)
}

class SimplePrinter : MultifanctionDevice {
    override fun print(doc: String) = println("Printing: $doc")
    override fun scan(doc: String) = throw UnsupportedOperationException("No Scanner")
    override fun fax(doc: String) = throw UnsupportedOperationException("No Fax")
}