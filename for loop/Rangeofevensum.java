import java.util.*;
public class Rangeofevensum{
    public static void main(String[] args){
        //Sum of even numbers in a given range
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting value of the range: ");
        int start = scanner.nextInt();
        System.out.println("Enter the ending value of the range: ");
        int end = scanner.nextInt();
        int sum = 0;
        int evencount = 1;
        for (int i = start; i <= end; i++){
            if (i % 2 == 0){
                sum += i; // sum = sum + i
                System.out.println("The " + evencount + " even number between " + start + " and " + end + " is: " + i);
                evencount++;
            }
            
        }
        System.out.println("The sum of even numbers between " + start + " and " + end + " is: " + sum);
    }
}