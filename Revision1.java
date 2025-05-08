import java.util.Arrays;
import java.util.Scanner;

public class Revision1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[5];

        // Get 5 ages from user
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Copy and sort
        int[] sortedAges = Arrays.copyOf(ages, ages.length);
        Arrays.sort(sortedAges);

        // Ask for age to search
        System.out.print("Enter an age to search: ");
        int search = input.nextInt();
        int index = Arrays.binarySearch(sortedAges, search);

        // Show search result
        if (index >= 0) {
            System.out.println("Found " + search + " at index " + index);
        } else {
            System.out.println(search + " not found");
        }

        // Print both arrays
        System.out.println("\nOriginal | Sorted");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("   " + ages[i] + "     |   " + sortedAges[i]);
        }

        input.close();
    }
}
