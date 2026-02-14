
import java.util.*;


public class Enchacedprime {
    static boolean isPrime(int a){
          if(a<=1){
            return false;
          }
         for(int i=2;i<=Math.sqrt(a);i++){
        if(a%i==0){
            return false;   
        }
    }
    return true;
    }
    

public static void main(String args[]){
   Scanner vam=new Scanner(System.in);
   System.out.println("Enter the number:");
   int a = vam.nextInt();
   if(isPrime(a)){
    System.out.println("It is a prime number");
   }
    else{
        System.out.println("It is not a prime number");
    }
}
   
}
