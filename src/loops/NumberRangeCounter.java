package loops;

import java.util.Scanner;

public class NumberRangeCounter {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        int quantity = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i=0; i<quantity; i++){
            int number  = sc.nextInt();
            if (number  >= 10 && number  <= 20) {
                in = in  + 1;
            }
            else {
                out = out + 1;
            }
        }

        System.out.println (in + " in");
        System.out.println (out + " out");

        sc.close();
    }
}
