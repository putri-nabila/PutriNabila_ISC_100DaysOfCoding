package days_of_coding;

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in);
        
        System.out.print("Masukkan nilai x : ");
        float x = scan.nextFloat();
        
        System.out.print("Masukkan nilai y : ");
        float y = scan.nextFloat();
        
        float p = x + y;
        System.out.println("Nilai P adalah " + p);
        
        if (p >= 4) {
            float q = x * y;
            System.out.println("Nilai akhir : " + q);
        } else{
            float q = x / y;
            System.out.println("Nilai akhir : " + q);
        }
    }
}
