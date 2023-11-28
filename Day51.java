package days_of_coding;

import java.util.ArrayList;
import java.util.Collections;

public class Day51 {//di day 51 saya menngcommit codingan tentang ArrayList dengan mengurutkan nilai didalamnya
    public static void main(String[] args) {
        //yang pertama yang saya lakukan yaitu, membuat objek ArrayList yang bertipe data Integer dengan nama variabel angka
        ArrayList<Integer> angka = new ArrayList<>();

        //setelah itu menambahkan angka ke dalam ArrayList dengan perintah angka.add(angka berapa)
        angka.add(9);
        angka.add(3);
        angka.add(2);
        angka.add(29);
        angka.add(3);
        angka.add(0);
        angka.add(1);
        angka.add(8);
        angka.add(13);

        //menampilkan ArrayList sebelum diurutkan
        System.out.println("Sebelum diurutkan: " + angka);
        
        //enggunakan fungsi sort() dari kelas Collections untuk mengurutkan elemen dalam ArrayList.
        Collections.sort(angka);

        //menampilkan ArrayList setelah diurutkan dengan fungsi sort()
        System.out.println("Setelah diurutkan: " + angka);
    }
}
