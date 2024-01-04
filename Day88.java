package days_of_coding;

import java.util.Scanner;

public class Day88 {//di day 88 saya mencommit terkait penentuan angka yang diinginkan dalam suatu deret angka
    public static void main(String[] args) {
        //disini ada scanner, dimana nantinya digunakan ketika ingin menginput angka pertama, selisih dari angka, dan urutan angka berapa yang ingin dilihat
        Scanner sc = new Scanner(System.in);
        
        //perintah untuk memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        int angka_pertama = sc.nextInt();//untuk menyimpan angka yang sudah diinputkan
        
        //perintah memasukkan selisih antar angka
        System.out.print("Masukkan selisih antar angka: ");
        int selisih = sc.nextInt();//untuk menyimpan angka selisih 

        //perintah untuk memasukkan urutan angka yang ingin diketahui
        System.out.print("Masukkan urutan angka yang ingin diketahui: ");
        int cari = sc.nextInt();//untuk menyiimpan angka seblmnya

        int angkadicari = angkaBerdasarkanDeret(angka_pertama, selisih, cari);//memanggil fungsi yang memuat rumus dari pencarian angka di urutan yang di inginkan
        
        //menampilkan angka keberapa yang ingin dicari dan nilainya
        System.out.println("Angka ke-" + cari + " dalam deret aritmetika tersebut adalah: " + angkadicari);
    }

    //nah disini adalah suatu fungsi untuk menghitung angka berikutnya pada deret aritmetika
    public static int angkaBerdasarkanDeret(int angka_pertama, int selisih, int n) {
        //kemudian disini adalah rumus umum deret aritmetika: a_n = a_1 + (n-1)d
        return angka_pertama + (n - 1) * selisih;
    }
}
