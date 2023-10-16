package days_of_coding;

import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        //Dihari ke 8, membahas mengenai percabangan yakni ternary operator dan switch-case
        System.out.println("TERNARY OPERATOR");
        Scanner scan_nilai = new Scanner (System.in);//membuat suatu perintah inputan dengan nama variabel scan_nilai
        System.out.print("Masukkan nilai ujian : ");//inputan nilai
        int nilai = scan_nilai.nextInt();//membaca inputan nilai
        char index = nilai >= 80? 'A' : nilai >= 70? 'B' : nilai >= 60? 'C' : 'D';//menggunakan operator ternary untuk menetapkan nilai variabel index berdasarkan nilai variabel nilai.
        ////Jika nilai lebih besar atau sama dengan 80, maka index akan diisi dengan karakter 'A'. Jika tidak, tetapi nilai lebih besar atau sama dengan 70, maka index akan diisi dengan karakter 'B', dan seterusnya.
        //Ini adalah contoh dari operator ternary bersar di mana operator ini digunakan secara bertingkat untuk membuat keputusan berdasarkan beberapa kondisi.
        System.out.println("Nilai: " + nilai);//menampilkan nilai
        System.out.println("Index: " + index);//menampilkan index berdasarkan nilai
        
        System.out.println("===========================");
        System.out.println("SWITCH-CASE");
        Scanner sc = new Scanner (System.in);//membuat suatu perintah inputan dengan nama variabel sc
        System.out.print("Masukkan anime favorit anda : ");//untuk pilihannya inputannya itu memasukkan pilihan 1 2 3 4
        int anime = sc.nextInt();//membaca inputan anime
        
        switch (anime){
            case 1://jika nilai anime 1, maka akan mengeksekusi blok ini
                System.out.println("Anda memilih anime ONE PIECE");//menampilkan pilihan anime favorit yang dipilih
                break;//keluar dari case 1
            case 2://jika nilai anime 2, maka akan mengeksekusi blok ini
                System.out.println("Anda memilih anime NARUTO");//menampilkan anime favorit yang dipilih
                break;//keluar dari case 2
            case 3://jika nilai anime 3, maka akan mengeksekusi blok ini
                System.out.println("Anda memilih anime ATTACK ON TITAN");//menampilkan anime favorit yang dipilih
                break;//keluar dari case 3
            case 4://jika nilai anime 4, maka akan mengeksekusi blok ini
                System.out.println("Anda memili anime KIMETSU NO YAIBA");//menampilkan anime favorit yang dipilih
                break;//keluar dari case 4
            default:// Jika nilai variabel pilihan tidak cocok dengan kasus di atas, eksekusi blok kode ini (ini adalah kasus default)
                System.out.println("Anda salah memasukkan pilihan!!");//menampilkan pesan bahwa pilihan anda salah
        }
        
    }
}
