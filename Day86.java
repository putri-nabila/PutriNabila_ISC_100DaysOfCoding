package days_of_coding;

import java.util.Scanner;

public class Day86 {//di day 86 saya mencommit terkait pembuatan pola/gambar segitiga sama kaki dalam bahasa java
    public static void main(String[] args) {
        //disini menggunakan scanner untuk inputan terkait tinggi segitiganya
        //pertama tentu saja mendeklarasikan objek scanner dengan nama variabel scan
        Scanner scan = new Scanner(System.in);
        
        //unutk menginputkan tinggi dari segitiga
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scan.nextInt();//variabel tinggi untuk menyimpan inputan sebelumnya
        
        System.out.println("=============================");
        
        //menampilan segitiga sama kaki
        System.out.println("Segitiga sama kaki:");
        
        //membuat pola segitiga sama kaki menggunakan perulangan for
        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi - i; j >= 1; j--) {
                System.out.print("  ");//menerapkan spasi setiap bintang
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");//bintang untuk element dalam polanya
            }
            System.out.println();
        }
    }
}

