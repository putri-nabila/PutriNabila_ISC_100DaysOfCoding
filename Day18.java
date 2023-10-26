package days_of_coding;

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner sc_input = new Scanner(System.in);
        //input usia pengunjung
        System.out.print("Masukkan usia anda: ");
        int usia = sc_input.nextInt();
        //input kelas tempat duduk
        System.out.println("Pilih kelas tempat duduk:");
        System.out.println("1. VIP");
        System.out.println("2. Regular");
        System.out.println("3. Ekonomi");
        System.out.print("Masukkan pilihan: ");
        int kelas = sc_input.nextInt();

        //penentuan harga tiket berdasarkan kelas dan diskon usia
        int harga_tiket = 0;
        if (kelas == 1) {
            harga_tiket = 800000; //harga tiket VIP
        } else if (kelas == 2) {
            harga_tiket = 500000; //harga tiket Regular
        } else if (kelas == 3) {
            harga_tiket = 200000; //harga tiket Ekonomi
        } else {
            System.out.println("Maaf, pilihan kelas tidak valid. Silahkan pilih ulang!!.");
            return;
        }

        //diskon untuk anak-anak di bawah 12 tahun
        if (usia < 12) {
            double diskon = 0.2; //mendapatkan diskon 20% untuk anak-anak di bawah 12 tahun
            harga_tiket -= harga_tiket * diskon;
        }

        //menampilkan usia dan harga tiket yang harus dibayar
        System.out.println("Usia anda adalah " + usia  + " tahun");
        System.out.println("Harga tiket yang harus dibayar Rp. " + harga_tiket);

    }
}
