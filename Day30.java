package days_of_coding;

import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        for (int i = 0; i <= angka; i++) {
            if (i % 3 !=  0 && i % 2 == 0) {//untuk menghasilkan angka yang tidak habis dibagi 3 sekaligus bilangan itu genap
                System.out.println(i);
            }
        }
    }
}
