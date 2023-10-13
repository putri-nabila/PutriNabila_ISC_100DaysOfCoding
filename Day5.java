package days_of_coding;

import java.util.Scanner;

public class Day5 {
    //Dihari ke 5, membahas mengenai berbagai macam operator aritmatika yang ada pada java
    //Ada 5 operatornya, yaitu penjumlahan, pengurangan, perkalian, pembagian, dan modulus(sisa bagi)
    //Selain membahas mengenai operator aritmatika, di sini saya akan membahas sedikit tentang operator penambahan satu dan pengurangan satu
    public static void main(String[] args) {
        Scanner scan_aritmatika = new Scanner (System.in);//membuat suatu perintah inputan dengan nama variabel scan
        //Kali ini saya hanya akan menggunakan satu tipe data untuk variabel
        System.out.println("Inputan Nilai a dan b");//untuk angka yang akan dioperasikan
        System.out.print("Masukkan nilai a : ");//inputan nilai a
        int a = scan_aritmatika.nextInt();//untuk membaca inputan integer
        System.out.print("Masukkan nilai b : ");//inputan nilai b
        int b = scan_aritmatika.nextInt();//untuk membaca inputan integer
        
        //Operator Aritmatika
        int penjumlahan = a + b;//operator penjumlahan dimana hasilnya nanti itu integer
        int pengurangan = a - b;//operator pengurangan dimana hasilnya nanti itu integer
        int perkalian = a * b;//operator perkalian dimana hasilnya nanti itu integer
        double pembagian = (double)a/b;//operator pembagian dimana hasilnya nanti itu double (karena bisa saja hasilnya itu desimal)
        int modulus = a%b;//operator modulus dimana hasilnya nanti itu integer
        b++;//menambahkan atau meningkatkan nilai b dengan 1
        a--;//mengurangi nilai a dengan 1
        
        //menampilkan hasil
        System.out.println("==================================");
        System.out.println("Output hasil oparator aritmatika");
        System.out.println("Hasil Penjumlahan     : " + penjumlahan);//menampilkan hasil dari operator penjumlahan
        System.out.println("Hasil Pengurangan     : " + pengurangan);//menampilkan hasil dari operator pengurangan
        System.out.println("Hasil Perkalian       : " + perkalian);//menampilkan hasil dari operator perkalian
        System.out.println("Hasil Pembagian       : " + pembagian);//menampilkan hasil dari operator pembagian
        System.out.println("Hasil Modulus         : " + modulus);//menampilkan hasil dari operator modulus
        System.out.println("Penambahan 1 nilai b  : " + b);//menampilkan hasil dari operator penambahan 1
        System.out.println("Pengurangan 1 nilai a : " + a);//menampilkan hasil dari operator pengurangan 1
    }
}
