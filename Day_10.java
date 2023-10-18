package days_of_coding;

import java.util.Scanner;

public class Day_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan golongan               : ");
        int golongan = sc.nextInt();
        System.out.print("Masukkan lama kerja             : ");
        int lama_kerja = sc.nextInt();
        
        switch(golongan){
            case 1:
                int gaji1 = 4000000;
                System.out.println("Gaji untuk golongan I           : Rp. " +gaji1);
                if (lama_kerja > 5){
                    System.out.println("Karyawan sudah bekerja selama " + lama_kerja + " tahun");
                    int bonus = 100000;
                    System.out.println("Karyawan mendapatkan bonus Rp. 100.000/tahun");
                    int tambahan_gaji = bonus * lama_kerja;
                    System.out.println("Karyawan mendapat tambahan gaji : Rp. " + tambahan_gaji);
                    int gaji_keseluruhankaryawan = gaji1 + tambahan_gaji;
                    System.out.println("Jadi, gaji keseluruhan yang karyawan dapatkan adalah Rp. " + gaji_keseluruhankaryawan);
                }
                else{
                    System.out.println("Karyawan sudah bekerja selama " + lama_kerja + " tahun");
                    System.out.println("Karyawan tidak mendapatkan bonus");
                    int gaji_keseluruhankaryawan = gaji1;
                    System.out.println("Jadi, gaji keseluruhan yang anda dapatkan adalah Rp. " + gaji_keseluruhankaryawan);
                }
            break;
            case 2:
                int gaji2 = 7000000;
                System.out.println("Gaji untuk golongan II          : Rp. " + gaji2);
                if (lama_kerja > 5){
                    System.out.println("Karyawan sudah bekerja selama " + lama_kerja + " tahun");
                    int bonus = 100000;
                    System.out.println("Karyawan mendapatkan bonus Rp. 100.000/tahun");
                    int tambahan_gaji = bonus * lama_kerja;
                    System.out.println("Karyawan mendapat tambahan gaji : Rp. " + tambahan_gaji);
                    int gaji_keseluruhankaryawan = gaji2 + tambahan_gaji;
                    System.out.println("Jadi, gaji keseluruhan yang karyawan dapatkan adalah Rp. " + gaji_keseluruhankaryawan);
                }
                else{
                    System.out.println("Karyawan sudah bekerja selama " + lama_kerja + " tahun");
                    System.out.println("Karyawan tidak mendapatkan bonus");
                    int gaji_keseluruhankaryawan = gaji2;
                    System.out.println("Jadi, gaji keseluruhan yang karyawan dapatkan adalah Rp. " + gaji_keseluruhankaryawan);
                }
            break;
            case 3:
                int gaji3 = 10000000;
                System.out.println("Gaji untuk golongan III         : Rp. " +gaji3);
                if (lama_kerja > 5){
                    System.out.println("Karyawan sudah bekerja selama " + lama_kerja + " tahun");
                    int bonus = 100000;
                    System.out.println("Karyawan mendapatkan bonus Rp. 100.000/tahun");
                    int tambahan_gaji = bonus * lama_kerja;
                    System.out.println("Karyawan mendapat tambahan gaji : Rp. "+tambahan_gaji);
                    int gaji_keseluruhankaryawan = gaji3 + tambahan_gaji;
                    System.out.println("Jadi, gaji keseluruhan yang karyawan dapatkan adalah Rp. " + gaji_keseluruhankaryawan);
                }
                else{
                    System.out.println("Karyawan suda bekerja selama " + lama_kerja + " tahun");
                    System.out.println("Karyawan tidak mendapatkan bonus");
                    int gaji_keseluruhankaryawan = gaji3;
                    System.out.println("Jadi, gaji keseluruhan yang karyawan dapatkan adalah Rp. " + gaji_keseluruhankaryawan);
                }
            break;
            default:
                System.out.println("Golongan tidak tersedia!!");
        }
    }
}
