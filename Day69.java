package days_of_coding;

import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = scanner.nextInt();

        // Membuat array 2 dimensi untuk menyimpan nama dan harga barang
        String[][] barangDanHarga = new String[jumlahBarang][2];

        // Input nama dan harga barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Masukkan nama barang ke-" + (i + 1) + ": ");
            barangDanHarga[i][0] = scanner.next();

            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            barangDanHarga[i][1] = scanner.next();
        }

        // Menampilkan isi array
        System.out.println("===================================");
        System.out.println("Nama Barang \t  Harga");//penambahan \t atau tab
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println(barangDanHarga[i][0] + "\t\t" + barangDanHarga[i][1]);
        }

        // Menghitung total harga
        int totalHarga = 0;
        for (int i = 0; i < jumlahBarang; i++) {
            totalHarga += Integer.parseInt(barangDanHarga[i][1]);
        }

        // Menentukan diskon menggunakan percabangan
        System.out.println("===================================");
        double diskon = 0.0;
        if (totalHarga > 100000) {
            diskon = 0.1; // Diskon 10%
            System.out.println("Mendapatkan diskon sebesar 10%");
            double harga_diskon = diskon * totalHarga;
            System.out.println("Diskon sebesar : " + harga_diskon);
        }else{
            System.out.println("Tidak mendapatkan diskon");
        }
        
        System.out.println("===================================");
        // Menghitung total bayar setelah diskon
        double totalBayar = totalHarga - (totalHarga * diskon);

        // Menampilkan total bayar setelah diskon (jika ada)
        System.out.println("Total bayar: Rp." + totalBayar);

        // Menutup scanner
        scanner.close();
    }
}
