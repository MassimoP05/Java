import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListColors {
    public static void main(String[] args) {
        // Step 1: Declare and populate the ArrayList
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Yellow");

        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt user to modify a colour
        System.out.print("Enter the index (0-3) of the colour you'd like to modify: ");
        int modifyIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the new colour to replace index " + modifyIndex + ": ");
        String newColour = scanner.nextLine();
        colours.set(modifyIndex, newColour);

        // Step 3: Prompt user to remove a colour
        System.out.print("Enter the index (0-" + (colours.size() - 1) + ") of the colour you'd like to remove: ");
        int removeIndex = scanner.nextInt();
        colours.remove(removeIndex);

        // Step 4: Print remaining colours using a for loop
        System.out.println("\nRemaining colours in the list:");
        for (int i = 0; i < colours.size(); i++) {
            System.out.println("Index " + i + ": " + colours.get(i));
        }

        scanner.close();
    }
}
