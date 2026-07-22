import java.util.Scanner;

public class PasswordValidator {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        int password;
        int attempts = 0;

        do {
            System.out.print ("Enter the password: ");
            password = sc.nextInt();
            attempts ++;
        } while (password != 1903 && attempts <3);

         if (password == 1903) {
             System.out.print ("Correct password!");
         }
         else {
             System.out.println("Access blocked");
         }

        sc.close();
    }
}
