package conditionals;

import java.util.Scanner;

public class SimpleCalculatorMenu {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int option;
        int sumResult = 0;
        int subtractResult = 0;

        do {
            System.out.println ("1 - Sum ");
            System.out.println ("2 - Subtract ");
            System.out.println ("3 - Exit ");

            System.out.print ("Choose the option: " );
            option = sc.nextInt();

            if (option == 1) {
                System.out.println ("You chose to sum value!");
                System.out.print ("Enter the first value: ");
                int numberPositive1 = sc.nextInt();

                System.out.print ("Enter a other value: ");
                int numberPositive2 = sc.nextInt();

                sumResult = numberPositive1 + numberPositive2;
                System.out.println ("The sum of these two numbers is: " + sumResult);

            }
            if (option == 2) {
                System.out.println ("You chose to Subtract value! ");
                System.out.print ("Enter the first value: ");
                int numberNegative1 = sc.nextInt();

                System.out.print ("Enter a other value: ");
                int numberNegative2 = sc.nextInt();

                subtractResult = numberNegative1 - numberNegative2;
                System.out.println ("The sum of these two numbers is: " + subtractResult);

            }

        } while (option != 3 );

        sc.close();
    }
}
