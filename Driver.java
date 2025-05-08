

public class Driver {
    public static void main(String[] args) {
        // Object with default constructor
        Games defaultGame = new Games();

        // Object with values passed through
        Games customGame = new Games("FIFA 24", 89.99, false);

        // Print both using toString()
        System.out.println("Default Game:");
        System.out.println(defaultGame);

        System.out.println("\nCustom Game:");
        System.out.println(customGame);
    }
}
