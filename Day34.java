package days_of_coding;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int bil = scan.nextInt();
        
        for (int i = 1; i <= bil; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap.");
            }
        }
        
    }
}
