package days_of_coding;

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //mengambil input usia pengunjung
        System.out.print("Masukkan usia Anda : ");
        int usia = input.nextInt();

        //memeriksa apakah pengunjung boleh menonton film
        if (usia >= 17) {//usia yang diperbolehkan menonton film
            System.out.println("Anda boleh menonton film ini. Selamat menonton dan menikmati filmnya!!");
        } else {
            System.out.println("Maaf, Anda belum cukup umur untuk menonton film ini.Silahkan kembali jika usia anda sudah mencukupi!");
        }
    }
}
