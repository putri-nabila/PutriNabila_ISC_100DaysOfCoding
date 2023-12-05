package days_of_coding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        //mendeklarasikan array list dengan tipe data integer dalam variabek angka
        ArrayList<Integer> angka = new ArrayList<>();

        //menambahkan elemen ke array list menggunakan inputan
        Scanner scan = new Scanner(System.in);

        //meminta user untuk memasukkan jumlah angka
        System.out.println("Masukkan jumlah angka: ");
        int jumlahAngka = scan.nextInt();
        
        //menggunakan perulangan untuk memasukkan angka pada array list
        for (int i = 0; i < jumlahAngka; i++) {
            //kemudian disini memasukkan angka ke-i
            System.out.println("Masukkan angka ke-" + (i + 1) + ": ");
            //angka.add untuk menambahkan angka yang kita masukkan ke dalam array list
            angka.add(scan.nextInt());
        }

        //menampilkan array list
        System.out.println("Array list: " + angka);

        //memasukkan nilai yang ingin dicari
        System.out.println("Masukkan nilai yang ingin dicari: ");
        int cari = scan.nextInt();

        //percabangan untuk memeriksa apakah nilai yang dimasukkan sama dengan nilai pada salah satu indeks
        //dan apakah nilai yang dimasukkan sama dengan nilai pada indeks 5
        boolean nilaiDitemukan = false;
        for (int i = 0; i < angka.size(); i++) {
            if (cari == angka.get(i)) {
                System.out.println("Nilai " + cari + " ditemukan pada indeks " + i);
                nilaiDitemukan = true;
            } else if (cari == angka.get(4)) {
                System.out.println("Program berhenti!!!");
                return;
            }
        }

        //jika nilai yang dimasukkan tidak terdapat didalam array list maka akan menampilkan pesan bahwa nilai tidak ditemukan
        if (!nilaiDitemukan) {
            System.out.println("Nilai tidak ditemukan.");
        }
    }
}
