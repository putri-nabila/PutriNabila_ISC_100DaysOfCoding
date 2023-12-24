package days_of_coding;

public class Day78 {//di day 78 saya mengcommit terkait fungsi
     //pertama disini ada fungsi sederhana tanpa parameter dan tanpa nilai kembali
    public static void ucapan() {//mendefinisikan fungsi ucapan() yang tidak memiliki paramater dan tidak mengembalikan nilai(void)
        System.out.println("Halo nabila");//fungsi ini hanya mencetak "Halo nabila"
    }

    //kemudian disini ada ungsi dengan parameter
    public static void ucapanSP(String sp) {//lalu mendefinisikan fungsi ucapanSP dengan satu parameter bertipe String (nama). 
        System.out.println("Halo nabila, " + sp + "!");//fungsi ini mencetak pesan salam dengan menambahkan nilai parameter kedalamnya
    }


    public static void main(String[] args) {
        //memanggil fungsi ucapan() untuk mencetak pesan sapaan tannpa parameter
        ucapan();
        
        //memanggil fungsi ucapanSP dengan memberikan nilai parameter "selamat pagi" untuk mencetak sapaan dengan parameter yang diberikan
        ucapanSP("selamat pagi  ");
    }
}
