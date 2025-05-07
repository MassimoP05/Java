import java.util.Scanner;

public class IdentifyIntArray {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        double[] num = new double[4];
        int searchNum, foundIndex;

        // Step 1: Get 4 numbers from user
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            num[i] = myInput.nextDouble();
        }

        // Step 2: Ask user for a number to search
        System.out.println("Enter a number to search for: ");
        searchNum = myInput.nextInt(); 
        foundIndex = -1;


    }
}