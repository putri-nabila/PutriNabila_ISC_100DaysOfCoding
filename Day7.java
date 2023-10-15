package days_of_coding;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        //Dihari ke 7, membahas mengenai percabangan
        Scanner sc = new Scanner (System.in);//membuat suatu perintah inputan dengan nama variabel sc
        System.out.println("PERCABANGAN");
        int harga = 10000;//harga barang
        System.out.print("Masukkan jumlah pembelian : ");//inputan jumlah pembelian
        int jumlah = sc.nextInt();//membaca inputan jumlah
        
        int total_pembelian = harga * jumlah;//perhitungan untuk jumlah pembelian
        System.out.println("Total Pembelian adalah    : Rp. " + total_pembelian);
        
        if (total_pembelian >= 200000) {//jika total pembelian lebih besar atau sama dengan 200000
            double diskon = 0.5;//maka mendaptkan diskon sebesar 0,5 atau 50%
            System.out.println("Anda mendaptkan diskon 50%");//menampilkan diskon yang didapatkan
            double potongan_harga = total_pembelian * diskon;//mencari berapa potongan harga yang didaptkan jika dapat diskon 50% dengan cara mengalikan total pembelian dengan diskon
            System.out.println("Maka anda mendapatkan potongan harga sebesar Rp. " + potongan_harga);//menampilkan jumlah potongan harga yang didapat
            double total_bayar = total_pembelian - potongan_harga;//mencari total harga yang harus dibayar dengan mengurangkan total pembelian dengan potongan harga yang didapatlkan sebelumnya
            System.out.println("Maka total harga yang harus anda bayar adala Rp. " + total_bayar);//menampilkan jumlah total bayar yang harus dibayarkan
        }else if (total_pembelian >= 100000 && total_pembelian <= 199000){//jika total pembelian lebih besar atau sama dengan 100000 dan lebih kecil atau sama dengan 199000
            double diskon = 0.2;//maka mendaptkan diskon sebesar 0,2 atau 20%
            System.out.println("Anda mendapatkan diskon 20%");//menampilkan diskon yang didapatkan
            double potongan_harga = total_pembelian * diskon;//mencari berapa potongan harga yang didaptkan jika dapat diskon 20% dengan cara mengalikan total pembelian dengan diskon
            System.out.println("Maka anda mendapatkan poto1ngan harga sebesar Rp. " + potongan_harga);//menampilkan jumlah potongan harga yang didapat 
            double total_bayar = total_pembelian - potongan_harga;//mencari total harga yang harus dibayar dengan mengurangkan total pembelian dengan potongan harga yang didapatlkan sebelumnya
            System.out.println("Maka total harga yang harus anda bayar adala Rp. " + total_bayar);//menampilkan jumlah total bayar yang harus dibayarkan
        } else {//jika tidak termasuk dari kedua syarat diatas maka tidak mendapatkan diskon
            System.out.println("Anda tidak mendapatkan diskon");//menampilkan tidak mendapat diskon
            double total_bayar = total_pembelian;//maka untuk total harga itu sama dengan total pembelian karena tidak mendapatkan diskon/potongan harga
            System.out.println("Maka total harga yang harus anda bayar adala Rp. " + total_bayar);//menampilkan jumlah total bayar yang harus dibayarkan
        }//penutup percabangan   
    }
}
