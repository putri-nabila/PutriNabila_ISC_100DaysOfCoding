package days_of_coding;
//untuk day 97 saya mencommit terkait penggunaan kelas pada linked list untuk menentukan list data pribadi yang berisi nama, umur, dan alamt
import java.util.LinkedList;
import java.util.Scanner;

class Biodata {
    //hal pertama yang dilakukan yaitu mendefenisikan kelas Mahasiswa dengan tiga atrinbut yaitu nama, umur dan alamat
    public String nama, alamat;//untuk tipe data pada nama dan alamat itu menggunakan
    public int umur;//sedangkan pada umur menggunakan tipe data integer
    //dibagian ini yaitu konstruktur kelas Biodata yang mana untuk menginisialisasikan atribut saat objek dibuat
    public Biodata (String nama, String alamat, int umur){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    public static String get_nama(String nama) {
        return nama;
    }
    public static int get_umur(int umur) {
        return umur;
    } public static String get_alamat(String alamat) {
        return alamat;
    }  
}
public class Day97 {
    public static void main(String[] args) {
        //disini membuat objek Scanner dengan nama variabel input
        Scanner input = new Scanner(System.in);
        
        //membuat objek linked list dengan nama variabel data_diri, sesuai dengan kelas Biodata diatas
        LinkedList <Biodata> data_diri = new LinkedList<>();
        
        String nama, alamat;//disini mendeklarasikan variabel nama dan alamat menggunakan tipe data String
        int umur;//dan untuk deklarasi variabel umur menggunakan tipe data integer
        
        //disini membuat inputan untuk semua variabel, mulai dari nama, umur dan alamat
        System.out.print("Masukkan nama : ");
        nama = input.next();
        System.out.print("Masukkan umur : ");
        umur = input.nextInt();
        System.out.print("Masukkan alamat : ");
        alamat = input.next();
        data_diri.add(new Biodata(nama, alamat, umur));
        
        System.out.println("===========================================");
        
        //terakhir menampilkan semua nama, umur dan alamat yang sudah di inputkan
        System.out.println("List Data Pribadi");
        for (int i = 0; i < data_diri.size(); i++) {
            System.out.println("Nama  : " + data_diri.get(i).nama);
            System.out.println("Umur   : " + data_diri.get(i).umur + " tahun");
            System.out.println("Alamat   : " + data_diri.get(i).alamat);
        }
    }
}
