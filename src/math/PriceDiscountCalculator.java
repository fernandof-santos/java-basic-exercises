package math;

import java.util.Locale;

public class PriceDiscountCalculator {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        double price = 34.5;
        double discount = (price < 20.0) ? price * 0.01 : price * 0.05;

        System.out.print (discount);

    }
}

