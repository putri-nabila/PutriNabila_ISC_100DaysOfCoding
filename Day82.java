package days_of_coding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nama = new ArrayList<>();
        
        System.out.print("Masukkan jumlah nama : ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Masukkan nama ke-" + i + " : ");
            String nama1 = input.next();
            nama.add(nama1);
        }
        
        System.out.println("==============================================");
        System.out.println("Daftar nama : ");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println((i + 1) + ". " + nama.get(i));
        }
    }
}
