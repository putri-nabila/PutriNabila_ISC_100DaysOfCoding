package days_of_coding;

import java.util.Scanner;

public class Day4 {
    //Dihari 3, membahas mengenai masalah inputan dengan inputan personal
    //kali ini saya menggunakan beberapa tipe data
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);//membuat suatu perintah inputan dengan nama variabel scan
        System.out.println("INPUT");
        //untuk inputan dengan tipe data string
        System.out.print("Masukkan nama         : ");//inputan nama
        String nama = scan.nextLine();//untuk membaca inputan String
        System.out.print("Masukkan NIM          : ");//inputan nim
        String nim = scan.nextLine();//untuk membaca inputan String
        System.out.print("Masukkan hobi         : ");//inputan hobi
        String hobi = scan.nextLine();//untuk membaca inputan String
        System.out.print("Masukkan kesan        : ");//inputan kesan
        String kesan = scan.nextLine();//untuk membaca inputan String
        
        //untuk inputan dengan tipe data integer
        System.out.print("Masukkan umur         : ");//inputan umur
        int umur = scan.nextInt();//untuk membaca inputan integer
        
        //untuk inputan dengan tipe data float
        System.out.print("Masukkan berat badan  : ");//inputan berat badan
        float bb = scan.nextFloat();//untuk membaca inputan float
        
        //untuk inputan dengan tipe data double
        System.out.print("Masukkan tinggi badan :");//inputan tinggi badan
        double tb = scan.nextDouble();//untuk membaca inputan double
        
        System.out.println("===========================");
        System.out.println("OUTPUT");
        System.out.println("Halo, perkenalkan nama saya  " + nama + " dengan nim " + nim );
        System.out.println("Saya berumur " + umur + " tahun, " + " dengan tinggi badan sekitar " + tb + " cm dan berat badan sekitar " + bb + " kg");
        System.out.println("Adapun hobi saya yaitu " + hobi);
        System.out.println("Terakhir kesan saya selama berkuliah di UNSULBAR itu " + kesan);
        
        
    }
}
