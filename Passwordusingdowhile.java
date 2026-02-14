import java.util.*;

public class Passwordusingdowhile {
    public static void main(String[] args) {
        Scanner vam = new Scanner(System.in);
        String correctPassword="Password123";
        String userEnteredPassword;
        do {
            System.out.print("Enter your password: ");
            userEnteredPassword = vam .nextLine();
            if(!userEnteredPassword.equals(correctPassword)){
                System.out.println("Incorrect password. Please try again.");
            }

        } while(!(userEnteredPassword .equals(correctPassword))); // ! this is used as opposite reaction
        // Loop continues until the correct password is entered
        // ! is used so when user password is matcg=hes to the correct password loop stops and moves to next statement.
        // i am running the that shows the password should not be correct so that loop continues until correct password is entered.
        System.out.println("Access granted. Welcome!");
    }


}
