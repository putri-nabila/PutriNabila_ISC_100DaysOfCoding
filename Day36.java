package days_of_coding;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nama Anda             : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM Anda              : ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan alamat Anda           : ");
        String alamat = input.nextLine();
        
        System.out.print("Masukkan Anda anak ke          : ");
        int anak_ke = input.nextInt();
        
        System.out.print("Masukkan jumlah saudara Anda :");
        int saudara = input.nextInt();
        
        System.out.println("Halo, perkenalkan saya " + nama + " dengan NIM " + nim + "." + " Saya tinggal di " + alamat + ".");
        System.out.println("Dan saya anak ke " + anak_ke +" dari " + saudara + " bersaudara.");
    }
}
