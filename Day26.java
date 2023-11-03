package days_of_coding;

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
       Scanner anime = new Scanner (System.in);
       
       System.out.print("Masukkan nama karakter dalam anime one piece yang menjadi favorit anda : ");
       String wanpis = anime.nextLine();
        System.out.println("Karakter favorit anda di One Piece: " + wanpis);
    }
}
