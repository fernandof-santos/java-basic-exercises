import java.util.Scanner;

public class MultipleChecker {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        int firstNumber, secondNumber;

        System.out.print ("Enter a number for A: ");
        firstNumber = sc.nextInt();

        System.out.print ("Enter a number for B: ");
        secondNumber = sc.nextInt();

        if (firstNumber % secondNumber == 0 || secondNumber % firstNumber == 0) {
            System.out.print("The numbers are multiples.");
        }
        else {
            System.out.print ("The numbers are not multiples.");
        }

    }
}
