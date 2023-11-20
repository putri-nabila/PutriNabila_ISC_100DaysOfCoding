package days_of_coding;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka awal  : ");
        int awal = input.nextInt();
        System.out.print("Masukkan angka akhir : ");
        int akhir = input.nextInt();
        
        int jumlahganjil = 0;
        int jumlahgenap = 0;
        
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                jumlahgenap += i;
            } else {
                jumlahganjil += i;
            }
        }
        System.out.println("Ganjil : " + jumlahganjil);
        System.out.println("Genap  : " + jumlahgenap);
    }
}
