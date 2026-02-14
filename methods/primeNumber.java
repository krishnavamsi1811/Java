
import java.util.*;
public class primeNumber {
    void prime (){
        Scanner vamsi = new Scanner (System.in);
        System.out.println("Enter the number");
        int a = vamsi.nextInt();
        boolean primeValue=true;
        int i ;
        if(a<=1){
            System.out.println("The prime number ststs from 2");
            return;
        }
        for(i=2;i< a/2;i++){
            if(a%i==0){
                System.out.println("It is not a prime");
               return;
            }
        
        }
        
            System.out.println("It is a Prime Number");
    
        
    }
    public static void main(String[] args) {
        primeNumber prime = new primeNumber();
        prime.prime();
    }
}
