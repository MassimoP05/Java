import java.util.Scanner;

public class ParraArrayExample {
    public static void main(String[] args) {
        // Step 1: Declare parallel arrays
        int[] ages = new int[3];
        String[] names = new String[3];

        Scanner scanner = new Scanner(System.in);

        // Step 2: Populate both arrays with user input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        }

        // Step 3: Display contents showing the relationship between name and age
        System.out.println("\n--- Name and Age List ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + names[i] + " | Age: " + ages[i]);
        }

        scanner.close();
    }
}
