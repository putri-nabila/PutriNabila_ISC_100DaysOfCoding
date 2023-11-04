package days_of_coding;

import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner wanpis = new Scanner (System.in);
        System.out.print("Masukkan jumlah episode yang sudah Anda tonton : ");
        int eps = wanpis.nextInt();
        
        if (eps > 0 && eps <= 200) {
            System.out.println("Anda masih sangat pemula dalam hal anime ONE PIECE.");
        } else if (eps > 200 && eps <=400 ) {
            System.out.println("Anda sudah berada di tahap lumayan dalam hal anime ONE PIECE.");
        } else if (eps > 400 && eps <= 600) {
            System.out.println("Anda hampir sudah setengah jalan dalam hal marathon ONE PIECE.");
        } else if (eps > 600 && eps <= 800){
            System.out.println("Anda sudah setengah jalan dalam hal marathon ONE PIECE, semangat marathon!!");
        } else if(eps > 800 && eps <= 1081){
            System.out.println("Anda sudah mendekati dengan episode terbaru ONE PIECE, semangat marathon!! jika mencapai 1081 artinya Anda sudah meencapai episode terbaru ONEPICE. Selamat Anda benar-benar pecinta ONE PIECE!!");
        } else {
            System.out.println("ANDA BUKAN PECINTA ONE PIECE");
        }
    }
}
