import java.util.*;

public class FizzBuzzProgram {
    public static void main(String[] args) {
        Scanner vam =new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = vam.nextInt();
        if(n==0){
            System.out.println(0);
        }
        else{
        for(int i =1;i<=n ;i++){
            if( i%3==0 && i %5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
        }
    }
}
