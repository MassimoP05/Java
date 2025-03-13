import java.util.Scanner;
import java.util.Random;

public class pracQues4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner myInput = new Scanner(System.in);

        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int correctAnswer = num1 + num2;
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("What is " + num1 + " + " + num2 + "? ");

            // Check if the user entered an interger
            if (myInput.hasNextInt()) {
                int userAnswer = myInput.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Correct! Well Done!");
                    myInput.close();
                    return;
                } else {
                    attempts--;
                    if (attempts > 0) {
                        System.out.println("Incorrect. You have " + attempts + " attempt(s) left.");
                    } else {
                        System.out.println("Out of attempts! The correct answer was " + correctAnswer + ".");
                    }
                }
            } else {
                System.out.println("Invalid input. please enter a number.");
                myInput.next();
            }
        }
        myInput.close();
    }
}
