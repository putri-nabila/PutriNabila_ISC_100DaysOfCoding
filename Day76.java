package days_of_coding;

import java.util.LinkedList;
import java.util.Queue;

public class Day76 {
    public static void main(String[] args) {
        //membuat object bertipe String bernama queue yang di implementasikan di class LinkedList
        Queue<String> queue = new LinkedList<>();
        //program untuk menambahkan elemen2 ke dalam LinkedList
        queue.add("Kun");
        queue.add("Ten");
        queue.add("Winwin");
        queue.add("Lucas");
        queue.add("Xiaojun");
        queue.add("Hendery");
        queue.add("Yangyang");

        //Program untuk menampilkan elemen-elemen yang telah di tambahkan ke dalam likedList
        System.out.println("Member WayV: " + queue);
        System.out.println("--------------------------------------------------------------------");

        // program untuk melihat apakah elemen ada dalam antrian atau tidak
        if (queue.contains("Lucas")) {
            System.out.println("Lucas ditemukan dalam antrian.");
        } else {
            System.out.println("Lucas tidak ditemukan dalam antrian.");
        }
        
        System.out.println("--------------------------------------------------------------------");

        //untuk melihat elemen yang berada pada posisi paling depan kita menggunakan "peek"
        String head = queue.peek();
        System.out.println("Nama member terdepan dalam antrian: " + head);
        System.out.println("--------------------------------------------------------------------");

        //menghapus elemen terdepan
        String removedHead = queue.remove();
        System.out.println("Nama member yang akan dihapus: " + removedHead);
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Nama member setelah menghapus salah satu member: " + queue);
    }
}
