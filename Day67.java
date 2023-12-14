package days_of_coding;

import java.util.Scanner;

public class Day67 {//di day 67 saya mencommit tentang penggunaan array 2 dimensi untuk mencari nilai tertinggi/nilai maksimum
    public static void main(String[] args) {
        //hal pertama tentu saja membuat objek Scanner untuk mengambil input dari pengguna, dengan tipe data integer dan nama variabel input
        Scanner input = new Scanner(System.in);

        //meminta pengguna untuk memasukkan jumlah baris dan kolom yang diinginkan untuk matriks
        System.out.print("Masukkan berapa banyak baris yang diinginkan : ");
        int baris = input.nextInt();
        System.out.print("Masukkan berapa banyak kolom yang dinginkan : ");
        int kolom = input.nextInt();
        
        //membuat array dua dimensi (matriks) untuk menyimpan nilai-nilai yang dimasukkan oleh pengguna
        int[][] nilai = new int[baris][kolom];

        //perulangan untuk meminta pengguna memasukkan nilai untuk setiap elemen matriks, untuk setiiap baris dan kolom
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan nilai untuk baris " + (i + 1) + ", kolom " + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
            }
        }
        //perulangan untuk mencari nilai maksimum
        int max = nilai[0][0];
        for (int i = 0; i < baris; i++) {
           for (int j = 0; j < kolom; j++) {
               if (nilai[i][j] > max) {
                   max = nilai[i][j];
               }
           }
        }
        //menampilkan nilai maksimum
        System.out.println("Nilai maksimum adalah: " + max);
    }
}
