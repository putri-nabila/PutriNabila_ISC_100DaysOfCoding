package days_of_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day73 {//di day 73 ini saya mengcommit terkait penggunaan BufferedReader untuk membaca input pengguna
    public static void main(String[] args) throws IOException {//penambahan thowrs IOException untuk menangani kemungkinan exception yang dapat terjadi pada bagian input/output.
        //jika tidak ingin menambahkan  throws IOException dan hanya ingin menggunakan public static void main(String[] args). solusinya adalah dengan  menggunakan blok try-catch
        //hal pertama yang dilakukan yaitu membuat objek BufferedReader untuk membaca inputan dari pengguna
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        //kemudian disini adalah meminta pengguna untuk memasukkan nilai yang diinginkan, yakni nilai alas dan tinggi
        System.out.print("Masukkan alas segitiga: ");
        float alas = Float.parseFloat(input.readLine());//parseFloat digunakan untuk mengonversi string yang dibaca menggunakan tipe data float, karena BufferedReader hanya membaca data sebagai string. itulh mengapa harus dikonversi terlebih dahulu
        System.out.print("Masukkan tinggi segitiga: ");
        float tinggi = Float.parseFloat(input.readLine());//begitupun dengan yang ini

        //menghitung luas segitiga dengan rumus (0.5 * alas * tinggi)
        float luas = (float) (0.5 * alas * tinggi);
        System.out.println("Luas: " + luas);//menampilkan hasil perhitungan
    }
}