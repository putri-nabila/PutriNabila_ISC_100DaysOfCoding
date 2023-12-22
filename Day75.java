package days_of_coding;

import java.util.Scanner;

public class Day75 {//di day 75 ini saya mengcommit tentang mencari nilai pada array di tipe data string 
    public static void main(String[] args) {
        //hal pertama tentu saja membuat objek scanner dengan nama sc, karena disini saya menggunakan inputan untuk memasukkan anime apa yang dicari
        Scanner sc = new Scanner(System.in);
        
        //kemudian inisialisasi array string anime 
        String[] anime = {"One Piece", "Kimetsu no Yaiba", "Naruto", "Attack On Titan", "Hunter X Hunter", "Black Clover", "Bungou Stray Dogs", "Death Note"};
        
        //setalah itu menampilkan bebrapa anime action yang sebelumnya sudah dimasukkan dalam array diatas menggunakan perulangan for
        System.out.println("----------Anime Action----------");
        for (int i = 0; i < anime.length; i++) {
            System.out.println((i + 1) + ". " + anime[i]);
        }
        
        //disini pengguna diminta untuk memasukkan anime acrtion apa yang ingin dicari
        System.out.println("--------------------------------");
        System.out.print("Cari Anime : ");
        String cari = sc.nextLine();
        
        //disini membuat variabel deteksi untuk mendeteksi apakah anime yang dicari ditemukan atau tidak
        int deteksi = 0;//nilai awal yang digunakan yaitu 0
        
        //kemudian penggunaan perulangan for untuk mengiterasi melalui setiap elemen dalam array anime
        for (int i = 0; i < anime.length; i++) {
            //memeriksa apakah input pengguna cocok dengan elemen array (anime) pada indeks ke-i
            if (cari.equalsIgnoreCase(anime[i])){//equalsIgnoreCase digunakan untuk membandingkan string tanpa memperhatikan huruf kecil atau besar
                //kemudian jika cocok, akan menampilkan output bahwa ppenggguna menemukan anime yang dicari
                System.out.println("Anda mencari anime action, yakni " + anime[i]);
                deteksi++;//kemudian tambahkan nilai deteksi karena anime tersebut ditemukan
            }
        }
        
        //nah disini ada percabangan jika anime tidak ditemukan, akan menampilkan pesan (Anime tidak ditemukan !)
        if (deteksi == 0){//data tidak ditemukan itu artinya deteksi tetap pada nilai awal yakni 0
            System.out.println("Anime tidak ditemukan !");
        }
    }
}
