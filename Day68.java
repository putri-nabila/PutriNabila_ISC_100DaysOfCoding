package days_of_coding;

import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah baris dan kolom
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        // Membuat matriks dengan ukuran yang dimasukkan oleh pengguna
        int[][] matriks = new int[baris][kolom];

        // Meminta pengguna untuk memasukkan nilai-nilai matriks
        System.out.println("Masukkan nilai-nilai matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan nilai untuk baris " + (i + 1) + ", kolom " + (j + 1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }

        // Menampilkan matriks
        System.out.println("Matriks yang dimasukkan:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }

        // Menghitung total nilai matriks
        int total = 0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                total += matriks[i][j];
            }
        }

        // Menghitung rata-rata nilai matriks
        double rataRata = (double) total / (baris * kolom);

        // Menampilkan hasil total dan rata-rata
        System.out.println("Total nilai matriks: " + total);
        System.out.println("Rata-rata nilai matriks: " + rataRata);
    
    }
}
