import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        double[] heights = new double[5];

        for (int i = 0; i < heights.length; i++) {
            System.out.println("Enter Height For Person " + (i + 1) + ": ");
            heights[i] = myInput.nextDouble();
            
        }

        System.out.println("The heights entered are; ");
        for (double height : heights) {
            System.out.print(height + " ");
        }

       


    }
}