import java.util.Scanner;

public class LoopCalc {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        int i, count;
        Double total = 0.0, num;
        
        System.out.println("How many numbers do you wanna count? ");
        count = myInput.nextInt();

        for (i = 1; i <= count; i++) { // Checking what number it is upto in the count
            System.out.print("Enter number " + i + ": "); // Prints out the count number
            num = myInput.nextDouble(); // makes num store the information of what number is inputed
            total += num; // (total = total + num) which adds the number to the total
            System.out.println("Running total: " + total); // Prints the total 
        }

        System.out.println("Final total: " + total); // Prints the final total after the for statment is finished
        myInput.close();

    }
}
