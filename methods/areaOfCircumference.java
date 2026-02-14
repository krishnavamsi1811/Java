
import java.util.*;
public class areaOfCircumference {
    static double calculatePrice(int quantity, double price, boolean isMember){
        double totalprice = quantity *price;
        if (isMember){
            totalprice = totalprice * 0.15;
        }
        return totalprice; // return will stop whole method and goes to main method
        // But the break command will break the loop but the return will stop the entire method
    }

public static void main(String args[]){
 Scanner vam = new Scanner (System.in);
 System.out.println("Enter the Quantitty");
 int a = vam.nextInt();
 System.out.println("Enter the price");
 double b = vam.nextDouble();
 System.out.println("Enter True or False that if Member have membership or not");
 boolean c = vam.nextBoolean();
   
   System.out.println(calculatePrice(a, b, c));

}
}
