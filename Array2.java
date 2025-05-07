import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter 4 numbers
        System.out.println("Enter 4 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Ask the user for a number to search
        System.out.print("Enter a number to search for: ");
        int search = scanner.nextInt();

        // Search for the number
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                foundIndex = i;
                break;
            }
        }

        // Find the highest and lowest numbers
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int num : numbers) {
            if (num > highest) highest = num;
            if (num < lowest) lowest = num;
        }

        // Output the results
        System.out.print("Numbers in the array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);

        if (foundIndex != -1) {
            System.out.println("Number " + search + " found at index: " + foundIndex);
        } else {
            System.out.println("Number " + search + " not found in the array.");
        }

        scanner.close();
    }
}