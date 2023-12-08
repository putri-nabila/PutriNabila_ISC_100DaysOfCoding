package days_of_coding;

import java.util.HashSet;

public class Day61 {
    public static void main(String[] args) {
        // Struktur Data HashSet digunakan untuk menyimpan kumpulan item yang setiap
        // Item dalam kumpulan data tersebut bersifat unik (tidak ada yang sama).
        // Deklarasi dan inisialisasi variabel dream
        HashSet<String> dream = new HashSet<String>();
        
        // Menambahkan item ke dalam HashSet menggunakan add.
        dream.add("Mark");        
        dream.add("Renjun");
        dream.add("Jeno");
        dream.add("Haechsn");
        dream.add("Jaemin");
        dream.add("Chenla");
        dream.add("Jisung");
        dream.add("Jaemin");//nama Jaemin hanya satu yang akan terbaca dikarenakan sudah ada data yang sama tersimpan
        // lebih dulu dan semua item di HashSet harus unik.
        
        // Mencetak output / menampilkan nama -  nama buah yang telah ditambahkan
        System.out.println("Nama - Nama member NCT Dream : " + dream);
    }
}
