import java.util.Scanner;

public class pracQues3 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        int num;
        int i = 0;
        int total;
        System.out.println("Pick a number to do a multiplication table of:");
        num = myInput.nextInt();
        myInput.close();

        
        while (i <= 10) {

            total = num * i;
            if (total == 21 || total == 32){
                System.out.println("You have triggered a forbidden number!");
                break;
            }
            System.out.println(num + " X " + i + " = " + (total));
            i++;
        }
        
    }
}
