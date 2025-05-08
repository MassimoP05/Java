import java.util.Arrays;
import java.util.Scanner;

public class Assessment2Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] age = new int[5];

        System.out.println("Enter 5 numbers please:");
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            age[i] = scanner.nextInt();
        }

        int[] sortedAge = Arrays.copyOf(age, age.length);
        Arrays.sort(sortedAge);

        System.out.print("Enter a number to find in the array: ");
        int sValue = scanner.nextInt();
        int data = Arrays.binarySearch(sortedAge, sValue);

        if (data >= 0) {
            System.out.println("Number " + sValue+ " was found at index " + data + " in the sorted array.");
        } else {
            System.out.println("Number " + sValue + " was not found in the sorted array.");
        }

        System.out.println("Original Array and Sorted Array :");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Age[" + i + "] = " + age[i] + " || Sorted Age[" + i + "] = " + sortedAge[i]);
        }
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}