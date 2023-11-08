package days_of_coding;

import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan gaji perbulan : ");
        float gaji = sc.nextFloat();
        
        if (gaji >= 5240000) {
            int zakat = (int)(gaji*0.025);//zakat yang harus dibayar yaitiu 2,5% dari gaji perbulan
            System.out.println("Zakat yang harus dibayar : RP. " + zakat);
        }else{
            System.out.println("Belum wajib zakat");
        }
    }
}
