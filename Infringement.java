import java.util.Scanner;

public class Infringement {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        Double speed;
        int demerit = 0, suspension = 0, fine = 0;
        String zone;

        System.out.println("Enter the exceeding speed limit (km/h):");
        speed = myInput.nextDouble();

        System.out.println("was it in a 110 km/h zone (yes/no):");
        zone = myInput.next().toLowerCase(); // .toLowerCase makes the answer lowercase

        if (zone.equals("yes") && speed >= 20 && speed <= 24) { // .equals() checks if the thing in the brackets is indeed the variable
            fine = 370;
            suspension = 3; 
        } else if (speed < 9) {
            fine = 231;
            demerit = 1;
        } else if (speed >= 10 && speed<= 24 ) {
            fine = 370;
            demerit = 3;
        } else if (speed >= 25 && speed <= 29) {
            fine = 509;
            suspension = 3;
        } else if (speed >= 30 && speed <= 34) {
            fine = 601;
            suspension = 3;
        } else if (speed >= 35 && speed <= 39) {
            fine = 693;
            suspension = 6;
        } else if (speed >= 40 && speed <= 44) {
            fine = 786;
            suspension = 6;
        } else if (speed >= 45) {
            fine = 925;
            suspension = 12;
        }

        System.out.println("You were going " + speed + " over the legal speed limit.");
        System.out.println("The fine you will recieve is $ " + fine);
        System.out.println("The number of demerit points you will recieve is " + demerit);
        System.out.println("The suspension you will recieve is " + suspension + " months");

        myInput.close();

    }   
}