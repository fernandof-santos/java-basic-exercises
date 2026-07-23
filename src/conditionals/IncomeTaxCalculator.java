package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary;
        double tax;

        System.out.print ("Enter your salary: ");
        salary = sc.nextDouble();

        if (salary <= 2000.0) {
            tax = 0.0;
        }
        else if (salary <= 3000.0) {
            tax = (salary - 2000.0) * 0.08;
        }
        else if (salary <= 4500.0) {
            tax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (tax == 0.0){
            System.out.print ("Tax exempt");
        }
        else {
            System.out.printf ("R$ %.2f%n ", tax);
        }

        sc.close();



    }
}
