import java.util.Locale;
import java.util.Scanner;

public class NumberIntervalChecker {
    public static void main (String []args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double number;

        System.out.print ("Enter a number: ");
        number = sc.nextDouble();

        if (number < 0.0 || number > 100.0) {
            System.out.print ("Out of range");
        }
        else if (number <= 25.0){
            System.out.print ("interval [0,25]");
        }
        else if (number <= 50.0){
            System.out.print ("interval (25,50]");
        }
        else if (number <= 75.0){
            System.out.print ("interval (50,75]");
        }
        else {
            System.out.print ("interval (75,100]");
        }
        sc.close();
    }
}
