import java.util.*;

public class Sumofdigits {
    public static void main(String[] args){
        //Sum of digits of a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int originalNumber = n;
        int Digitsum = 0;
        //why we used !=0 because when n becomes 0 we have to stop the loop
        //it is easy to print negative values too
        //but when we use n>0 it will not work for negative numbers0
        for(; n!=0; n=n/10){ //Division because we have to remove last digit after every iteration 12345/10 = 1234
            int remainder = n % 10; // it gives remainder of a number 12345%10 = 5
            Digitsum = Digitsum + remainder; // Digitsum = 0 + 5 = 5; next iteration - 5 +4 =9
        }
        System.out.println("The sum of digits of " + originalNumber + " is: " + Digitsum);
        
    }
        
    
}

