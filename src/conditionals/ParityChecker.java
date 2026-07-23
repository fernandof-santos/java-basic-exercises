package conditionals;

import java.util.Scanner;

public class ParityChecker {
    public static void main (String []args){

        Scanner sc = new Scanner (System.in);

        int number;

        System.out.print ("Enter a number: ");
        number = sc.nextInt();

        if (number % 2==0 ) {
            System.out.printf ("Even Number  " + number);
        }
        else {
            System.out.printf ("Odd Number " + number);
        }

        sc.close();

    }
}
