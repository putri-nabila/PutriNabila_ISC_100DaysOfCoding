package days_of_coding;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan gaji pokok karyawan : Rp ");//inputan gaji pokok dari pengguna
        double gajiP = scanner.nextDouble();
        System.out.print("Masukkan lama lembur (jam)   : ");//inputan lama lembur dari pengguna
        double lama_lembur = scanner.nextDouble();

        double gajiLperjam = 55000;// gaji lembur per jam        
        double gajiLtotal = lama_lembur * gajiLperjam;//untuk menghitung total gaji lembur
        System.out.println("Total gaji lembur          : Rp " + gajiLtotal);
        double gaji_bersih = gajiP + gajiLtotal;// untuk menghitung gaji bersih
        System.out.println("Gaji bersih karyawan setiap bulannya adalah: Rp " + gaji_bersih);
    }
}
