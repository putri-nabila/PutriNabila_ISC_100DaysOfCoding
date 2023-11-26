package days_of_coding;

import java.util.ArrayList;

public class Day49 {
    public static void main(String[] args) {
        //membuat ArrayList untuk menyimpan nama anime
        ArrayList<String> list_anime = new ArrayList<>();

        //menambahkan nama anime ke dalam ArrayList
        list_anime.add("One Piece");
        list_anime.add("Kimetsu no Yaiba");
        list_anime.add("Naruto");
        list_anime.add("Jujutsu Kaisen");
        list_anime.add("Haikyu");
        list_anime.add("Dr. Stone");
        list_anime.add("Attack On Titan");
        list_anime.add("Hunter X Hunter");
        list_anime.add("Bungou Stray Dogs");
        list_anime.add("Boku no Hero Academia");
        list_anime.add("Black Clover");
        list_anime.add("Death Note");
        list_anime.add("Bleach");
        
        //menampilkan nama-nama anime dengan nomor urut
        System.out.println("Daftar Anime:");
        for (int i = 0; i < list_anime.size(); i++) {
            System.out.println((i + 1) + ". " + list_anime.get(i));
        }
        
        System.out.println("=============================================");
        //menghapus salah satu indeks dalam list
        list_anime.remove(8);//contohnya menghapus indekx ke-8
        list_anime.remove(11);//contohnya menghapus indekx ke-12
        //menampilkan list 
        System.out.println("Daftar anime setelah menghapus dua indeks:");
        for (int i = 0; i < list_anime.size(); i++) {
            System.out.println((i + 1) + ". " + list_anime.get(i));
        }
        
        System.out.println("=============================================");
        //mengganti nilai indeks
        list_anime.set(8, "Spy X Family");//mengganti indeks ke-8 dengan Spy X Family
        System.out.println("Daftar anime setelah mengganti indeks ke-8:");
        for (int i = 0; i < list_anime.size(); i++) {
            System.out.println((i + 1) + ". " + list_anime.get(i));
        }
    }
}
