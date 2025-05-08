import java.util.ArrayList;
import java.util.Scanner;

public class Revision2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create ArrayList
        ArrayList<String> games = new ArrayList<>();

        // Add 3 games from user input
        System.out.println("Enter 3 game names:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Game " + (i + 1) + ": ");
            games.add(input.nextLine());
        }

        // Print a specific game by index
        System.out.println("Game at index 1: " + games.get(1));

        // Modify the game at index 2
        games.set(2, "Minecraft");

        // Remove the game at index 1
        games.remove(1);

        // Print the entire ArrayList
        System.out.println("\nRemaining games:");
        for (String game : games) {
            System.out.println("- " + game);
        }

        input.close();
    }
}
