package oop_106784_ClaudiaVidya.week04

class Baju: Pakaian() {
    private var stock: Int =  10;
    public fun update_stock() {
        super.harga = stock * 100;
        println("stock $stock baju terupdate,"  + "harga ${super.harga}");
    }

    override public fun jumlah_Penjualan(){
        println("baju terjual");
        //super.harga = stock * 100;
    }
}