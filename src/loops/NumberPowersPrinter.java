package loops;

import java.util.Scanner;

public class NumberPowersPrinter {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit  = sc.nextInt();

        for (int i=1; i<=limit ; i++) {

            int number = i;
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("%d %d %d%n", number, square, cube);
        }

        sc.close();
    }
}
