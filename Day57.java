package days_of_coding;

import java.util.LinkedList; //mengimpor kelas LinkedList dari paket java.util

public class Day57 { //di day 55 saya menngcommit codingan tentang LinkedList dengan menambahkan perintah size() dari program sebelumnya
    //dimana LinkedList adalah salah satu struktur data dalam pemrograman yang digunakan untuk menyimpan dan mengorganisir data
    public static void main(String[] args) {
        //yang pertama yang saya lakukan yaitu, membuat objek LinkedList yang bertipe data String dengan nama variabel seventeen
        LinkedList<String> seventeen = new LinkedList<String>();

        //setelah itu menambahkan nama-nama member NCT 2020 ke dalam LinkedList dengan perintah
        //seventeen.add("nama member"), seventeen.add(indeks, "nama member"), seventeen.addFirst("nama member"), seventeen.addLast("nama member")
        seventeen.add("Jeonghan");
        //seventeen.add(indeks, "nama member") dengan menggunakan indeks ke-8 dihitungnya dimulai indeks 0 paling atas
        seventeen.add(1, "Joshua");
        seventeen.add("Jun");
        seventeen.add("Hoshi");
        seventeen.add("Wonwoo");
        seventeen.add("Woozi");
        seventeen.add("Mingyu");
        seventeen.add("Dk");
        seventeen.add("The8");
        seventeen.add("Seungkwan");
        //seventeen.add(indeks, "nama member") dengan menggunakan indeks ke-8 dihitungnya dimulai dari bawah perintah seventeen.add(1, "Joshua"); dimana dimulai dari indeks 0
        seventeen.add(9,"Vernon");
        //seventeen.addLast("nama member")
        seventeen.addLast("Dino");
        //seventeen.addFirst("nama member")
        seventeen.addFirst("S.Coups");
        
        //menampilkan list nama member
        System.out.println("Nama-nama member Seventeen : ");
        System.out.println(seventeen);
        
        //menambahkan perintah size(), dimana perintah ini digunakan untuk mengetahui jumlah elemen dalam linkedList
        System.out.println("Jumlah elemen : " + seventeen.size());
    }
}
