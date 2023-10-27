package days_of_coding;

import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner zoro = new Scanner (System.in);
        System.out.print("Masukkan berapa kali kalimat ingin ditampilkan : ");
        int jumlah = zoro.nextInt();
        for (int i = 1; i < jumlah; i++) {
            System.out.println("Santoryu Ogi: Rokudo no Tsuji " + i);
        }
    }
}
