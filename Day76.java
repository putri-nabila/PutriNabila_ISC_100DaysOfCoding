package days_of_coding;

import java.util.LinkedList;
import java.util.Queue;

public class Day76 {//di day 76 saya mengcommit terkait penggunaan queue dengan menghapus dan menampilkannya
    public static void main(String[] args) {
        //hal pertama tentu saja membuat objek bertipe String bernama queue yang di implementasikan di class LinkedList
        Queue<String> queue = new LinkedList<>();
        
        //kemudian membuat program untuk menambahkan elemen2 ke dalam LinkedList
        queue.add("Kun");
        queue.add("Ten");
        queue.add("Winwin");
        queue.add("Lucas");
        queue.add("Xiaojun");
        queue.add("Hendery");
        queue.add("Yangyang");

        //lalu berikut adalah perintah untuk menampilkan elemen-elemen yang telah di tambahkan ke dalam array sebelumnya
        System.out.println("Member WayV: " + queue);
        System.out.println("--------------------------------------------------------------------");

        //setelah itu melihat apakah elemen ada dalam antrian atau tidak
        if (queue.contains("Lucas")) {
            System.out.println("Lucas ditemukan dalam antrian.");
        } else {
            System.out.println("Lucas tidak ditemukan dalam antrian.");
        }
        
        System.out.println("--------------------------------------------------------------------");

        //untuk melihat elemen yang berada pada posisi paling depan kita menggunakan "peek"
        String head = queue.peek();//digunakan untuk melihat elemen yang berada pada posisi paling depan, tanpa harus menghapusnya
        System.out.println("Nama member terdepan dalam antrian: " + head);
        System.out.println("--------------------------------------------------------------------");

        //menghapus elemen terdepan
        String removedHead = queue.remove();//untuk mengapus element paling depan
        System.out.println("Nama member yang akan dihapus: " + removedHead);
        System.out.println("--------------------------------------------------------------------");
        
        //terakhir menampilkan nama-nama member setelah dihapus
        System.out.println("Nama member setelah menghapus salah satu member: " + queue);
    }
}
