import java.util.Scanner;

public class Assessment2 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        int numStart, numEnd, numInter;

        System.out.println("Pick Starting Number");
        numStart = myInput.nextInt();

        System.out.println("Pick Ending Number");
        numEnd = myInput.nextInt();
        
        System.out.println("Pick Interval to count by");
        numInter = myInput.nextInt();

        for (int i = numStart; i < numEnd; i += numInter) {
            System.out.println(i);
        }
        myInput.close();
    }
}