import java.util.*;

public class prime {
    public static void main(String[] args){
        //To check whether a number is prime or not
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isPrime = true; //boolean - datatype that can hold true or false value 
        // isPrime - variable name which is of boolean datatype and it holds true or false value
        if (n<=1 && n>=0){ //0 and 1 are not prime numbers
            System.out.println(n + " is not a prime number.");
        }
        else if (n<0){ //negative numbers are not prime numbers
            System.out.println("Please enter a positive integer.");
        }
        else{
            for ( int i=2; i < n ; i++){ // i starts from 2 because 1 is a factor of all numbers
                if(n%i==0){ //the n is divisible by i everytime when loop runs
                    System.out.println(n + " is not a prime number.");
                    isPrime = false; //if n is divisible by any number other than 1 and itself then it is not prime
                    break; //to exit the loop once we find that n is not prime

                }

            }
            // we use if because whenever n is not prime and it prints not prime and prime too
            // to stop it we use if condition in that boolean variable
            if(isPrime){ //if isPrime is still true after the loop then n is prime
                System.out.println(n + " is a prime number.");
            }
        }
    }
    
}
