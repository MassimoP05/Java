import java.util.Arrays;
import java.util.Scanner;

public class Week7Array2User {
    public static void main(String[] args) {
        // Step 1: Declare and initialise the original array
        int[] originalArray = {42, 17, 8, 33, 25};

        // Step 2: Create a copy of the original array
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

        // Step 3: Sort the copied array
        Arrays.sort(copiedArray);

        // Step 4: Display the sorted array
        System.out.print("Sorted Copied Array: ");
        for (int value : copiedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Step 5: Prompt user for a value to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int searchValue = scanner.nextInt();

        // Step 6: Use binarySearch to find the value
        int index = Arrays.binarySearch(copiedArray, searchValue);

        // Step 7: Display result
        if (index >= 0) {
            System.out.printf("Value %d found at index %d in the sorted array.\n", searchValue, index);
        } else {
            System.out.printf("Value %d not found in the array.\n", searchValue);
        }

        scanner.close();
    }
}
