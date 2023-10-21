package days_of_coding;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        //untuk soalnya itu penentuan uang bersih yang didapatkan dari hasil penjualan tanah setelah dilakukan pemotongan pajak, dengan ketentuan:
        //harga jual permeter adalah Rp 300.000
        //Jika total harga jual 50 jt keatas maka dikenakan pajak 3%
        //Jika Total harga jual 100 jt keatas maka dikenakan pajak 5%
        //dibawah 50jt maka dikenakan pajak 1%.
        //luas tanah diinput menggunakan fungsi input
        Scanner scluas = new Scanner(System.in);
        System.out.print("Masukkan luas tanah : ");//untuk luasnya itu terhitung meter kuadrat
        int luas = scluas.nextInt();
        int hargajualperm = 300000;//harga tanah permeter
        
        int hargajual = luas * hargajualperm;//penentuan harga sebelum dipotong pajak
        System.out.println("Total Harga Jual     : " + hargajual);
        System.out.println("==========================================");
        
        if (hargajual > 100000000) {
            System.out.println("Dikenakan pajak 5%");
            int pajak = (int)(hargajual * 0.05);//(int) digunakan untuk mengkonversi hasilnya menjadi bilangan bulat, karena jika tidak maka hasilnya akan menjadi desimal
            System.out.println("Harga Pajak : Rp. " + pajak );
            int uangbersih = hargajual - pajak;
            System.out.println("Uang bersih yang diterima jika dikenakan pajak 5% adalah Rp. " + uangbersih );
        } else if(hargajual < 100000000 && hargajual > 50000000){
            System.out.println("Dikenakan pajak 3%");
            int pajak = (int)(hargajual * 0.03);//(int) digunakan untuk mengkonversi hasilnya menjadi bilangan bulat, karena jika tidak maka hasilnya akan menjadi desimal
            System.out.println("Harga Pajak : Rp. " + pajak );
            int uangbersih = hargajual - pajak;
            System.out.println("Uang bersih yang diterima jika dikenakan pajak 3% adalah Rp. " + uangbersih );
        } else {
            System.out.println("Dikenakan pajak 1%");
            int pajak = (int)(hargajual * 0.03);//(int) digunakan untuk mengkonversi hasilnya menjadi bilangan bulat, karena jika tidak maka hasilnya akan menjadi desimal
            System.out.println("Harga Pajak : Rp. " + pajak );
            int uangbersih = hargajual - pajak;
            System.out.println("Uang bersih yang diterima jika dikenakan pajak 1% adalah Rp. " + uangbersih );
        }
        
    }
}
