package days_of_coding;

import java.util.Scanner;
import java.util.Stack;

public class Day98 {//di day 98 saya mencommit terkait stack untuk membuat list daftar benda
    public static void main(String[] args) {
        //hal pertama membuat objek scanner dan objek stack
        Scanner scan = new Scanner(System.in);//disini ada Scanner untuk inputan nantinya, dengan nama scan
        Stack<String> benda = new Stack<>();//objek stack dengan nama variabel benda
        
        System.out.print("Masukkan batas inputan : ");//perintah untuk memasukkan batas inputan/batas nama benda yang akan ada di list
        int batas = scan.nextInt();//variabel batas untuk menyimpan batas inputan yang sudah dimasukkan sebelumnya
        
        String nama;//mendeklarsikan variabel nama dengan tipe data String
        //perulangan for untuk nantinya memasukkan nama nama benda serta untuk menampilkan nama yang sudah dimasukkan 
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukkan nama benda : ");
            nama = scan.next();
            benda.push(nama);
        }
        System.out.println("===================================");//pembatas
        System.out.println("Daftar Benda");
        for (int i = 0; i < benda.size(); i++) {
            System.out.println(benda.get(i));
        }
        
        System.out.println("===================================");//pembatas
        String atas = benda.peek();//untuk melihat nama benda yang awalan hurufnya pertama dalam alafabet
        System.out.println("Nama Benda Terakhir : " + atas);//kemudian menampilkannya
        
        String hapus = benda.pop();//untuk menghapus salah satu benda
        System.out.println("Nama yang di hapus : " + hapus);//disini untuk memilih benda apa yang akan dihapus dari list benda sebelumnya

        System.out.println("===================================");//pembatas
        //terakhir menampilkan daftar benda setelah mengapus salah satu nama
        System.out.println("Daftar Nama Benda setelah menghapus");
        for (int i = 0; i < benda.size(); i++) {
            System.out.println(benda.get(i));
        }
    }
}
