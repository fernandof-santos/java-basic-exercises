import java.util.Scanner;

public class NumberSumAccumulator {
    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();
        int sum  = 0;

        for (int i = 0; i<quantity; i++ ) {
            int number  = sc.nextInt();
            sum  = sum  + number ;
        }
        System.out.println (sum );

        sc.close();

    }
}
