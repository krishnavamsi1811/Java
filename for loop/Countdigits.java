import java.util.*;
public class Countdigits {
    public static void main(String[] args) {
        //Count the number of digits in a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int count = 0;
        if (n == 0) {
            count = 1; // Special case for 0
        }
        else{
        for(; n!=0; n = n/10){
            count++;
         }
        }
        System.out.println("The number of digits in the given number is: " + count);
    }
}