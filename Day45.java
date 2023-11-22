package days_of_coding;

import java.util.ArrayList;

public class Day45 {
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
    }
}
