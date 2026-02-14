import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        // Factorial of a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value o n:");
        int n = scanner.nextInt();
        int factorial = 1;
            if(n<0){
                System.out.println("Factorial is not defined for negative numbers.");
            }
            else{
                for(int i = 1; i <= n; i++){
                    factorial *= i; // factorial = factorial * i
                }
                System.out.println("The factorial of " + n + " is: " + factorial);
            } 
    }
}
