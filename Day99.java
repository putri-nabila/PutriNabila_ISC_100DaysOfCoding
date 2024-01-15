package days_of_coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day99 {//di day 99 saya mencommit terkait penggunaan queue dalam membuat kalkulator sederhana berupa penjumlahan, pengurangan, perkalian, dan pembagian
    public static void main(String[] args) {
        //hal pertama membuat suatu objek Scanner untuk nantinya menyimpan inputan, dengan nama variabel scan
        Scanner scan = new Scanner(System.in);
        
        //kemudian membuat objek queue dengan nama variabel angka
        Queue<Integer> angka = new LinkedList<>();

        //disini ada perulangan for untuk memasukkan dua angka
        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan angka : ");//disini ada perintah untuk memasukkan angka
            int a = scan.nextInt();//variabel a untuk menyimpan angka yang sudah diinput
            angka.add(a); //disini nggunakan add() untuk menambahkan elemen ke dalam queue
        }
        
        int angka1 = angka.poll();
        int angka2 = angka.poll();
        
        System.out.println("---------------------------------------");//pembatas    
        
        //kemudian disini ada 4 pilihan dalam kalkulatornya
        System.out.println("=====KALKULATOR=====");
        System.out.println("1. Penjumlahan (+)");//ada penjumlahan 
        System.out.println("2. Pengurangan (-)");//ada pengurangan
        System.out.println("3. Perkalian   (*)");//ada perkalian
        System.out.println("4. Pembagian   (/)");//dan ada pembagian
        System.out.println("====================");
        System.out.print("Pilih Operasi : ");//disini diminta untuk memasukkan pilihan operasi, yakni ada 1, 2, 3, atau 4 tergantung yang diinginkan
        int operasi = scan.nextInt();//untuk menyimpan pilhan
        int hasil;//mendeklarasikan variabel hasil untuk nentinya menyimpan hasil yang diperoleh
        System.out.print("\nHasil : ");
        switch (operasi) {
            case 1://disini jika memilih angka 1
                hasil = angka1 + angka2;//kemudian rumus dari penjumlahn
                System.out.print(angka1 + " + " + angka2 + " = " + hasil);//setelah itu menampilkan hasilnya
                break;
            case 2://disini jika memilih angka 2
                hasil = angka1 - angka2;//kemudian rumus pengurangan
                System.out.print(angka1 + " - " + angka2 + " = " + hasil);//setelah itu menampilkan hasilnya
                break;
            case 3://disni jiika memilih angka 3 
                hasil = angka1 * angka2;//kemudian rumus perkalian
                System.out.print(angka1 + " * " + angka2 + " = " + hasil);//setlah itu menampilkan hsilnya
                break;
            case 4://dan disini jika memilih angka 4
                hasil = angka1 / angka2;//kemudian rumus pembagian
                System.out.print(angka1 + " / " + angka2 + " = " + hasil);//setelah itu menampilkan hasilnya
                break;
            default:
                System.out.print("");
        }
        System.out.println();
    }
}
