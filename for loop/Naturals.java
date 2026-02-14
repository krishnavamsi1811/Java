
import java.util.*;
public class Naturals {
    public static void main(String[] args) {
       //Sum of the N natural numbers
        Scanner vam = new Scanner (System.in);
        System.out.println("Enter the value of n: ");
        int n = vam .nextInt();
        int sum = 0;
        for ( int i =1 ; i<n ; i++){
            if(n<=0){
                System.out.println("Please enter a positive integer.");
                }
            else{
                sum += i;  // sum = sum + i
            }  
            
        }
         System.out.println("The sum of first " + n + " natural numbers is: " + sum); 
    }   
}
