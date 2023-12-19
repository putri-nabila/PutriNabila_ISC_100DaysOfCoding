package days_of_coding;

import java.util.Enumeration;
import java.util.Vector;

public class Day72 {//di day 72 saya mengcommit terkait membuuat list nama menggunakan enum dan vector.
    public static void main(String[] args) {
        //hal pertama yang kita lakukan yakni mendeklarasikan variabel exo dan nama_member
        Enumeration exo;//mendeklarasikan variabel exo dengan tipe Enumeration, dimana nantinya digunakan untuk mengakses elemen-elemen Vector.
        Vector nama_member = new Vector();//mendeklarasikan Vector dengan nama variabel (nama_member), dimana nantinya akan digunakan untuk menyimpan nama-nama member.
        

        //menambahkan nama nama member kedalam vektor
        nama_member.add("Suho");
        nama_member.add("Xiumin");
        nama_member.add("Bakhyun");
        nama_member.add("Lay");
        nama_member.add("Chen");
        nama_member.add("Chanyoel");
        nama_member.add("Kyungsoo");
        nama_member.add("Kai");
        nama_member.add("Sehun");
        
        //mendapatkan enumeration daro vektor menggunakan metode elements()
        exo = nama_member.elements();
        
        System.out.println("Member EXO :");
        //untuk menampilkan semua elemen yang ada saya menggunakan while
        while (exo.hasMoreElements()){//menampilkan semua elemen menggunakan enumeration
        //hasMoreElements() berfungsi untuk mengembalikan nilai true dan ketika semua elemen terbaca maka dia akan false.
            System.out.println(exo.nextElement());//menampilkan elemen berikutnya dari enumeration.
        //Kemudian untuk nextElement() dia mengembalikan objek

        }        
    }
}