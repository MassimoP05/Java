import java.util.Scanner;

public class Assessment1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        Double total = 0.0, num1 = 0.0, num2 = 0.0;
        String op;

        System.out.println("Pick your first number");
        num1 = myInput.nextDouble();
        System.out.println("Pick your secound number");
        num2 = myInput.nextDouble();
        System.out.println("Pick an Operator (+, -, *, /)");
        op = myInput.next();
        myInput.close();
    
        if (op.equals("+")) {
            total = num1 + num2;
        } else if (op.equals("-")) {
            total = num1 - num2;
        } else if (op.equals("*")) {
            total = num1 * num2;
        } else if (op.equals("/")) {
            total = num1 / num2;
        } else {
            System.out.println("The operator given wasn't of the given options");
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + total);
    }
}