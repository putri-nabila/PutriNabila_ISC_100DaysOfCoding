package days_of_coding;

public class Day90 {//di daya 90 saya mencommit terkait array, dimana ada suatu array satu dimensi dengan beberapa nilai dan kita ingin mencari suatu target/nilai array tertentu
    public static void main(String[] args) {
        //hal pertama yaitu mendeklarasikan array dengan tipe data integer dan nama variabel data. disini ada 5 isi dalam array
        int[] data = {13, 8, 10, 5, 29};
        int target = 13;

        //kemudian disini melakukan pencarian elemen dengan perulangan for yang dalamnya ada percabangan
        int index = -1;//disini membuat variabek indeks dengan nilai awal -1, digunakan untuk menyimpan indeks ke berapa target di temukan
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                index = i;
                break;
            }
        }

        //dan disini untuk menampilkan hasil pencarian menggunakan percabangan
        if (index != -1) {//jika indeks tidak sama dengan -1 maka target ditemukan
            System.out.println("Angka " + target + " ditemukan pada index " + index);
        } else {//sebaliknya jika target sama dengan -1 maka target tidak ditemukan 
            System.out.println("Angka " + target + " tidak ditemukan dalam array");
        }
    }
}
