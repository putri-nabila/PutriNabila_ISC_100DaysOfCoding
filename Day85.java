package days_of_coding;

public class Day85 {//di day 85 saya mencommit terkait menghitung rata-rata nilai siswa
    public static void main(String[] args) {
        //hal pertama itu mendeklarasikan dan menginisialisasi nilai siswa
        int [] nilai = {90, 85, 80, 90, 75, 70, 95, 83, 50, 92};
        int jumlah = nilai.length;//mengitung ada berapa nilai dari siswa tersebut
        int total = 0;//membuat variabel total dengan nilai awal 0
        
        //disini untuk menampilkan semua nilai siswa diatas
        System.out.print("Nilai siswa              : ");
        //untuk menghitung berapa total dari jumlah nilai dari siswa menggunakan perulangan
        for (int i = 0; i < jumlah; i++) {
            System.out.print(nilai[i] + " ");
            total += nilai[i];
        }
        
        //menampilkan hasil
        System.out.println();
        double rata  = total / jumlah;//rumus rata-rata yaitu hasil bagi dari total dengan jumlah ada berapa nilai siswa
        System.out.println("Jumlah nilai             : " + jumlah);//menampikan ada berapa nilai siswa diatas
        System.out.println("Total nilai              : " + total);//menampilkan total penjumlahan nilai
        System.out.println("Rata rata siswa tersebut : " + rata);//menampilkan rata rata nilai siswa tersebut
    }
}
