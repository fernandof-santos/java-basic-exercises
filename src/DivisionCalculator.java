import java.util.Scanner;

public class DivisionCalculator {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();

        for (int i = 0; i< quantity; i++) {

            int dividend = sc.nextInt();
            int divisor = sc.nextInt();

            if (divisor == 0) {
                System.out.println("Division impossible");
            }
            else {
                double result = (double) dividend / divisor;
                System.out.printf("%.1f%n", result);
            }
        }

        sc.close();
    }
}