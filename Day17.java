package days_of_coding;

import java.util.Scanner;

public class Day17 {//menentukan jumlah bunga yang harus dibayarkan berdasarkan jangka waktu pembayaran
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // mengambil input jumlah pinjaman
        System.out.print("Masukkan jumlah pinjaman            : Rp ");
        double pinjaman = sc.nextDouble();

        // mengambil input jangka waktu (dalam bulan)
        System.out.print("Masukkan jangka waktu (dalam bulan) : ");
        int waktu = sc.nextInt();

        // memeriksa suku bunga berdasarkan jangka waktu
        if (waktu >= 1 && waktu <= 12) {
            double bunga = 0.02; // suku bunga 2% untuk 1-12 bulan
            double jumlah_bunga = pinjaman * bunga;// menghitung jumlah bunga
            System.out.println("Jumlah bunga yang harus dibayarkan : Rp " + jumlah_bunga);// menampilkan hasil jumlah bunga
        } else if (waktu >= 13 && waktu <= 24) {
            double bunga = 0.05; // suku bunga 5% untuk 13-24 bulan
            double jumlah_bunga = pinjaman * bunga;// menghitung jumlah bunga
            System.out.println("Jumlah bunga yang harus dibayarkan : Rp " + jumlah_bunga);// menampilkan hasil jumlah bunga
        } else if (waktu >= 25 && waktu <= 36) {
            double bunga = 0.08; // suku bunga 8% untuk 25-36 bulan
            double jumlah_bunga = pinjaman * bunga;// menghitung jumlah bunga
            System.out.println("Jumlah bunga yang harus dibayarkan : Rp " + jumlah_bunga);// menampilkan hasil jumlah bunga
        } else {
            double bunga = 0.13; // suku bunga 13% untuk lainnya
            double jumlah_bunga = pinjaman * bunga;// menghitung jumlah bunga
            System.out.println("Jumlah bunga yang harus dibayarkan : Rp " + jumlah_bunga);// menampilkan hasil jumlah bunga
        }
    }
}
