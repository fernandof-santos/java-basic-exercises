import java.util.Scanner;

public class NumberSumCalculator {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        int number = sc.nextInt();
        int sum = 0;


        while ( number != 0) {
            sum = sum + number;
            number = sc.nextInt();
        }
        System.out.print (sum);


        sc.close();
    }
}
