package days_of_coding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        ArrayList genap = new ArrayList();
        ArrayList ganjil = new ArrayList();

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batasan angka : ");
        int batas = sc.nextInt();

        for (int i = 1; i <= batas + 1; i++) {
            if (i % 2 == 0) {
                genap.add(i);
                System.out.println(i + " adalah angka genap");
            } else {
                ganjil.add(i);
                System.out.println(i + " adalah angka ganjil");
            }
        }
    }
}
