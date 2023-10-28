package days_of_coding;

import java.util.Scanner;

public class Day20 {
    //kalkulator sederhana unutk operasi penjumlahan, pengurangan, perkalian, dan pembagian
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input dua angka/bilangan dari pengguna
        System.out.print("Masukkan angka 1: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka 2: ");
        double angka2 = input.nextDouble();

        //menampilkan pilihan menu operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        //pilihan operasi dari pengguna
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        //melakukan operasi sesuai dengan pilihan pengguna dan menampilkan hasilnya
        if (pilihan == 1) {
           double hasil = angka1 + angka2;
           System.out.println("Hasil: " + hasil);// Menampilkan hasil operasi
        } else if (pilihan == 2) {
            double hasil = angka1 - angka2;
            System.out.println("Hasil: " + hasil);// Menampilkan hasil operasi
        } else if (pilihan == 3) {
            double hasil = angka1 * angka2;
            System.out.println("Hasil: " + hasil);// Menampilkan hasil operasi
        } else if (pilihan == 4) {
            if (angka2 != 0) {
               double hasil = angka1 / angka2;// Menampilkan hasil operasi
               System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Pembagian dengan nol tidak dapat dilakukan, silahkan masukkan angka selain nol dalam pembagian!!.");
                return;
            }
        } else {
            System.out.println("Pilihan operasi tidak valid/tidak tersedia.");
            return;
        }

        
        

    }
}
