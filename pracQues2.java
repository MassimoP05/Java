import java.util.Scanner;

public class pracQues2 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        int limit;

        System.out.println("Pick you Limit: ");
        limit = myInput.nextInt();

        for (int i = 1; i < limit; i += 3) {
            System.out.println(i);
        }
        myInput.close();
    }
}