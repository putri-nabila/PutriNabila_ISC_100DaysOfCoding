package days_of_coding;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka awal  : ");
        int awal = input.nextInt();
        System.out.print("Masukkan angka akhir : ");
        int akhir = input.nextInt();
        
        int ganjil = 0;
        int genap = 0;
        
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                genap += awal;
            } else {
                ganjil += awal;
            }
        }
        System.out.println("Ganjil : " + ganjil);
        System.out.println("Genap  : " + genap);
    }
}
