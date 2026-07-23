package basics;

import java.util.Scanner;

public class PersonalInformationCollector {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter your name: ");
        String name = sc.nextLine();

        System.out.print ("Which city do you live in? ");
        String city = sc.nextLine();

        System.out.print (name + " lives in " + city);

        sc.close();
    }
}
