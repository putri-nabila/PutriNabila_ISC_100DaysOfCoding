package days_of_coding;

import java.util.HashMap;

public class Day93 {//di day 93 saya mencommit terkait hashmap untuk melihat list hari 
    public static void main(String[] args) {
        //hal pertama yaitu membuat objek hashmap dengan tipe data integer dan string, dimana yang merupakan tipe data integer yaitu berupa nomor urutnya
        //dan yang merupakan tipe data string yaitu nama nama harinya
        //nama variabel yang saya gunakan yaitu hari
        HashMap<Integer, String> hari = new HashMap<Integer,String>();
        
        //hal selanjutnya yang dilakukan yaitu mengisi nilai ke objek hari
        hari.put(1, "Senin");
        hari.put(2, "Selasa");
        hari.put(3, "Rabu");
        hari.put(4, "Kamis");
        hari.put(5, "Jum'at");
        hari.put(6, "Sabtu");
        hari.put(7, "Minggu");
        
        //nah disini akan ditampilkan semua hari
        System.out.println("Hari : " + hari);
        
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        
        //kemudian disini saya ingin mencoba mengubah hari menggu menjadi hari ahad
        hari.put(7, "Ahad");//dengan menggunakan perintah .put yakni dengan menuliskan 
        
        //kemudian disini menampilkam isi setelah melakukan perubahan pada salah satu elemen
        System.out.println("Hari setelah ada perubahan salah satu elemen: " + hari);
        
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        
        //kemudian disini jika ingin menampilkan salah satu hari saja
        System.out.println("Hari ketiga: " + hari.get(3));
        
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        
        //disini untuk menghapus salah satu hari\
        hari.remove(7);//disini akan menghapus hari ketujuh
        System.out.println("Hari setelah menghapus hari ke tujuh : " + hari);
        
        System.out.println("--------------------------------------------------------");
        
        //kemudian disini jika ingin menghapus semua hari
        hari.clear();
        System.out.println("Tampilan setelah menghapus semua hari : " + hari);
    }
}
