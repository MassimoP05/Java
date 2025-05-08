import java.util.Scanner;

public class Revision3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for achieved marks
        System.out.print("Enter your marks for Assessment 1 (out of 25): ");
        double mark1 = input.nextDouble();

        System.out.print("Enter your marks for Assessment 2 (out of 45): ");
        double mark2 = input.nextDouble();

        // Call method to calculate overall percentage
        double overall = calculateOverallPercentage(mark1, mark2);

        // Output result
        System.out.printf("Your overall course percentage is: %.2f%%\n", overall);

        input.close();
    }

    // Method to calculate overall percentage
    public static double calculateOverallPercentage(double mark1, double mark2) {
        double percent1 = (mark1 / 25) * 0.35 * 100;
        double percent2 = (mark2 / 45) * 0.65 * 100;
        return percent1 + percent2;
    }
}
