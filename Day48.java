package days_of_coding;

public class Day48 {
    public static void main(String[] args) {
        //membuat array 2 dimensi atau biasa disebut matriks
        int[][] matrix = {
            {1, 3, 8},
            {0, 2, 9},
            {13, 3, 29}
        };

        //menampilkan matriks
        System.out.println("Matriks:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //mengakses elemen matriks
        int element = matrix[1][0];
        System.out.println("Elemen di baris 1, kolom 2: " + element);

    }
}
