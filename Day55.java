package days_of_coding;

import java.util.LinkedList; //mengimpor kelas LinkedList dari paket java.util

public class Day55 { //di day 55 saya menngcommit codingan tentang LinkedList dengan menambahkan perintah remove(index), removeFirst( ), removeLast( )
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
        
        
        //kemudian menampilkan nama-nama member Seventeen menggunakan for
        System.out.println("Sebelum ada perintah penghapusan : ");
        System.out.println(seventeen);
        
        System.out.println("=================================================================================================================");
        
        //membuat lagi perintah remove
        seventeen.remove(6);//perintah seventeen.remove(6)akan menghapus element dengan indeks ke 6 yakni Woozi
        //perintah seventeen.remove(9) akan menghapus element dengan indeks ke 9 yakni Vernon yang awalnya berada di indeks 10,
        //tetapi berubah menjadi indeks 9 karena sebelumnya sudah menghapus salah satu element diatasnya
        seventeen.remove(9);
        seventeen.removeFirst();//perintah seventeen.removeFirst() akan menghapus element dari indeks pertama yakni S.Coups
        seventeen.removeLast();//perintah seventeen.removeLast() akan menghapus element dari indeks terakhir yakni DIno
        
        //menampilkan hasil setelah dihapus beberapa element di dalamnya
        System.out.println("Setelah ada perintah penghapusan :");
        System.out.println(seventeen);
    }
}
