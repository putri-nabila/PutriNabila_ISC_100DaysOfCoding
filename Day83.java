package days_of_coding;

public class Day83 {//di day 83 saya mencommit terkait array 2 dimensi untuk meembuat daftar nilai beserta predikatnya
    public static void main(String[] args) {
        //hal pertama tentu saja mendeklarasikan dan inisialisasi array 2 dimensi dengan tipe data integer serta nama variabel nilai
        int[][] nilai = {
                            {80,81,31},
                            {100,50,83},
                            {92,90,32},
                            {60,85,78}
                        };
        
        //kemudain menampilkan daftar nilai dan predikat
        System.out.println("DAFTAR NILAI DAN PREDIKAT");
        System.out.println("==================================");
        
        //untuk penentuan predikat sekaligus menampilkan nilai nya itu menggunakan perulangan yang didalamnya terdapat percabangan
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++){
                //nah disini ada percabangan dengan beberapa kondisi
                if (nilai[i][j] >= 85 && nilai[i][j] <= 100) {//disini jika nilai lebih besar atau sama dengan 90 dan nilai lebih kecil atau sama dengan 100 maka mendapatkan predikat A
                    System.out.println("Nilai : " + nilai[i][j] + "\nPredikat A");
                    System.out.println("---------------------------------------");
                } else if (nilai[i][j] >= 75 && nilai[i][j] <= 84) {//disini jika nilai lebih besar atau sama dengan 75 dan nilai lebih kecil atau sama dengan 84 maka mendapatkan predikat B
                    System.out.println("Nilai : " + nilai[i][j] + "\nPredikat B");
                    System.out.println("---------------------------------------");
                } else if (nilai[i][j] >= 65 && nilai[i][j] <= 74) {//disini jika nilai lebih besar atau sama dengan 65 dan nilai lebih kecil atau sama dengan 74 maka mendapatkan predikat C
                    System.out.println("Nilai : " + nilai[i][j] + "\nPredikat C");
                    System.out.println("---------------------------------------");
                } else if (nilai[i][j] >= 60 && nilai[i][j] <= 64) {//disini jika nilai lebih besar atau sama dengan 60 dan nilai lebih kecil atau sama dengan 64 maka mendapatkan predikat D
                    System.out.println("Nilai : " + nilai[i][j] + "\nPredikat D");
                    System.out.println("---------------------------------------");
                }else {//dan disini jika semua kondisi diatas tidak terpenuhi atau artinya nilai lebih kecil dari 60 maka mndapatkan preedikat Error
                    System.out.println("Nilai : " + nilai[i][j] + "\nNilai Error");
                    System.out.println("---------------------------------------");
                }
            }
        }
    }
}