package days_of_coding;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        //disini untuk menampilkan bilangan genap dari angka awal hingga akhir, dimana untuk angka awal dan akhir itu dimasukkan dengan scanner
        Scanner angka = new Scanner (System.in);
        System.out.print("Dari   : ");
        int dari = angka.nextInt();
        System.out.print("Sampai : ");
        int sampai = angka.nextInt();
        
        for (int i = dari; i <= sampai; i++) {
            if (i%2==0)//untuk mengetaui apakah nilai i adalah bilangan genap, jika hasil bagi dari nilai i dengan 2 adalah 0
                System.out.println(i+" ");//Jika nilai i adalah bilangan genap (memenuhi kondisi if), maka nilai i dicetak ke layar diikuti oleh spasi.
        }
    }
}
