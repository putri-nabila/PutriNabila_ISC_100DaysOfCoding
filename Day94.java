package days_of_coding;

//di day 94 saya mencommit terkait penggunaan kelas pada array list

import java.util.*;
//hal pertama yang dilakukan yaitu mendefenisikan kelas Anime dengan satu atrinbut yaitu anime
class Anime{
    String anime;//disini menggunakan tipe data string
    
    //dibagian ini yaitu konstruktur kelas Anime yang mana untuk menginisialisasikan atribut anime saat objek dibuat
    Anime(String anime){
        this.anime = anime;
    }
}

public class Day94 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//disini membuat objek Scanner untuk menerima inputan dari pengguna
        
        //membuat objek array list yang nantinya akan menyimpan objek Anime, dengan nama variabel yaitu nama_anime
        ArrayList <Anime> nama_anime= new ArrayList<>();
        
        //kemudian ini adalah untuk perintah dalam memasukkan inputan
        System.out.print("Masukkan index : ");
        int index = scan.nextInt();//ini digunkan untuk menyimpan atau membaca jumlah anime yang sebelumnya sudah dimasukkan
        scan.nextLine(); // Konsumsi newline setelah membaca integer
        String a;//mendeklarasikan vaariabel a
        
        System.out.println("==================================================");//menambahkan pembatas agar lebih rapi
        
        //nah disini ada loop untuk mengisi array list dengan objek anime sesuai dengan jumlah yang dimasukkan oleh pengguna
        for (int i = 0; i < index; i++) {
            System.out.print("Masukkan nama anime : ");
            a = scan.nextLine(); // Menggunakan nextLine() agar dapat membaca input dengan spasi
            nama_anime.add(new Anime(a));//ini untuk menambahkan objek baru kedalam array list
        }
        
        System.out.println("==================================================");//menambahkan pembatas agar lebih rapi
        
        //kemudian disini adalah loop untuk menampilkan daftar anime yang sudah ditambahkan
        System.out.println("Daftar nama anime");
        for (int i = 0; i < nama_anime.size(); i++) {
            System.out.println(nama_anime.get(i).anime);
        }
    }
}
