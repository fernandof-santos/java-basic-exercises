import java.util.Locale;
import java.util.Scanner;

public class WeightedAverageCalculator {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();

        for (int i =0; i<quantity; i++) {

            double firstValue = sc.nextDouble();
            double secondValue = sc.nextDouble();
            double thirdValue = sc.nextDouble();

            double weightedAverage = (firstValue * 2.0 + secondValue * 3.0 + thirdValue * 5.0) / 10.0;

            System.out.printf ("%.1f%n", weightedAverage);

        }

        sc.close();
    }
}
