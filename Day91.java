package days_of_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day91 {//di day 91 saya mencommit terkait penentuan besar kecilnya nilai menggunakan bufferedReader
    public static void main(String[] args) {
        try{//di sini ada try catah
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));//kemuadian membuat objek bufferedRaeder dengan nama variabel input, yang nantinya digunakan jika ingin memasukkan nilai
        
        System.out.print("Masukkan nilai A: ");//perintah memasukkan nilai A
        int nilaiA = Integer.parseInt(input.readLine());//ini untuk menyimpan nilai yang sebelumnya dimasukkan
        
        System.out.print("Masukkan nilai B: ");//perintah memasukkan nilai B
        float nilaiB = Integer.parseInt(input.readLine());//untuk menyimpan nilai yang sebelumnya dimasukkan
        
        //kemudian disini ada percabangan yakni
        if(nilaiA > nilaiB){//jika nilai A lebih besar dari nilai B
            System.out.println("Nilai A lebih besar dari B");//maka outputnya seperti disamping
        }
        else if(nilaiA < nilaiB){//kemudian jika nilai A lebih kecil dari nilai B 
            System.out.println("Nilai A lebih kecil dari B");//maka outputnya sepert disamping
        }
        else if(nilaiA == nilaiB){//nah disini ada logika jika nilai A sama dengan nilai B
            System.out.println("Nilai A dan B sama besar");//maka outputnya juga seperti yang disamping
        }
       } catch(IOException e){//kemudian disini jika inputan yang dimasukkan itu salah
           System.out.println("Mohon masukan input dengan benar");
       }
    }
}
