package days_of_coding;

public class Day64 {
    public static void main(String[] args) {
        //hal pertama yang dilakuka yaitu deklarasi array, dengan menggunakan dua kurung siku untuk array 2 dimensi
        //dengan tipe data string dan nama variabel hewan
        String[][]hewan = {
            {"Kucing","Koala","Harimau"},
            {"Macan","Beruang","Kelinci"},
            {"Hamster","Lumba-Lumba","Rubah"} 
        };
        //Menampilkan isi array pada indeks ke-[1][2], [0][0], dan [2][1]
        //perintah di atas hanya akan menampilkan hewan tertentu berdasarkan indeks tertentu
        System.out.println(hewan[1][2]);//untuk menampilkan Kelinci
        System.out.println(hewan[0][0]);//untuk menampilkan Kucing
        System.out.println(hewan[2][1]);//untuk menampilkan lumba-lumba
        System.out.println("====================================");
        
        //perintah untuk menampilkan semua isi array 2 dimensi
        System.out.println("Semua isi array : ");
        for (int i = 0; i < hewan.length; i++) {//variabe i digunakan sebagai indeks baris, kemudian memastikan loop berjalan untuk setiap baris array.
            for (int j = 0; j < hewan[i].length; j++) {//variabel j digunakan sebagai indeks kolom, kemudian memastikan loop berjalan untuk setiap elemen dalam baris tertentu.
                System.out.print(hewan[i][j] + " ; ");//mengakses elemen array pada baris i dan kolom j. Tanda (;) digunakan untuk pemisah setiap nilai dalam array
            }
            System.out.println();
        }
    }
}
