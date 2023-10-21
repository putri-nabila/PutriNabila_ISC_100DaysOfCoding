package days_of_coding;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        System.out.println("PERULANGAN SEDERHANA");//berikut adalah perulangan sederhana menggunakan for, dimana nanti hasilnya akan mengasilkan kalimat yang kita inginkan
        //serta jumlah kalimat yang kita inginkan
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan berapa kali kalimat ingin ditampilkan : ");
        int jumlah = sc.nextInt();
        for (int i = 0; i < jumlah; i++) {//for untuk mencetak kalimat sebanyak jumlah yang dimasukkan oleh pengguna, dimana dimulai dari 0 hingga jumla yang di inputkan
            //i++ bermaksud jika setiap kali sudah dieksekusi maka akan bertambah satu
            System.out.println("Shinzo Wo Sasageyo!");
        }
    }
}
