package days_of_coding;

import java.util.Hashtable;
import java.util.Map;

public class Day96 {//di day 96 saya mencommit terkait hashtable
   public static void main(String[] args) {
        //hal pertama yang dilakukan yaitu membuat objk hashtable dengan menggunakan dua tipe data yaitu tipe data String dan tipe data integer dengan nama variabel kpop
        Hashtable<String, Integer> kpop = new Hashtable<>();

        //kemudia disini menambahkan data ke dalam hashtable, dengan perintah .put
        kpop.put("NCT", 23);
        kpop.put("Seventeen", 13);
        kpop.put("EXO", 9);
        kpop.put("TXT", 5);
        kpop.put("Treasure", 12);

        //setelah itu menampilkannya
        System.out.println("Nilai NCT: " + kpop.get("NCT"));
        System.out.println("Nilai Seventeen: " + kpop.get("Seventeen"));
        System.out.println("Nilai EXO: " + kpop.get("EXO"));
        System.out.println("Nilai TXT: " + kpop.get("TXT"));
        System.out.println("Nilai Treasure: " + kpop.get("Treasure"));

    }
}
