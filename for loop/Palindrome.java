import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        //To check whether a number is palindrome or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int originalNumber = n;
        int reverseNumber = 0;
        for(; n!=0; n=n/10){ //Division because we have to remove last digit after every iteration 12345/10 = 1234
            int remainder = n % 10; // it gives remainder of a number 12345%10 = 5
           reverseNumber = reverseNumber * 10 + remainder; // reverseNumber = 0*10 + 5 = 5; next iteration - 5*10 +4 =54
        }
        if(originalNumber == reverseNumber){
            System.out.println(originalNumber + " is a palindrome number.");
        }
        else{
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
        
    
}
