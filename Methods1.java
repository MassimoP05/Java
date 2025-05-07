import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for three integers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        // Call the method and store the result
        int total = sumOfNumbers(num1, num2, num3);

        // Print the result
        System.out.println("Sum of the three numbers is: " + total);

        input.close();
    }

    // Method that returns the sum of three integers
    public static int sumOfNumbers(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }
}
