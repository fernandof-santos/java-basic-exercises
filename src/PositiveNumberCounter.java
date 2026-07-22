import java.util.Scanner;

public class PositiveNumberCounter {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int positiveCount = 0;

        System.out.println ("Enter integers (Enter 0 to stop): ");


        while (true) {
            number = sc.nextInt();

            if (number == 0){
                break;
            }

            if (number > 0) {
                positiveCount = positiveCount + 1;
            }
        }

        System.out.println ("You typed " + positiveCount     + " positive numbers!");

        sc.close();

    }
}
