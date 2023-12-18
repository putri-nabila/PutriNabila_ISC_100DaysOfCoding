package days_of_coding;

import java.util.Stack;

public class Day71 {//di day 71 saya mengcommit tentang stack.
    public static void main(String[] args) {
        //Stack adalah struktur data ysng mengimplementasikan tumpukan terakhir masuk, keluar pertama
        
        //hal pertama yang dilakukan adalah mendeklarasikan variabel wayv ke dalam Stack dengan tipe data String
        Stack <String> wayv = new Stack<>();
        
        //menambahkan daftar nama member kedalam stack dengan perintah wayv.push()
        wayv.push("Kun");
        wayv.push("Ten");
        wayv.push("Winwin");
        wayv.push("Lucas");
        wayv.push("Xiaojun");
        wayv.push("Hendery");
        wayv.push("Yangyang");
        
        //kemudian disini kita menampilkan namaKawan menggunakan push
        System.out.println("Nama Kawan : " + wayv);   
    }
}
