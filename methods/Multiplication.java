
import java.util.*;

public class Multiplication {
    static void mul(){
        Scanner vam = new Scanner(System.in);
        System.out.println("The number entered for multiplication");
        int a= vam.nextInt();
        int n;
        System.out.println("Upto which number");
        n=vam.nextInt();
       
        for(int i = 1; i<=n;i++){
          System.out.println(a +" * " +i +" = " +a*i);
        }


    }
    public static void main(String[] args) {
        mul();
    }
    
}
