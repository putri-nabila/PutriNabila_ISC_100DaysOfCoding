package days_of_coding;

//di day 95 saya mencommit terkait penggunaan kelas pada linked list

import java.util.LinkedList;
import java.util.Scanner;

class Mahasiswa {
    //hal pertama yang dilakukan yaitu mendefenisikan kelas Anime dengan dua atrinbut yaitu Mahasiswa
    String nama;//disini menggunakan tipe data string
    int usia;//dan ini menggunakan tipe data integer

    //dibagian ini yaitu konstruktur kelas Anime yang mana untuk menginisialisasikan atribut saat objek dibuat
    public Mahasiswa(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
}

public class Day95 {
    public static void main(String[] args) {
         //membuat objek array list yang nantinya akan menyimpan objek Anime, dengan nama variabel yaitu daftar_mahasiswa
        LinkedList<Mahasiswa> daftar_mahasiswa = new LinkedList<>();
        
        Scanner scanner = new Scanner(System.in);//disini membuat objek Scanner untuk menerima inputan dari pengguna

        //menambahkan nilai pada objek berdasarkan atribut
        daftar_mahasiswa.add(new Mahasiswa("Nana", 23));
        daftar_mahasiswa.add(new Mahasiswa("Dimas", 21));
        daftar_mahasiswa.add(new Mahasiswa("Nabila", 20));

        //disini untuk menampilkan data mahasiswa
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftar_mahasiswa) {
            System.out.println("Nama: " + mahasiswa.nama + ", Usia: " + mahasiswa.usia);
        }

        //kemudian ini adalah untuk perintah dalam memasukkan inputan
        System.out.print("\nMasukkan nama baru: ");
        String nama_baru = scanner.nextLine();//ini digunkan untuk menyimpan atau membaca nama mahasiswa baru yang sebelumnya sudah dimasukkan
        System.out.print("Masukkan usia baru: ");
        int usia_baru = scanner.nextInt();//ini digunkan untuk menyimpan atau membaca usia mahasiswa baru yang sebelumnya sudah dimasukkan

        //kemudian mmbuat objek Mahasiswa baru dengan menggunakan konstruktor
        Mahasiswa mahasiswa_baru = new Mahasiswa(nama_baru, usia_baru);
        daftar_mahasiswa.add(mahasiswa_baru);//dan disini untuk menambahkan objek Mahasiswa baru ke dalam daftar_mahasiswa

        //dan terakhit menampilkan daftar mahasiswa setelah penambahan
        System.out.println("\nDaftar Mahasiswa setelah penambahan:");
        for (Mahasiswa mahasiswa : daftar_mahasiswa) {
            System.out.println("Nama: " + mahasiswa.nama + ", Usia: " + mahasiswa.usia);
        }
    }
}
