import java.util.*;

public class Optimizationprime {
    public static void main(String[] args){
       /// We use function to this to this code
       // So that we can reduce time complexity of the Enhacedprime.java code
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isPrime = true;
        if (n<=1 && n>=0){ 
            System.out.println(n + " is not a prime number.");
        }
        else if (n<0){
            System.out.println("Please enter a positive integer.");
        }
        else{
            for ( int i=2; i < Math.sqrt(n) ; i++){ // Math.sqrt(n) gives the square root of n.
                // A number cannot be divisible by a number greater than its square root.
                if(n%i==0){ 
                    System.out.println(n + " is not a prime number.");
                    isPrime = false; 
                    break; 

                }

            }
           
            if(isPrime){ 
                System.out.println(n + " is a prime number.");
            }
        }
    }
    
}