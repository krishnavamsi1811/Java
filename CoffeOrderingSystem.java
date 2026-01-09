import java.util.*;
public class CoffeOrderingSystem {  
// Using if and if else statements to take order and calculate bill amount.
    public static void main(String[] args) {
        System.out.println("*************************************");
        System.out.println(" Welcome to the Coffee Ordering System ");
        System.out.println("*************************************");
        System.out.println(" 1.Espresso - 200 \n 2.Cappucccino - 250 \n 3.Latte - 300");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your choice : ");
        int choice = sc.nextInt();
        int billAmount = 0;
        if (choice <4){  // Validating choice number should be less than 4
            if(choice == 1){
                System.out.println("You have ordered Espresso.");
                billAmount += 200;
            } else if (choice == 2){
                System.out.println("You have ordered Cappuccino.");
                billAmount += 250;
            } else{
                System.out.println("You have ordered Latte.");
                billAmount += 300;
            } 
            System.out.println("Want to add whipped cream for ₹30? (yes=1 / no=0): ");
            int whippedCreamChoice = sc.nextInt();
            if (whippedCreamChoice == 1){
                billAmount += 30;
            }
            System.out.println("Want to add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0) :");
            int flavourShotChoice = sc.nextInt();
            if (flavourShotChoice == 1){
                System.out.println("Choose flavor: 1. Vanilla 2. Hazelnut");
                int flavourType = sc.nextInt();
                if (flavourType== 1){
                    System.out.println("Vanilla flavor added.");
                    billAmount += 20;
                } else if (flavourType == 2){
                    System.out.println("Hazelnut flavor added.");
                    billAmount += 25;
                }
            }
            System.out.println("Your total bill amount is :" + billAmount);  
        } else { // Handling invalid choice4
        
            System.out.println("Invalid choice. Please select a valid option.");
        }
    }
}
