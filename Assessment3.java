import java.util.Scanner;
import java.util.Random;

public class Assessment3 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        Random random = new Random();

        int numRandom = random.nextInt(21);
        int guess = 100;
        System.out.println("Have a guess of the Random Number, it is between 1 and 20");
        guess = myInput.nextInt();
        
        while (guess != numRandom) {
            
            if (guess < numRandom) {
                System.out.println("The random number is bigger then choosen number, try again!");
            } else if (guess > numRandom) {
                System.out.println("The random number is smaller then choosen number, try again!");
            } else if (guess == numRandom) {
                System.out.println("Congrats you have selected the correct number");
                
            }
            guess = myInput.nextInt();
        }
        myInput.close();
        System.out.println("Congrats on guessing the correct number, the number was: " + numRandom);
    }
}