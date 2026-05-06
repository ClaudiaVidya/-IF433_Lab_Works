package oop_106784_ClaudiaVidya.week11

//fun biasa
fun salam_pembuka(nama: String) {
    if(nama=="Claudia") {
        println("Salam kenal")
    } else {
        println("Kamu siapa ya? Gak kenal")
    }
}


//fun exten
fun String.rubah_huruf_depan_jadi_besar():String {
    var hasil = this.split(" ").joinToString(separator = " ") { it ->
        it.replaceFirstChar{
            c-> c.uppercase()
        }
    }
    return "Hasil $hasil"
}

//parameter
fun Int.tentuinGrade(namaMhs: String): String {
    val hasilGrade: String

    if (this >= 88) {
        hasilGrade = "A"
    } else if (this >= 70) {
        hasilGrade = "B"
    } else {
        hasilGrade = "C"
    }

    println(namaMhs + " Grade kamu " + hasilGrade)
    return hasilGrade
}

//fun exten-null
fun String?.cekNnulldanEmpty(): String {
        if(this  == null || this.isEmpty()){
            return "username ga boleh null atau empty"
        } else {
            return "Username kamu $this"
        }
}

fun main() {
    //fun biasa
    var nameSaya =  "Claudia"
    println(nameSaya.uppercase())
    salam_pembuka(nameSaya)

    //ini panggil exten dasar
    println("Hai udin sedunia".rubah_huruf_depan_jadi_besar())

    //panggil exten parameter
    var hasilStr = 71.tentuinGrade(namaMhs = "Claudia")
    var hasil = hasilStr.toString().repeat(88)
    println(hasil)

    //panggil exten null
     var usernameKamu:String? =  null
    println(usernameKamu.cekNnulldanEmpty())

    // Scope - LET
    var kampusKamu = "UMN"
    kampusKamu.let {
        if(it == "UMN") {
            println("Ih keren")
        } else {
            println("Ih ga keren")
        }
    }

    //SCOPE - RUN
    var namaMatkul:String = "OOP";
    namaMatkul.run {
        println("Matkul favorite saya " + this);
    }

    //SCOPE - WITH
    val keputusanLulus = with(receiver = 70) {
        if(this >= 70) {
            "Lulus"
        } else {
            "Remedial"
        }
    }

    println("kamu $keputusanLulus");

    //SCOPE - APPLY
    var listMhs = mutableListOf<String>("Udin", "Siti")
    listMhs.apply {
        this.add("Claudia")
        this.add("Vidya")
    }
    println(listMhs)

    //SCOPE - ALSO
    val arDeret = mutableListOf<Int>(60, 70, 56, 80);
    arDeret.also {
        println("Deret Sebelum : $arDeret")
    }.add(90)
    println("Deret Setelah : $arDeret")
}