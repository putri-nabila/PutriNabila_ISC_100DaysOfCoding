package days_of_coding;

public class Day2 {
    //Pada java ada 2 jenis tipe data yang ada di dalamnya, yaitu tipe data primitf dan tipe data non primitif
    //Tipe data primitif adalah tipe data sederhana, dimana tipe ini memiliki nilai tunggal yang langsung dapat digunakan.
    //Tipe data non-primitf adalah tipe data yang merupakan objek yang memiliki metode tambahan untuk berinteraksi dengannya.
    public static void main(String[] args) {
        //Untuk perbedaan 2 tipe data ini ada pada penulisan namanya, dimana untuk jenis tipe data primitif itu menggunakan huruf kecil.
        //Sedangkan penulisan tipe data non-primitif itu penulisannya menggunakan huruf kapital di awal kata
        //Berikut contohnya:
        //Tipe Data Primitif: byte, short, int, long, float, double, chart, boolean
        //Tipe Data Non-Primitif: Byte, Short, Int, Long, Float, Double, Cart, Boolean
        //String sendiri merupakan tipe data non-primitif
        
        //Tipe Data Primitif
        System.out.println("Tipe Data Primitif");
        //beberapa jenis tipe data primitif
        int umur = 20;
        float bb = 49.8f;
        int tb = 160;
        boolean status = true;
        
        //menampilkan tipe data primitif
        System.out.println("Umur         :" + umur + " tahun");
        System.out.println("Berat Badan  :" + bb + " kg");
        System.out.println("Tinggi Badan :" + tb + " cm");
        System.out.println("Termasuk mahasiswa UNSULBAR");
        
        System.out.println("=================================");
        //Tipe Data Non-Primitif (mengubah tipe data diatas menjadi sebuah objek
        System.out.println("Tipe Data Non-Primitif");
        String nama = "Putri Nabila";
        Integer umurr = 20;
        Float bbnp = 49.8F;
        Integer tbnp = 160;
        Boolean statuss = true;
        
        //menampilkan tipe data non-primitif
        System.out.println("Nama Lengkap :" + nama);
        System.out.println("Umur         :" + umur + " tahun");
        System.out.println("Berat Badan  :" + bb + " kg");
        System.out.println("Tinggi Badan :" + tb + " cm");
        System.out.println("Termasuk mahasiswa UNSULBAR");
    }
}
