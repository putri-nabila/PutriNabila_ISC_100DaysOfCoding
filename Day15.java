package days_of_coding;

public class Day15 {
    public static void main(String[] args) {
        String nama = "Putri Nabila";
        char jenisKelamin = 'P';
        int tinggiBadan = 160;
       
        System.out.println("Nama Lengkap  : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Tinggi Badan  : " + tinggiBadan);
        
        if (jenisKelamin == 'L') {
            int beratIdeal = (tinggiBadan-100);
            System.out.println("Berat Ideal: " + beratIdeal);
        }
        else{
            int beratIdeal = (tinggiBadan-110);
            System.out.println("Berat Ideal   : " + beratIdeal);
        }
    }
}
