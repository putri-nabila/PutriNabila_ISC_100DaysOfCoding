package days_of_coding;

public class Day3 {
    //Dihari 3, membahas mengenai konversi string ke tipe data primitif dan konversi tipe data primitif ke string
    //Saya akan menggunakan beberapa tipe data primitf untuk dikonversi ke string
    public static void main(String[] args) {
        //Konversi String ke Tipe Data Primitif
        System.out.println("Konversi String ke Tipe Data Primitif");
        System.out.println("Nama               : Putri Nabila");
        //untuk string ke tipe data integer
        String umurStr = "20";//deklarasi variabel dengan tipe data string
        int umur = Integer.parseInt(umurStr);//perintah konversi nilai di 'umurStr' dari String ke tipe data int
        System.out.println("Umur               : " + umur + " tahun (hasil konversi string ke integer)");//menampilkan hasil konversi
        //untuk  string ke tipe data float
        String bbStr = "47.5";//deklarasi variabel dengan tipe data string
        float bb = Float.parseFloat(bbStr);//perintah konversi nilai di 'bbStr' dari String ke tipe data float
        System.out.println("Berat Badan        : " + bb + " kg (hasil konversi string ke float)");//menampilkan hasil konversi
        //untuk string ke tipe data double
        String tbStr = "160.5";//deklarasi variabel dengan tipe data string
        double tb = Double.parseDouble(tbStr);///perintah konversi nilai di 'tbStr' dari String ke tipe data double
        System.out.println("Tinggi Badan       : " + tb + " cm (hasil konversi string ke double)");//menampilkan hasil konversi
        //untuk string ke tipe data boolean 
        String mhsStr = "true";////deklarasi variabel dengan tipe data string
        boolean mhsBo = Boolean.parseBoolean(mhsStr);//perintah konversi nilai di 'mhsB' dari tipe data string ke boolean
        System.out.println("Mahasiswa Unsulbar : " + mhsBo + " (hasil konversi dari string ke boolean)");//menampilkan hasil konversi
        System.out.println("Golongan darah     : AB");//hanya ingin menampikan golongan darah
        System.out.println("=================================================================================");
        
        //Konversi Tipe Data Primitif ke String
        System.out.println("Konversi Tipe Data Primitif ke String");
        System.out.println("Nama               : Putri Nabila");
        //untuk tipe data integer ke string
        int umurInt = 20;//deklarasi variabel dengan tipe data integer
        String umurS = Integer.toString(umurInt);//perintah konversi nilai di 'umurInt' dari tipe data integer ke string
        System.out.println("Umur               : " + umurS + " tahun (hasil konversi integer ke string)");//menampilkan hasil konversi
        //untuk tipe data float ke string
        float bbFl= 47.5f;//deklarasi variabel dengan tipe data float
        String bbS = Float.toString(bbFl);//perintah konversi nilai di 'bbFl' dari tipe data float ke string
        System.out.println("Berat Badan        : " + bbS + " kg (hasil konversi float ke string)");//menampilkan hasil konversi
        //untuk tipe data double ke string
        double tbD = 160.5d;
        String tbS = Double.toString(tbD);
        System.out.println("Tinggi Badan       : " + tbS + " cm (hasil konversi double ke string)");//menampilkan hasil konversi
        //untuk tipe data boolean ke string
        boolean mhsB = true;//deklarasi variabel dengan tipe data boolean
        String mhsS = Boolean.toString(mhsB);//perintah konversi nilai di 'mhsB' dari tipe data boolean ke string
        System.out.println("Mahasiswa Unsulbar : " + mhsS + "(hasil konversi dari boolean ke string)");//menampilkan hasil konversi
        System.out.println("Golongan darah     : AB");//hanya ingin menampikan golongan darah
    }
}
