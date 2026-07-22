import java.util.Scanner;

public class BitwiseBitChecker {
    public static void main (String[] args) {

       Scanner sc = new Scanner (System.in);

       int mask = 0b100000;
       int number = sc.nextInt();

       if ( (number & mask) != 0 ) {
           System.out.print ("6th bit is true");
       }
       else {
           System.out.print ("6th bit is false");
       }

       sc.close();
    }
}
