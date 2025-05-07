import java.util.Scanner;

public class TempConverterMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Call the printTemperature() method
        printTemperature(fahrenheit);

        input.close();
    }

    // Method 1: Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        double celsius = (f - 32) * 5 / 9;
        return celsius;
    }

    // Method 2: Print both Fahrenheit and Celsius
    public static void printTemperature(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit); // Call Method 1
        System.out.printf("F: %.2f\n", fahrenheit);
        System.out.printf("C: %.2f\n", celsius);
    }
}
