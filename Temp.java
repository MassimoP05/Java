import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("What is the temp (in fahrenheit)?");
        fahrenheit = myInput.nextDouble();
        
        celsius = ((5.0/9.0) * (fahrenheit - 32));

        System.out.println(celsius);
        myInput.close();
    }
}