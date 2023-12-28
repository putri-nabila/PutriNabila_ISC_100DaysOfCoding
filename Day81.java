package days_of_coding;

import java.util.Arrays;

public class Day81 {//di day 81 saya mengcommit terkait array, dimana menyalin nilai array pertama untuk dimasukkan dalam array yang kedua
    public static void main(String[] args) {
        //hal pertama tentu saja mendeklarasikan array pertama sekaligus inisialisasi nilainya
        int[] array_pertama = {29, 9, 3, 13, 8, 0, 10, 5, 22};

        //kemudian juga mendeklarasikan array kedua dnegan ukuran yang sama dengan array pertama tadi
        int[] array_kedua = new int[array_pertama.length];

        //kemudian disini ada perintah untuk menyalin elemen array pertama ke array kedua, dengan menggunakan perulangan/loop
        for (int i = 0; i < array_pertama.length; i++) {
            array_kedua[i] = array_pertama[i];
        }

        //setelah itu disini menampilkan isi array, baik array pertama maupun array  kedua.
        System.out.println("array pertama: " + Arrays.toString(array_pertama));//menampilkan isi array pertama menggunakan Array.toString
        //menampilkan isi array setelah disalin dari array pertama
        System.out.println("array kedua setelah disalin dari array pertama: " + Arrays.toString(array_kedua));//begitupun dengan array kedua
    
    }
}
