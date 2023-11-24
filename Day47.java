package days_of_coding;

import java.util.ArrayList;

public class Day47 {
    public static void main(String[] args) {
        //membuat ArrayList untuk menyimpan nama anime
        ArrayList<String> anime = new ArrayList<>();

        //menambahkan nama anime ke dalam ArrayList
        anime.add("One Piece");
        anime.add("Kimetsu no Yaiba");
        anime.add("Naruto");
        anime.add("Jujutsu Kaisen");
        anime.add("Haikyu");
        anime.add("Dr. Stone");
        anime.add("Attack On Titan");
        anime.add("Hunter X Hunter");
        anime.add("Bungou Stray Dogs");
        anime.add("Boku no Hero Academia");
        anime.add("Black Clover");
        anime.add("Death Note");
        anime.add("Bleach");
        
        System.out.println(anime);
        System.out.println("==================");
        // untuk menghitung jumlah elemen
        int jumlah = anime.size();
        System.out.println("Jumlah Anime : "+jumlah);
        System.out.println("==================");
        
    }
}
