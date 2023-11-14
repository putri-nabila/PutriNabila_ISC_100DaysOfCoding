package days_of_coding;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan angka : ");
        int batas = sc.nextInt();
        
        for (int i = 3; i <= batas; i++) {
            if (i % 3 ==  0 && i % 2 == 0) {
                System.out.println(i);//menampilkan angka genap yang habis dibagi 3
            }
        }
    }
}
