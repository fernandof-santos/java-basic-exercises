package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class SnackBarOrderCalculator {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        int productCode;
        int quantity;
        double total = 0;

        System.out.print ("Enter the product code: ");
        productCode = sc.nextInt();

        System.out.print ("Enter the quantity: ");
        quantity = sc.nextInt();

        if (productCode == 1) {
            total = quantity * 4.0;
        }
        else if (productCode == 2){
            total = quantity * 4.50;
        }
        else if (productCode == 3){
            total = quantity * 5.00;
        }
        else if (productCode == 4) {
            total = quantity * 2.00;
        }
        else if (productCode == 5) {
            total = quantity * 1.50;
        }
        else {
            System.out.print ("Unknown product code!");
        }
        System.out.printf ("Total: R$ %.2f%n", total);

        sc.close();
    }
}
