package days_of_coding;

public class Day74 {
    public static void main(String[] args) {//di day 74 ini saya mengcommit terkait penentuan nilai minimal dan maksimal dalam array 2 dimensi
        //yang pertama yaitu inisialisai array 2 dimensi dengan tipe data integer, kemudian mengisi nilainya
        int[][] data = {{29,9,2003},{13,8,2000},{10,5,2022}};
        
        //kemudian inisialisasi nilai awal untuk minimal dan maksimum
        int min = 10;//untuk nilai awalnya itu terserah yang penting tidak termasuk dari nilai pada array 2 dimensi diatas
        int max = 0;//begitupun dengan yang ini, asalkan tidak sama-sama nol
        
        //kemudian perulangan untuk array 2 dimensi
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                //kemudian setiap nilai dalam array doatas dibandingkan dengan nilai minimal dan maksimal yang saat ini dipegang.
                if (min > data[i][j]){//membandingkan nilai dengan nilai minimal
                    min = data[i][j];//jika nilai yang sedang diperiksa lebih kecil dari nilai minimal saat ini, maka nilai minimal diperbarui.
                }else if (max < data[i][j]){//membandingkan nilai dengan nilai maksimal
                    max = data[i][j];//Jika nilai yang sedang diperiksa lebih besar dari nilai maksimal saat ini, maka nilai maksimal diperbarui.
                }
            }
        }
        //terakhir menampikan nilai minimal dan maksimal
        System.out.println("Nilai Minimal  : " + min);
        System.out.println("Nilai Maksimal : " + max);
    }
}