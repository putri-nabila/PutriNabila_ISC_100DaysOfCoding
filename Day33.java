package days_of_coding;

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int n = input.nextInt();
        
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Master Class");
        } else if (n % 5 == 0) {
            System.out.println("Pride of 5");
        } else if (n % 3 == 0 ) {
            System.out.println("Pride of 3");
        } else{
            System.out.println("Angka tidak sesuai dengan kriteria!");
        }
    }
}
