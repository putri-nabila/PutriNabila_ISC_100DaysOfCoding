package days_of_coding;

import java.util.Scanner;

public class Day65 {//di 65 mengunakan array 2 dimensi untuk daftar pesanan yang dipesan
    public static void main(String[] args) {
        //hal pertama membuat objek Scanner untuk membaca inputan dengan nama variabel sc
        Scanner sc = new Scanner(System.in);

        //kemudian meminta pengguna untuk memasukkan jumlah pesanan dan membacanya sebagai integer
        System.out.print("Jumlah pesanan : ");
        int n = sc.nextInt();
        sc.nextLine(); //membersihkan newline(baris baru) yang tersisa di dalam buffer setelah membaca integer sebelumnya
        
        //mendeklarasikan dan inisialisasi array dua dimensi untuk menyimpan pesanan
        String pesan[][] = new String[n][3];// n adalah jumlah pesanan sebagai baris dan kolommnya ada 3

        //perulangan untuk memasukkan data pesanan
        for (int i = 0; i < n; i++) {
            System.out.println("");
            System.out.println("Data pesanan ke " + (i + 1));//mulai dari peanan ke-1

            //perulangan untuk masing-masing jenis pesanan (Makanan, Minuman, Tambahan)
            for (int j = 0; j < 3; j++) {
                //menampilkan berdasarkan jenis pesanan
                if (j == 0)
                    System.out.print("Makanan  :");//masukkan makanana yang ingin dipesan
                else if (j == 1)
                    System.out.print("Minuman  : ");//masukkan minuman yang ingin dipesan
                else
                    System.out.print("Tambahan : ");//masukka tambahan yang ingin dipesan

                //perintah untuk membaca input dari pengguna dan menyimpannya ke dalam array 2 dimensi
                pesan[i][j] = sc.nextLine();
            }
        }

        //menampilkan data pesanan yang dimasukkan
        System.out.println("Data pesanan yang dimasukkan ");
        System.out.println("-----------------------------");
        System.out.println("Makanan \t  Minuman \t  Tambahan \t");//penambahan \t digunakan agar lebih tertata rapi

        //perulangan untuk menampilkan data pesanan
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                //mnampilkan nilai dari array pesan, yang nantinya akan berisi semua pesanan dalam bentuk array 2 dimensi
                System.out.print(pesan[i][j] + "\t\t");
            }
            System.out.println(); //baris baru setelah menampilkan satu baris data pesanan
        }
    }
}


