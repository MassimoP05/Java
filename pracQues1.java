import java.util.Scanner;

public class pracQues1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in); 

        String colour;
        
        System.out.println("Select a colour: ");
        colour = myInput.next().toLowerCase();
        
        if (colour.equals("blue")) {
            System.out.println("You have won!");
        } else if (colour.equals("red")) {
            System.out.println("You have come Second!");
        } else if (colour.equals("green")) {
            System.out.println("You have come Third!"); 
        } else if (colour.equals("yellow")) {
            System.out.println("You have come Fourth!");
        } else {
            System.out.println("Better luck next time");
        }
        myInput.close();
    
    
    }
}
