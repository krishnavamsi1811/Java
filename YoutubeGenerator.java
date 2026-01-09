import java.util.*;
public class YoutubeGenerator {
    public static void main(String[] args) {
        // Java basic of input and output
        System.out.println("Welocome to the YouTube Name Generator!!!");
        Scanner vam = new Scanner(System.in);
        System.out.println("What is your nickname?");
        String nickname = vam.nextLine();
        System.out.println("What is the next word do you eant to add?");
        String name = vam.nextLine();
        System.out.println("Your Youtube channel name will be :" +nickname + " " + name);

        
   }
}