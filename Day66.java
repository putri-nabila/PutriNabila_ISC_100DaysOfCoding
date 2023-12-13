package days_of_coding;

import java.util.Scanner;

public class Day66 {//di day 66 saya mencommit tentang penggunaan array 2 dimensiuntuk menghitung rata rata nilai salah satu siswa
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

        //kemudian menghitung total nilai dalam matriks menggunakan perulangan
        int total = 0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                total += nilai[i][j];
                System.out.println("Total nilai : "+total);
            }
        }

        //menghitung rata-rata nilai dalam matriks, menggunakan rumus
        double rata2 = (double) total / (baris * kolom);

        //menampilkan rata-rata
        System.out.println("Rata-rata nilai salah satu siswa di kelas X Mipa 1 adalah: " + rata2);
    }
}
