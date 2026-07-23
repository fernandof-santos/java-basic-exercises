package loops;

import java.util.Scanner;

public class InteractiveNumberSumCalculator {
    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.print ("Enter the number (0 to finish): ");
        number = sc.nextInt();

        while (number != 0) {
            total = total + number;
            number = sc.nextInt();

        }
        System.out.print ("the total is : " + total);

        sc.close();
    }
}
