import java.util.Scanner;

public class Infringement {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        Double cost, speed;
        int demerit, suspension;
        String zone;

        System.out.println("How much did you exceed the speed limit by (km/h)? ");
        speed = myInput.nextDouble();

        if (speed < 10 ) {
            cost = 231.0; 
            demerit = 1; 
            suspension = 0;
        } else if (speed >= 10 && speed <= 24) {
            System.out.println("Was it a 110km/h zone?");
            zone = myInput.nextLine();
            myInput.nextLine(); 
        }
    }
}