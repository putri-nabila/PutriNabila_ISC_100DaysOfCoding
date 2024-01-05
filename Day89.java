package days_of_coding;

import java.util.ArrayList;

public class Day89 {//di day 89 disini terkait penggunaan array list untuk list dari beberapa nama buah
    public static void main(String[] args) {
        //membuat program ArrayList buah
        ArrayList<String> buah = new ArrayList<>();//disini ada array list dengan nama buah dan tipe data yakni String

        //disini kita akan menambahkan elemen buah ke dalam ArrayList
        buah.add("Apel");
        buah.add("Anggur");
        buah.add("Alpukat");
        buah.add("Mangga");
        buah.add("Jeruk");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Pisang");
        buah.add("Pir");
        buah.add("Stawberry");
        
        //nah disini adalah mencetak nomor untuk setiap elemen buah menggunakan perulangan
        System.out.println("Nama-Nama Buah : ");
        for (int i = 0; i < buah.size(); i++) {//disini untuk mencetak semua elemen itu menggunakan perulangan 
            System.out.println((i + 1) + ". " + buah.get(i));//penambahan i+1 adalah untuk memberikan nomor urut
        }
        
        //menambahkan pembatas setiap tampilan
        System.out.println("======================================================================");
        
        //kemudian disini adalah perintah untuk menghapus salah satu elemen yakni pada indeks ke 2 pada urutan ketiga, dimana isinya yaitu alpukat
        buah.remove(2);
        
        //kemudian disini untuk mencetak ArrayList setelah menghapus(Alpukat), disini juga menggunakan perulangan
        System.out.println("Daftar nama buah setelah menghapus salah satu indeks:");
        for (int i = 0; i < buah.size(); i++) {
            System.out.println((i + 1) + ". " + buah.get(i));
        }
        
        //menambahkan pembatas setiap tampilan
        System.out.println("======================================================================");
        
        //lalu disini ada penambahan untuk elemen baru ke dalam array list
        buah.add(2, "Durian");//nah seperti ini penulisan jika ingin menambahkan elemen baru
        
        //dan disini untuk mencetak daftar nama-nama buah setelah menambahkan elemen baru
        //disisni juga tetap menggunakan perulangan untuk menampilkannya
        System.out.println("Daftar nama buah setelah menambah elemen baru ");
        for (int i = 0; i < buah.size(); i++) {
            System.out.println((i + 1) + ". " + buah.get(i));
        }
    }
}
