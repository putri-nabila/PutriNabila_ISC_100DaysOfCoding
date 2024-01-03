package days_of_coding;

import java.util.Scanner;

public class Day87 {//di day 87 ini saya mengcommit terkait method untuk mencari luas segitiga
    //hal pertama yaitu membuat suatu method dengan nama segitiga
    public static void segitiga (double alas, double tinggi){//pada bagian ini untuk memasukkan rumus dari luas segitiga
       double hasil;//deklarasi variabel hasil dengan tipe data double
       hasil = alas * tinggi * 0.5;//kemudian disini ada rumus segitiga
       System.out.println("Luas segitiga adalah : " + hasil);//nah disini untuk menampilkan hasil dari luas segitiga
    }
    public static void main(String[] args) {//ini adalah method utama
        //disini menggunakan scanner untuk panjang alas dan tinggi dari segitiga
        Scanner scan = new Scanner(System.in);//dengan nama variabel scan
        System.out.print("Masukkan alas segitiga : ");//perintah untuk menginputkan alas segitiga
        double alas = scan.nextDouble();//variabel alas untuk menyimpan nilai alas segitiga yang sudah di inputkan
        
        //untuk tinggi
        System.out.print("Masukkan tinggi segitiga : ");//perintah unutk masukkan tinggi segitiga
        double tinggi = scan.nextDouble();//variabel tinggi untuk menyimpan nilai tinggi segitiga yang sudah di inputkan
        
        System.out.println("==========================");
        //menampilan alas dan tinggi segitiga
        System.out.println("Alas segitiga : " + alas);
        System.out.println("Alas segitiga : " + tinggi);
        
        segitiga(alas, tinggi);//memanggi method utama
    }
}
