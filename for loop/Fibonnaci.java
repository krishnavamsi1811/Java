import java.util.*;

public class Fibonnaci {
    public static void main(String[] args){
        //Print first N Fibonacci numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
       int a = 0;
       int b =1;
       
       if(n<=0){
        System.out.println("Please enter a positive integer.");
       }
       else if(n==1){
        System.out.println("The  " + n + " Fibonacci numbers are: "+ a);
       }
       
       else{
        System.out.println("The  " + n + " Fibonacci numbers are: " +a +" " + b + " ");
       for (int i=3; i<=n; i++){
        int c = a+b;
        a = b;
        b = c;
        System.out.print(c + " ");
                     
       }
    }

    }
    
}
