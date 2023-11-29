package days_of_coding;

public class Day52 {//di day 51 saya menngcommit codingan tentang array 3 dimensi
    public static void main(String[] args) {
        int [][][] tiga_dimensi= {
            {
                {1, 3, 8}, {2, 9, 3}, {1, 0, 5}
            },
            {
                {13, 8, 0}, {29, 9, 3}, {10, 5, 22}
            },
            {
                {5, 3, 13}, {10, 8, 2}, {0, 9, 21}
            },
            
        };
        
        System.out.println("Tampilan Array 3 Dimensi : ");
        for (int i = 0; i < tiga_dimensi.length; i++) {
            for (int j = 0; j < tiga_dimensi[i].length; j++) {
                for (int k = 0; k < tiga_dimensi[i][j].length; k++) {
                    System.out.print(tiga_dimensi[i][j][k] + "; ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
