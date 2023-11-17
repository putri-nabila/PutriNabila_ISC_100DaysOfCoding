package days_of_coding;

public class Day40 {//menetukan angka genap dari 1 - 100 yang dapat dibagi 5
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
