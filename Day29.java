package days_of_coding;

import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        int angka = scan.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
