
import java.util.*;

public class Enhacedprime {
    public static void main(String[] args){
        //It is wrote reduc time complexity of previous prime.java code
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
            for ( int i=2; i < n/2 ; i++){ // n/2 because a number cannot be divisible by a number greater than its half
                if(n%i==0){
                    System.out.println(n + " is not a prime number.");
                    isPrime = false; 
                    break; // to exit the loop once we find that n is not prime
                    // if the number is not prime we don't need to check further so we directly break it and go
                    //example if 6 is given then it is divisible by 2 so it is not prime we don't need to check for 3,4,5

                }

            }
           
            if(isPrime){ 
                System.out.println(n + " is a prime number.");
            }
        }
    }
    
}

