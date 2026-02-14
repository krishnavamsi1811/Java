import java.util.*;

public class Grades {
    void displayStudentGrade(String name, char grade){
       System.out.println(name + " got " +grade +" Grade");
    }
    char calculateGrade(int score){
      if(score>=90 && score <=100){
        return 'A';
      }
       else if(score>=80 && score <=89){
        return 'B';
      }
       else if(score>=70 && score <=79){
        return 'c';
      }
       else if(score>=60 && score <=69){
        return 'D';
      }
    else {
        return 'F';
      }
       
    }
    public static void main(String[] args) {
        Scanner vam = new Scanner (System.in);
        System.out.println("Enter the name: ");
        String n = vam.nextLine();
        System.out.println("Enter the score");
        int num = vam.nextInt();
        Grades vamsi = new Grades();
       
       char enterGrade = vamsi.calculateGrade(num);
       vamsi.displayStudentGrade(n, enterGrade);
       // the above method does not sout because we have given void
       // void means it does not return nothing.
       //When we use sout it gives error that it has void but telling me to someting.
    }
    
}
