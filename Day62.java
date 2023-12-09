package days_of_coding;

public class Day62 {
    public static void main(String[] args) {
        //mendeklarasikan dan menginisialisasi dua array dengan jumlah indeks yang sama/panjang array yang sama
        int[] satu = {2, 9, 3, 1, 0};//arrray satu
        int[] dua = {5, 2, 10, 13, 8};//array dua
        
        //kemudian memeriksa apakah panjang(lenth) dari kedua array diatas sama
        if (satu.length != dua.length) {//jika panjang array satu dengan dua tidak sama
            //maka akan menampilkan pesan kesalahan(Penjumlahan tidak dapat dilakukan, karena panjang array harus sama!)
            System.out.println("Penjumlahan tidak dapat dilakukan, karena panjang array harus sama!");
            return;
        }
        
        //deklarasi variabel hasil untuk menyimpan hasil penjumlahan nantinya dengan panjang yang sama dengan array satu dan dua
        int[] hasil = new int[satu.length];

        //operasi penjumlahan mengguanakan perulangan
        for (int i = 0; i < satu.length; i++) {//melakukan penjumlahan setiap elemen pada posisi yang sama dari array satu dan dua
            hasil [i] = satu[i] * dua[i];//kemudian menyimpan hasilnya dalam array hasil diatas
        }

        //menampilkan hasil penjumlahan dan kurung siku pembuka menggunakan loop for
        System.out.print("Hasil dari penjumlahan array: [");
        for (int i = 0; i < hasil.length; i++){//
            System.out.print(hasil[i]);//mencetak nilai elemen ke-i dari array hasil
            if (i < hasil.length - 1) {
                System.out.print(" ");//menambahkan spasi setelah elemen kecuali untuk elemen terakhir
            }
        }
        System.out.print("]");//mencetak kurung siku penutup ']'
    }
}
