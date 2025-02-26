import java.util.Scanner;

public class CalcInput {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        int num1, num2, num3, num4, total;

        System.out.println("First number: ");
        num1 = myInput.nextInt();

        System.out.println("Second number: ");
        num2 = myInput.nextInt();

        System.out.println("Third number: ");
        num3 = myInput.nextInt();

        System.out.println("Forth number: ");
        num4 = myInput.nextInt();

        total = num1 + num2 + num3 + num4;
        
        System.out.println("Total: " +total);
    }

}