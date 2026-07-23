package conditionals;

import java.util.Scanner;

public class GameDurationCalculator {
    public static void main (String []args){

        Scanner sc = new Scanner (System.in);

        int hourStart, hourEnd;

        System.out.print ("Enter the start time: ");
        hourStart = sc.nextInt();

        System.out.print ("Enter the end time: ");
        hourEnd = sc.nextInt();

        int duration;

        if (hourStart < hourEnd) {
            duration = hourEnd - hourStart;
        }
        else {
            duration = 24 - hourStart + hourEnd;
        }

        System.out.printf ("The Game lasted " + duration + " Hours");

        sc.close();
    }
}
