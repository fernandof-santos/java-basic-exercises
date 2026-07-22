import java.util.Scanner;

public class GreaterNumberChecker {
    public static void main (String []args){

        Scanner sc = new Scanner (System.in);

        int number1, number2;

        System.out.print ("Enter a number: ");
        number1 = sc.nextInt();

        System.out.print ("Enter another number: ");
        number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.print ("The first number entered is greater!");
        }
        else {
            System.out.print ("The second number entered is greater! ");
        }

        sc.close();
    }
}

