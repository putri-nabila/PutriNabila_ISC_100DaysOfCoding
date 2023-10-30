package days_of_coding;

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan batas bilangan : ");
        int jumlah = scan.nextInt();
        for (int i = 1000; i > jumlah; i--) {//i-- berarti berkurang 1 angka setiap langkah, yang mana nilai awal 1000 kemudian setiap langkahnya akan berkurang 1
            System.out.println("Urutan bilangan terbesar hingga terkecil  : " +i);//dimulai dari 1000 hingga batas bilangan yang sudah dimasukkan, untuk jumlahnya itu berdasarkan inputan juga
        }
    }
}
