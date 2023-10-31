package days_of_coding;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai batas atas: ");
        int batas = scanner.nextInt();
        
        int total = 0;
        for (int i = 1; i <= batas; i++) {
            total += i;
        }
        System.out.println("Jadi total penjumlahan dari 1 hingga " + batas + " adalah: " + total + ".");
    }
}

