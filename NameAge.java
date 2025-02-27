import java.util.Scanner;

public class NameAge {

    public static void main(String[] args) {
    
        Scanner myInput = new Scanner(System.in);

        String Name1, Name2, Name3, Name4, Name5;
        int Age1, Age2, Age3, Age4, Age5;

        System.out.println("First Person's First Name: ");
        Name1 = myInput.nextLine();
        System.out.println("What is " + Name1 + "'s Age: " );
        Age1 = myInput.nextInt();
        
        System.out.println("Second Person's First Name: ");
        Name2 = myInput.next();
        System.out.println("What is " + Name2 + "'s Age: " );
        Age2 = myInput.nextInt();

        System.out.println("Third Person's First Name: ");
        Name3 = myInput.next();
        System.out.println("What is " + Name3 + "'s Age: " );
        Age3 = myInput.nextInt();

        System.out.println("Forth Person's First Name: ");
        Name4 = myInput.next();
        System.out.println("What is " + Name4 + "'s Age: " );
        Age4 = myInput.nextInt();

        System.out.println("Fifth Person's First Name: ");
        Name5 = myInput.next();
        System.out.println("What is " + Name5 + "'s Age: " );
        Age5 = myInput.nextInt();

        System.out.println("-------------------------------------------------");

        System.out.println("Person 1:\nName: " + Name1 + "\nAge: " + Age1);
        System.out.println(" ");
        System.out.println("Person 2:\nName: " + Name2 + "\nAge: " + Age2);
        System.out.println(" ");
        System.out.println("Person 3:\nName: " + Name3 + "\nAge: " + Age3);
        System.out.println(" ");
        System.out.println("Person 4:\nName: " + Name4 + "\nAge: " + Age4);
        System.out.println(" ");
        System.out.println("Person 5:\nName: " + Name5 + "\nAge: " + Age5);
        System.out.println(" ");

        myInput.close();
    }
}