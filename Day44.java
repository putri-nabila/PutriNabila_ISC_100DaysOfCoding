package days_of_coding;

public class Day44 {
    public static void main(String[] args) {
        //mendeklarasikan dan menginisialisasi array
        String[] anime = {"One Piece", "Kimetsu no Yaiba", "Naruto", "Jujutsu Kaisen", "Haikyu", "Dr. Stone", "Attack On Titan", 
            "Hunter X Hunter", "Bungou Stray Dogs", "Boku no Hero Academia", "Black Clover", "Death Note", "Bleach"};//membuat  list anime
        
        //menampilkan list anime
        System.out.println("Anime: ");
        for (int i = 0; i < anime.length; i++) {
            System.out.println((i + 1) + ". " + anime[i]);
        }
    }
}
