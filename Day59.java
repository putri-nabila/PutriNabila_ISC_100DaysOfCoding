/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package days_of_coding;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Day59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int [] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.print("Masukkan nilai x : ");
        int x = scan.nextInt();
        int index = -1;
        for (int i = 0; i < angka.length; i++) {
            if(x == angka[i]){
                index = i;
                
            }
        }
        System.out.println("posisi : "+index);
    }
}
