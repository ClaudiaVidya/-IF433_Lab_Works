package oop_106784_ClaudiaVidya.week12

fun basic_trycatch(pembilang: Int, penyebut: Int) {
    try {
        val hasil = pembilang / penyebut
        println("hasil bagi adalah ... $hasil")
    } catch (e: Exception) {
        println("ADA ERROR pembagian: ${e.message}")
    } finally {
        println("Selesai pembagian")
    }
}

fun cek_tipe_data(angka: String) {
    var nilai: Int = try {
        Integer.parseInt(angka)
    } catch (e: Exception) {
        println("ada error di cek tipe data ${e.message}")
        123
    }

    println("Nilai kamu $nilai")
}

fun cek_gaji(hariKerja: Int) {
    if(hariKerja < 0) {
        throw IllegalArgumentException("Masa Hari kerja minus");
    } else {
        val gaji = hariKerja * 1000;
        println("Gaji kamu $gaji");
    }
}

class cekSaldoBank(val saldoKamu: Int, val jajanKamu: Int) :
    Exception("Saldo kamu $saldoKamu, jajan kamu $jajanKamu, gak cukup lah!!!");

class transaksi_pembelian(val saldoAwal: Int) {
    fun mulai_jajan(pengeluaranKamu: Int) {
        if (saldoAwal < pengeluaranKamu) {
            throw cekSaldoBank(saldoKamu = saldoAwal, jajanKamu = pengeluaranKamu);
        } else {
            val sisaSaldo = saldoAwal - pengeluaranKamu;
            println("Sisa saldo kamu $sisaSaldo");
        }
    }
}

fun multi_catch(input:String, penyebut:Int) {
    try {
        val num:Int = input.toInt();
        println(num / penyebut)
    } catch (e: NumberFormatException) {
        println("ada error multicatch, salah format: ${e.message}");
    } catch (e: ArithmeticException) {
        println("ada error multicatch, aritmatika: ${e.message}");
    } catch (e: Exception) {
        println("ada error multicatch, Errornya adalah: ${e.message}");
    }
}

fun main() {
    multi_catch(input = "10", penyebut = 2);

    try {
        val trxBeli = transaksi_pembelian(saldoAwal = 1000);
        trxBeli.mulai_jajan(pengeluaranKamu = 1100);
    } catch (e: Exception) {
        println("Error Transaksi: ${e.message}")
    }

    cek_tipe_data(angka = "abc");
    try {
        cek_gaji(hariKerja = -1);
    } catch (e: Exception) {
        println("Ada yang salah. ${e.message}")
    }

    basic_trycatch(pembilang = 10, penyebut = 2)
}