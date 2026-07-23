package conditionals;

import java.util.Scanner;

public class WeekdaySelector {
    public static void main (String []args){

        Scanner sc = new Scanner (System.in);

        int dayNumber = sc.nextInt();
        String day;

        switch (dayNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day number";
                break;
        }

        System.out.println ("Day of the week: " + day);
        sc.close();

    }
}
