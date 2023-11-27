package days_of_coding;

import java.util.LinkedList; //mengimpor kelas LinkedList dari paket java.util

public class Day50 { //di day 50 saya menngcommit codingan tentang LinkedList
    //dimana LinkedList adalah salah satu struktur data dalam pemrograman yang digunakan untuk menyimpan dan mengorganisir data
    public static void main(String[] args) {
        //yang pertama yang saya lakukan yaitu, membuat objek LinkedList yang bertipe data String dengan nama variabel nct2020
        LinkedList<String> nct2020 = new LinkedList<String>(); 

        //setelah itu menambahkan nama-nama member NCT 2020 ke dalam LinkedList dengan perintah nct2020.add("nama member")
        nct2020.add("Taeil");
        nct2020.add("Johnny");
        nct2020.add("Taeyong");
        nct2020.add("Yuta");
        nct2020.add("Kun");
        nct2020.add("Doyoung");
        nct2020.add("Ten");
        nct2020.add("Jaehyun");
        nct2020.add("Winwin");
        nct2020.add("Jungwoo");
        nct2020.add("Lucas");
        nct2020.add("Mark");
        nct2020.add("Xiaojun");
        nct2020.add("Hendery");
        nct2020.add("Renjun");
        nct2020.add("Jeno");
        nct2020.add("Haechan");
        nct2020.add("Jaemin");
        nct2020.add("Yangyang");
        nct2020.add("Shotaro");
        nct2020.add("Sunchan");
        nct2020.add("Chenle");
        nct2020.add("Jisung");
        
        //kemudian menampilkan nama-nama member NCT 2020 menggunakan for
        System.out.println("Nama-Nama Member NCT 2020 : ");//mencetak Nama-Nama Member NCT 2020 : 
        for (int i = 0; i < nct2020.size(); i++) {//i dimulai dari indeks 0 hingga indeks nct2020.size()
            System.out.println((i + 1) + ". " + nct2020.get(i));
            //kemudian penjelasan soal code diatas itu:
            //(i+1) digunakan untuk menampilkan nomor urut, karena indeksnya dimulai dari 0 dan saya ingin nomor urut dimulai dari 1 makanya +1
            //menambahkan titk dan spasi (". ") agar memisahkan nomor urut dengan nama member
            //nct.get(i) digunakan untuk mengakses dan menampilkan element dari LinkedList
        }
    }
}
