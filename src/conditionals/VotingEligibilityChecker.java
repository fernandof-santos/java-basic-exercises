package conditionals;

import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print ("Enter your age: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.print ("Mandatory vote!");
        }
        else if (age >= 16) {
            System.out.print ("Optional vote ");
        }
        else {
            System.out.print ("Cannot vote! ");
        }

        sc.close();

    }
}


