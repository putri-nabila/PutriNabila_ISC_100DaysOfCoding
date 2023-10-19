package days_of_coding;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scmenu = new Scanner (System.in);
        
        System.out.println("============DAFTAR MENU============");
        System.out.println("1. Ayam Goreng + Nasi  : Rp. 25000");
        System.out.println("2. Nasi Goreng Jakarta : Rp. 20000");
        System.out.println("3. Ayam Bakar + Nasi   : Rp. 30000");
        System.out.println("4. Mie Bakso           : Rp. 15000");
        System.out.println("5. Sate Ayam + Nasi    : Rp. 18000");
        System.out.println("===================================");
        
        System.out.println("==========DAFTAR MINUMAN===========");
        System.out.println("1. Es Teh      : Rp. 5000");
        System.out.println("2. Es Jeruk    : Rp. 6000");
        System.out.println("3. Kopi        : Rp. 8000");
        System.out.println("4. Wedang Jahe : Rp. 7000");
        System.out.println("5. Air Mineral : Rp. 3000");
        System.out.println("===================================");
        
        System.out.print("Masukkan angka sesuai dengan menu yang tersedia : ");
        int nomakanan = scmenu.nextInt();
        System.out.print("Jumlah makanan yang dipesan: ");
        int jumlahmkn = scmenu.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.print("Masukkan angka sesuai dengan minuman yang tersedia: ");
        int nominuman = scmenu.nextInt();
        System.out.print("Jumlah minuman yang dipesan: ");
        int jumlahmnm = scmenu.nextInt();
        
        System.out.println("--------------------------------------------------");
        int hargaMakanan = 0;
        String menuMakanan = "";
        if (nomakanan == 1) {
            hargaMakanan = 25000;
            menuMakanan = "Ayam Goreng + Nasi";
        } else if (nomakanan == 2) {
            hargaMakanan = 20000;
            menuMakanan = "Nasi Goreng Jakarta";
        } else if (nomakanan == 3) {
            hargaMakanan = 30000;
            menuMakanan = "Ayam Bakar + Nasi";
        } else if (nomakanan == 4) {
            hargaMakanan = 15000;
            menuMakanan = "Mie Bakso";
        } else if (nomakanan == 5) {
            hargaMakanan = 18000;
            menuMakanan = "MSate Ayam + Nasi";
        } 
        else {
            System.out.println("Menu makanan tidak valid.");
            return;
        }

        // Menghitung total harga minuman berdasarkan menu yang dipilih
        int hargaMinuman = 0;
        String menuMinuman = "";
        if (nominuman == 1) {
            hargaMinuman = 5000;
            menuMinuman = "Es Teh";
        } else if (nominuman == 2) {
            hargaMinuman = 6000;
            menuMinuman = "Es Jeruk";
        } else if (nominuman == 3) {
            hargaMinuman = 8000;
            menuMinuman = "Kopi";
        } else if (nominuman == 4) {
            hargaMinuman = 7000;
            menuMinuman = "Wedang Jahe";
        } else if (nominuman == 5) {
            hargaMinuman = 3000;
            menuMinuman = "Air Mineral";
        }
        else {
            System.out.println("Menu minuman tidak valid.");
            return;
        }

        // Menghitung total harga pesanan
        int totalHarga = (hargaMakanan * jumlahmkn) + (hargaMinuman * jumlahmnm);

        // Menampilkan hasil pemesanan
        System.out.println("Menu makanan yang dipesan: " + menuMakanan);
        System.out.println("Jumlah menu makanan yang dipesan: " + jumlahmkn);
        System.out.println("Harga per menu makanan: Rp. " + hargaMakanan);
        System.out.println("-----------------------------------------------");
        System.out.println("Menu minuman yang dipesan: " + menuMinuman);
        System.out.println("Jumlah menu minuman yang dipesan: " + jumlahmnm);
        System.out.println("Harga per menu minuman: Rp. " + hargaMinuman);
        System.out.println("-----------------------------------------------");
        System.out.println("Total harga yang harus dibayar: Rp. " + totalHarga);
    }
}
