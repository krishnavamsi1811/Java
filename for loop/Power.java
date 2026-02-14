import java.util.*;

public class Power {
    public static void main(String[] args) {
        // Power of a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base value:");
        int base = scanner.nextInt();
        System.out.println("Enter the exponent value:");
        int exponent = scanner.nextInt();
        int num=1;
        if(exponent < 0){
            System.out.println("Exponent should be a non-negative integer.");
        }
        else if(exponent == 0){
            System.out.println("Any number raised to the power of 0 is :" + num);
        }
        else{
           for (int i=1; i<= exponent; i++){
           num = num*base; // num= 1*5 - 1st iteration
                                   // num= 5*5 - 2nd iteration
                                 
           // base = base * base exa,ple:5 = 5*5=25 - 1st iteration
                                   // 25= 25*5=625 - 2nd iteration
                                   //so answer will be 625 but actual value value is 25.
           } System.out.println(base + " raised to the power of " + exponent + " is: " + num);
        }
           
        
    }
}
