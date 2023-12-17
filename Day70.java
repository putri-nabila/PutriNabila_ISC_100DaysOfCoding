package days_of_coding;

import java.util.HashMap;

public class Day70 {//di day 70 saya mencommit terkait HashMap. Dimana Hashmap adalah struktur data yang berisi sekumpulan nilai (value) dan kunci (key)

    public static void main(String[] args) {
        HashMap <String, Integer> nama_line = new HashMap <>();//disini kita mendeklarasikan variabel nama_line ke dalam HashMap. 
        //maksud dari nama_line itu berupa nama member dan lin yang artinya tahun lahir
        
        //kemudian disini kita menambahkan key dan value (nama,line) ke dalam HashMap
        nama_line.put("Mark", 1999);
        nama_line.put("Renjun", 2000);
        nama_line.put("Jeno", 2000);
        nama_line.put("Haechan", 2000);
        nama_line.put("Jaemin", 2000);
        nama_line.put("Chenle", 2001);
        nama_line.put("Jisung", 2002);

        //terakhir menamplkan semua data yang ada di dalam HashMap
        System.out.println("Daftar Nama Dan Angkatan : ");
        for (String nama : nama_line.keySet()){//loop for-each yang digunakan untuk mengiterasi melalui setiap elemen (nama) dalam kumpulan kunci (keySet()) dari nama_line HashMap.
            //dan nama adalahvariabel iterasi yang akan mewakili setiap nama dalam loop.
            int line = nama_line.get(nama);//kemudian menggunakan nama sebagai kunci, kita mendapatkan nilai (line) dari HashMap nama_line dengan menggunakan metode get(). Nilai ini disimpan dalam variabel line.
            System.out.println(nama + ", line " + line);//nama dicetak terlebih dahulu, diikuti oleh tanda koma dan spasi, kemudian teks "line ", dan akhirnya nilai line.
        }
    }
}

