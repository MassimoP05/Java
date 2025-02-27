import java.util.Scanner;

public class InputDate {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        String day, month;
        int date, year;

        System.out.println("What day is it?");
        day = myInput.next();

        System.out.println("What month is it?");
        month = myInput.next();

        System.out.println("What is the date today?");
        date = myInput.nextInt();

        System.out.println("What year is it?");
        year = myInput.nextInt();

        System.out.println("American Format: " + day + ", " + month + ", " + date + ", " + year);
        System.out.println("European Format: " + day + ", " + date + ", " + month + ", " + year);
        System.out.println("Japanese Format: " + year + ", " + month + ", " + date + ", " + day);
        
        myInput.close();
        
    }
}