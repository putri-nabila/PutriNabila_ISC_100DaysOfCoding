package days_of_coding;

import java.util.ArrayList;
import java.util.Collections;

public class Day53 {//di day 53 saya menngcommit codingan tentang arrayList dengan menghapus dan mengubah nilai dalam indeks tertentu
    public static void main(String[] args) {
        //membuat objek ArrayList yang bertipe data Integer dengan nama variabel angka
        ArrayList<Integer> angka = new ArrayList<>();

        //menambahkan angka ke dalam ArrayList dengan perintah angka.add(angka)
        angka.add(9);
        angka.add(3);
        angka.add(2);
        angka.add(13);
        angka.add(3);
        angka.add(0);
        angka.add(5);
        angka.add(8);
        angka.add(29);

        //menampilkan ArrayList sebelum diurutkan
        System.out.println("Sebelum diurutkan: " + angka);

        //menghapus indeks 8
        angka.remove(8);

        //mengganti nilai indeks 4 dengan nilai baru yakni nilai 10
        angka.set(4, 10);

        //menampilkan ArrayList setelah penghapusan dan penggantian nilai
        System.out.println("Setelah dihapus dan diganti: " + angka);
    }
}

