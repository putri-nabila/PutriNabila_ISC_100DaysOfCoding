package days_of_coding;

public class Day79 {//di day 79 saya mengcommit tentang array 2 dimensi untuk mengakses baris dan kolom tertenntu
     public static void main(String[] args) {
        //hal pertama yang dilakuka yaitu deklarasi array, dengan menggunakan dua kurung siku untuk array 2 dimensi
        //dengan tipe data string dan nama variabel hewan
        String[][]hewan = {
            {"Kucing","Koala","Harimau"},
            {"Macan","Beruang","Kelinci"},
            {"Hamster","Lumba-Lumba","Rubah"} 
        };
        //disini saya ingin menampilkan isi array pada indeks ke-[1][2], yakni baris 1 dan kolom 2. perhitungan indeks dimulai dari 0
        //perintah di atas hanya akan menampilkan hewan tertentu berdasarkan indeks tertentu
        System.out.println("ELemen pada indeks [1][2] yaitu " + hewan[1][2]);
        System.out.println("====================================");
        
        //kemudian disini untuk menampilkan semua isi array 2 dimensi
        System.out.println("Semua isi array : ");
        for (int i = 0; i < hewan.length; i++) {//variabel i digunakan sebagai indeks baris, kemudian memastikan loop berjalan untuk setiap baris array.
            for (int j = 0; j < hewan[i].length; j++) {//variabel j digunakan sebagai indeks kolom, kemudian memastikan loop berjalan untuk setiap elemen dalam baris tertentu.
                System.out.print(hewan[i][j] + " ; ");//mengakses elemen array pada baris i dan kolom j. Tanda (;) digunakan untuk pemisah setiap nilai dalam array
            }
            System.out.println();
        }
    }
}
