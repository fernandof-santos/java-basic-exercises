import java.util.Locale;
import java.util.Scanner;

public class DiscountCalculator {
    public static void main (String []args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double price, discount, total;

        System.out.print ("Enter the price: ");
        price = sc.nextDouble();

        if (price > 100) {
            discount = price * 0.10;
            total = price - discount;
            System.out.println ("Final price: " + total);
        }
        else {
            System.out.println ("Total: " + price);
        }

        sc.close();


    }
}

