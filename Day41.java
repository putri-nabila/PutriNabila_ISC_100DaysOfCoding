package days_of_coding;

import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Masukkan batasan angka: ");
        int batas = scan.nextInt();
        
        for (int i = 1; i <= batas; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " : Genap");
            } else {
                System.out.println(i + " : Ganjil");
            }
        }
    }
}
