import java.util.Scanner;

public class FavoriteMovieSurvey {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);


        System.out.print ("What is your favorite movie? ");
        String movie = sc.nextLine();

        System.out.print ("Why do you like it? ");
        String reason = sc.nextLine();


        System.out.print ("Your favorite movie is " + movie + " because " + reason);



        sc.close();
    }
}
