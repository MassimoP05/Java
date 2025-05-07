import java.util.Scanner;

public class FloristPassword {
    public static void main(String[] args) {
        // Predefined usernames and passwords
        String user1 = "Rose";
        String pass1 = "Red";
        String user2 = "Violet";
        String pass2 = "Blue";

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Prompt for password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Boolean variables for validation
        boolean isUser1 = username.equals(user1);
        boolean isUser2 = username.equals(user2);
        boolean isPass1 = password.equals(pass1);
        boolean isPass2 = password.equals(pass2);

        // Logic for access control
        if ((isUser1 && isPass1) || (isUser2 && isPass2)) {
            System.out.println("Hello " + username + ", Access is granted.");
        } else if ((isUser1 && !isPass1) || (isUser2 && !isPass2)) {
            System.out.println("Hello " + username + ", Access is suspended.");
        } else {
            System.out.println("Access is denied.");
        }

        // Close the scanner
        scanner.close();
    }
}