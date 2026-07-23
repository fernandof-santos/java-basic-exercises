package math;

import java.util.Locale;
import java.util.Scanner;

public class GradeAverageCalculator {
    public static void main (String []args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double note1, note2, note3, average;

        System.out.print ("Enter your first note: ");
        note1 = sc.nextDouble();

        System.out.print ("Enter your second note: ");
        note2 = sc.nextDouble();

        System.out.print ("Enter your third note: ");
        note3 = sc.nextDouble();

        average = (note1 + note2 + note3) / 3;

        if (average >= 7){
            System.out.print ("Congratulations, you passed!");
        }
        else if (average >= 5) {
            System.out.print ("hmm... You are in recovery.");
        }
        else {
            System.out.print ("That's sad, you failed! ");
        }

        sc.close();

    }
}


