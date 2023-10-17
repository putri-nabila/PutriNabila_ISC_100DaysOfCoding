package days_of_coding;

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);//membuat suatu perintah inputan dengan nama variabel sc
        System.out.print("Masukkan pilihan anime favorit anda : ");//untuk pilihannya inputannya itu memasukkan pilihan 1 2 3 4
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
                System.out.println("Anda memilih anime KIMETSU NO YAIBA");//menampilkan anime favorit yang dipilih
                break;//keluar dari case 4
            case 5://jika nilai anime 5, maka akan mengeksekusi blok ini
                System.out.println("Anda memilih anime DEATH NOTE");//menampilkan anime favorit yang dipilih
                break;//keluar dari case 5
            case 6://jika nilai anime 6, maka akan mengeksekusi blok ini
                System.out.println("Anda memilih anime BLEACH");//menampilkan anime favorit yang dipilih
                break;//keluar dari case 6
            case 7://jika nilai anime 7, maka akan mengeksekusi blok ini
                System.out.println("Anda memilih anime BLACK CLOVER");//menampilkan anime favorit yang dipilih
                break;//keluar dari case 7
            case 8://jika nilai anime 8, maka akan mengeksekusi blok ini
                System.out.println("Anda memilih anime JUJUTSU KAISEN");//menampilkan anime favorit yang dipilih
                break;//keluar dari case 8
            case 9://jika nilai anime 9, maka akan mengeksekusi blok ini
                System.out.println("Anda memilih anime HAIKYUU");//menampilkan anime favorit yang dipilih
                break;//keluar dari case 9
            case 10://jika nilai anime 10, maka akan mengeksekusi blok ini
                System.out.println("Anda memilih anime BOKU NO HERO ACADEMIA");//menampilkan anime favorit yang dipilih
                break;//keluar dari case 10
            default:// Jika nilai variabel pilihan tidak cocok dengan kasus di atas, eksekusi blok kode ini (ini adalah kasus default)
                System.out.println("Anda salah memasukkan pilihan!!");//menampilkan pesan bahwa pilihan anda salah
        }
    }
}
