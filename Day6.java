package days_of_coding;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scan_aritmatika = new Scanner (System.in);//membuat suatu perintah inputan dengan nama variabel scan
        
        //Operator Aritmatika
        System.out.println("OPERATOR ARITMATIKA");
        System.out.print("Masukkan nilai a : ");//inputan nilai a
        int a = scan_aritmatika.nextInt();//untuk membaca inputan integer
        System.out.print("Masukkan nilai b : ");//inputan nilai b
        int b = scan_aritmatika.nextInt();//untuk membaca inputan integer
        
        
        int penjumlahan = a + b;//operator penjumlahan dimana hasilnya nanti itu integer
        int pengurangan = a - b;//operator pengurangan dimana hasilnya nanti itu integer
        int perkalian = a * b;//operator perkalian dimana hasilnya nanti itu integer
        double pembagian = (double)a/b;//operator pembagian dimana hasilnya nanti itu double (karena bisa saja hasilnya itu desimal)
        int modulus = a%b;//operator modulus dimana hasilnya nanti itu integer
        b++;//menambahkan atau meningkatkan nilai b dengan 1
        a--;//mengurangi nilai a dengan 1
        
        //menampilkan hasil
        System.out.println("==================================");
        System.out.println("Output hasil oparator aritmatika");
        System.out.println("Hasil Penjumlahan     : " + penjumlahan);//menampilkan hasil dari operator penjumlahan
        System.out.println("Hasil Pengurangan     : " + pengurangan);//menampilkan hasil dari operator pengurangan
        System.out.println("Hasil Perkalian       : " + perkalian);//menampilkan hasil dari operator perkalian
        System.out.println("Hasil Pembagian       : " + pembagian);//menampilkan hasil dari operator pembagian
        System.out.println("Hasil Modulus         : " + modulus);//menampilkan hasil dari operator modulus
        System.out.println("Penambahan 1 nilai b  : " + b);//menampilkan hasil dari operator penambahan 1
        System.out.println("Pengurangan 1 nilai a : " + a);//menampilkan hasil dari operator pengurangan 1
        
        System.out.println("====================================================");
        //Operator Penugasan
        System.out.println("OPERATOR PENUGASAN");
        //untuk penjumlahan dan pengurangan
        int pa = 3;
        int pb = 2;
        
        pa += 2;//artinya pa = pa + 2
        pb -= 1; //artinya pb = pb - 1
        
        System.out.println("Nilai pa+= 2 adalah : " + pa);
        System.out.println("Nilai pb-= 1 adalah : " + pb);
        
        //untuk perkalian dan pembagian
        int paa = 13;
        int pbb = 8;
        
        paa *= 3;//artinya paa = paa dikali 3
        pbb /= 4;//artinta pbb = pbb di bagi 8
        
        //menampilkan hasil 
        System.out.println("Nilia paa *= 3 adalah : " + paa);
        System.out.println("Nilia pbb /= 8 adalah : " + pbb);
        
        System.out.println("====================================================");
        System.out.println("OPERATOR PERBANDINGAN");
        Scanner scan_banding = new Scanner (System.in);
        
        System.out.print("Masukkan nilai ap : ");//inputan nilai ap
        int ap = scan_aritmatika.nextInt();//untuk membaca inputan integer
        System.out.print("Masukkan nilai bp : ");//inputan nilai bp
        int bp = scan_aritmatika.nextInt();//untuk membaca inputan integer
       
        boolean hasil;//deklarasi hasil dengan tipe data boolean
        
        hasil = ap == bp;//untuk  sama dengan (==)
        System.out.println("Apakah nilai ap sama dengan nilai bp? " + hasil );
        
        hasil = ap != bp;//untuk tidak sama dengan
        System.out.println("Apakah nilai ap tidak sama dengan nilai bp? " + hasil );
        
        hasil = ap > bp;//untuk lebih besar (>)
        System.out.println("Apakah nilai ap lebih besar nilai bp? " + hasil );
        
        hasil = ap < bp;//untuk lebih kecil (<)
        System.out.println("Apakah nilai ap lebih kecil nilai bp? " + hasil );
        
        hasil = ap >= bp;//untuk lebih besar atau sama dengan
        System.out.println("Apakah nilai ap lebih besar atau sama dengan nilai bp? " + hasil );
        
        hasil = ap <= bp;//untuk kurang atau sama dengan
        System.out.println("Apakah nilai ap kurang atau sama dengan nilai bp? " + hasil );
        
        System.out.println("====================================================");
        //Operator Logika
        System.out.println("OPERATOR LOGIKA");
        boolean la = true;
        boolean lb = false;
        boolean hasill;
        
        //untuk dan (&&) jika keduanya sama maka hasilnya true, jika keduanya beda hasilnya akan false
        hasill = la && la;//jika true dan true hasilnya adalah true
        System.out.println("Hasil dari la && la : " + hasill );
        
        hasill = la && lb;//jika true dan false hasilnya adalah false
        System.out.println("Hasil dari la && lb : " + hasill );
        
        //untuk or (||) jika keduanya sama hasilnya false, jika keduanya beda hasilnya akan true
        hasill = la || lb;//jika true atau false hasilnya adalah true
        System.out.println("Hasil dari a || b : " + hasill ); 
        
        //untuk not (!) artinya kebalikan, jika awalnya true maka hasinya false
        hasill = !la;//artinya kebalikan dari nilai la
        System.out.println("Hasil dari !la : " + hasill );  
    }
}
