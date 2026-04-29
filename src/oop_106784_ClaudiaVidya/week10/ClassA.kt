package oop_106784_ClaudiaVidya.week10

//Non-Generic programming
class meja(val hasil:Any)

//Generic Programming
class kursi<T>(val hasil:T)

//Generic Programming
class televisi<T,V>(val merk:T, val kodeBarcode:V)

//Generic - Function
fun <T> Alamat(kodepos:T):T {
    return kodepos;
}

//Generic - Constant
class kalkulator<T:Number>(val a:T, val b:T){
    fun tambah():Int {
        return a.toInt() + b.toInt()
    }
    fun kurang():Double {
        return a.toDouble() - b.toDouble()
    }
}

//Generic - Where
val arNilai = listOf(60,70,80,90,67,88,92,79)
fun <T>nilaiDiatasKKM(list: List<T>, kkm:T): List<T> where T: Comparable<T> {
    return list.filter{it>=kkm}
}

fun main() {

    println("=== Implementasi dari non generic ===")
    val mj = meja(hasil = 100)
    val hargaMeja = mj.hasil as Int
    println(hargaMeja + 50)
    //kalau ditambah tambahin dia bakalan error, beda sama yang generic malah ga error

    println("=== Implementasi dari generic ===")
    val chair = kursi(hasil = 300)
    println(chair.hasil + 50)

    println("=== Generic Multi Param ===")
    val tv = televisi( merk = "Samsung", kodeBarcode = "99887")
    println("Merknya " + tv.merk)
    println("Barcode ${tv.kodeBarcode + 777}")

    println("=== Generic Function ===")
    println("Kode pos kamu : " +  Alamat(429842))

    println("=== Implementasi Generic Kalkulator ===")
    val kal = kalkulator(a = 10.5, b = 20.47)
    println("hasil penambahan ${kal.a} ditambah ${kal.b}: " + kal.tambah())
    println("hasil pengurangan ${kal.a} dikurang ${kal.b}: " + kal.kurang())

    println("=== Generic -  WHERE ===")
    println("Semua nilai: " + arNilai)
    var nalaiKKM =  nilaiDiatasKKM(list = arNilai, kkm = 78)
    println("Nilai diatas kkm: " + nalaiKKM)
}