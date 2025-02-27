import java.util.Scanner;
public class Names {

    public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    
    String firstName, lastName, fullName;
    
    System.out.println("What's your first name?");
    firstName = myInput.next();
    System.out.println("What's your last name");
    lastName = myInput.next();

    fullName = firstName + " " + lastName;

    System.out.println("hello, my name is " + fullName + ".");
    
    }
}