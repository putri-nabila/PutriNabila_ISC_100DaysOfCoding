package days_of_coding;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        if (angka % 3 == 0) {//untuk angka yang dimasukkan habis dibagi 3
            System.out.println("Pride Of 3");//menampilkan hasil jika angka yang di masukkan habis dibagi 3
        }else if (angka % 8 == 0){//untuk angka yang dimasukkan habis dibagi 8
            System.out.println("Pride Of 8");//menampilkan hasil jika angka yang di masukkan habis dibagi 8
        }else if (angka % 13 == 0){//untuk angka yang dimasukkan habis dibagi 13
            System.out.println("Pride Of 13");//menampilkan hasil jika angka yang di masukkan habis dibagi 13
        }
        else {
            System.out.println("Master Class");
        }
    }
}
