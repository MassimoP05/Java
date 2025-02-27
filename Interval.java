import java.util.Scanner;

public class Interval {
    
    public static void main(String[] args) {
    
        Scanner myInput = new Scanner(System.in);
        Double lowerLimit, upperLimit, value;

        System.out.println("What will the lower limit be?");
        lowerLimit = myInput.nextDouble();

        System.out.println("What will the upper limit be?");
        upperLimit = myInput.nextDouble();

        System.out.println("What will the value to check be?");
        value = myInput.nextDouble();

        if (value > lowerLimit && value < upperLimit) {
            System.out.println("The value of " + value + " is within the range of " + lowerLimit + " and " + upperLimit);
        } else {
            System.out.println("The value of " + value + " is not within the range of " + lowerLimit + " and " + upperLimit);
        }
        myInput.close();
    }
}