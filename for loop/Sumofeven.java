import java.util.*;

public class Sumofeven {
    public static void main(String[] args){
    //Sum of even numbers up to N
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = scanner.nextInt();
    int sum =0;
    for (int i=1; i<=n; i++){
        if (i%2==0){
            sum += i; // sum = sum + i
        }
    }
    System.out.println("The sum of even numbers up to " + n + " is: " + sum);
    }
}
