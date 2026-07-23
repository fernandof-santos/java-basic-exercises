package basics;

import java.util.Scanner;

public class UserProfileGenerator {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print ("Name: ");
        String name = sc.nextLine();

        System.out.print ("Country: ");
        String country = sc.nextLine();

        System.out.print ("Favorite Language: ");
        String language = sc.nextLine();

        System.out.print ("Dream Job: ");
        String job = sc.nextLine();

        System.out.println (" ");
        System.out.println ("--- PROFILE --- ");
        System.out.println (" ");

        System.out.println ("Name: " + name);
        System.out.println ("Country: " + country);
        System.out.println ("Favorite Language: "+ language);
        System.out.println ("Dream Job: " + job);





        sc.close();
    }
}
