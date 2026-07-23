package conditionals;

import java.util.Scanner;

public class NumberSignChecker {
    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print ("Enter a Number: ");
        number = sc.nextInt();

        if (number > 0) {
            System.out.print ("Positive Number");
        }
        else if (number < 0) {
            System.out.print ("Negative Number");
        }
        else {
            System.out.print ("Neutral");
        }

        sc.close();

    }
}
