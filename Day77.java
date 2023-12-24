package days_of_coding;

public class Day77 {//di day 77 saya mengcommit terkait pencarian penjumlahan elemen pada array 
    public static void main(String[] args) {
        //disini menggunakan array 2 dimensi, 
        //dimana pertama yaitu inisialisasi dan mengisi nilai pada array  dengan nama variavel berupa (array) bertipe data integer
        int[][] array = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        //untuk nilainya sendiri saya menggunakan nilai 1 sampai dengan 9

        //kemudian menampilkan elemen array 2 dimensi diatas
        System.out.println("Nilai pada array 2 dimensi : ");
        for (int[] baris : array) {//menggunakan perulangan for-each
            for (int nilai : baris) {
                System.out.print(nilai + " ");//mencetak nilai
            }
            System.out.println();
        }
        
        System.out.println("==================================================");

        //setelah itu menghitung dan menampilkan jumlah dari elemen array diatas
        int total = 0; //membuat variabel untuk total dengan nilai awalnya 0, nantinya untuk menyimpan total nilainya nanti
        for (int[] baris : array) {//menggunakan perulangan for each
            for (int nilai : baris) {
                total += nilai;//vriabel total akan menyimpan nilai, lalu nilai dalam variabel total akan terus ditambahkan atau dijumlahkan setiap iterasi
            }
        }
        System.out.println("Total nilai pada array : " + total);//terakhir menampilkan hasilnya
    }
}
