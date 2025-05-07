import java.util.Scanner;

public class MethodsGSTCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get item name and cost from user
        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the cost of the item: ");
        double cost = input.nextDouble();

        // Call gstCalculator method
        double gstAmount = gstCalculator(itemName, cost);

        // Display the GST
        System.out.printf("The GST for %s is: $%.2f\n", itemName, gstAmount);

        input.close();
    }

    // Method to calculate and return GST
    public static double gstCalculator(String item, double cost) {
        double gst = cost * 0.10; // 10% GST
        return gst;
    }
}
