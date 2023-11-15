package days_of_coding;

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nama depan    : ");
        String namaD = input.nextLine();
        
        System.out.print("Masukkan nama belakang : ");
        String namaB = input.nextLine();
        
        System.out.print("Masukkan tinggi badan  : ");
        float tb = input.nextFloat();
        
        System.out.print("Masukkan berat badan   : ");
        float bb = input.nextFloat();
        
        System.out.print("Masukkan umur Anda     : ");
        int umur = input.nextInt();
        
        
        System.out.println("======================================");
        System.out.println("Nama Lengkap  : " + namaD + " " + namaB);
        System.out.println("Tinggi Badan  : " + tb + " cm");
        System.out.println("Berat Badan   : " + bb + " kg");
        System.out.println("Umur          : " + umur + " tahun");
    }
}
