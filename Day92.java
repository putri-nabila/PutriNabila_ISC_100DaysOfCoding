package days_of_coding;
import java.util.ArrayList;
import java.util.Scanner;

public class Day92 {
    public static void main(String[] args) {
        ArrayList <Integer> angka = new ArrayList<>();
        
        Scanner sc = new Scanner (System.in);
        int total = 0;


        while (true) {
            System.out.print("Masukkan angka (jika ingin mengakhiri masukkan angka 0):");
            int input = sc.nextInt();

            if (input == 0) {
                break; 
            }

            angka.add(input);
            total += input;

            System.out.println("Total penjumlahan: " + total);
        }

        System.out.println("Hasil akhir penjumlahan: " + total);
    }
}
