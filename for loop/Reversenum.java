import java.util.*; 

public class Reversenum {
    public static void main(String[] args) {
        //Reverse of a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int n = scanner .nextInt();
        int reverse = 0;
        for(; n!=0;n = n/10){
            int remainder = n%10;
            reverse = reverse *10 + remainder;
        }
        System.out.println("The reverse of the number is: " + reverse);
    }
}
