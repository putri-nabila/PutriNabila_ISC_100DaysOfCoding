package days_of_coding;

import java.util.Scanner;

public class Day84 {//di day 84 saya mencommit terkait pembuatan pola diamond/berlian
    public static void main(String[] args) {
        //membuat pola diamond dengan awalnya menginput jumlah baris atas dan bawah dihitung dari tengah
        Scanner sc = new Scanner(System.in);//pertama itu membuat objek scanner dengan nama variabel sc
        System.out.print("Masukkan baris : ");//meminta masukkan baris
        int baris = sc.nextInt();//disini membuat variabel baris untuk menyimpan inputan yang diimasukkan
        int spasi = baris - 1;//membuat variabel spasi dengan nilai awal -1
        int bintang = 1;//membuat variabel bintang dengan nilai awal 1
        
        System.out.println("====================================");
        //disini untuk setengah bagian atas dari pola diamond/berlian
        //membuat perulangan untuk bagian atas diamond/berlian
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= spasi; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= bintang; k++) {
                System.out.print("+");//menggunakan simbbol + untuk polanya nanti
            }
            System.out.println();
            spasi--;
            bintang += 2;
        }
        
        //nah dibagian sini adalag setengah bagian bawah dari pola diamond
        spasi = 1;
        bintang = baris * 2 - 3;
        //ada perulangan juga
        for (int i = 1; i <= baris - 1; i++) {
            for (int j = 1; j <= spasi; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= bintang; k++) {
                System.out.print("+");//menggunakan simbbol + untuk polanya nanti
            }
            System.out.println();
            spasi++;
            bintang -= 2;
        }
    }
}
