import java.util.Scanner;

public class NameAge {

    public static void main(String[] args) {
    
        Scanner myInput = new Scanner(System.in);

        String Name1, Name2, Name3, Name4, Name5;
        int Age1, Age2, Age3, Age4, Age5;

        System.out.println("First Person's Name: ");
        Name1 = myInput.nextLine();
        System.out.println("What is " + Name1 + "'s Age: " );
        Age1 = myInput.nextInt();
        myInput.nextLine();
        
        System.out.println("Second Person's Name: ");
        Name2 = myInput.nextLine();
        System.out.println("What is " + Name2 + "'s Age: " );
        Age2 = myInput.nextInt();
        myInput.nextLine();

        System.out.println("Third Person's Name: ");
        Name3 = myInput.nextLine();
        System.out.println("What is " + Name3 + "'s Age: " );
        Age3 = myInput.nextInt();
        myInput.nextLine();

        System.out.println("Forth Person's Name: ");
        Name4 = myInput.nextLine();
        System.out.println("What is " + Name4 + "'s Age: " );
        Age4 = myInput.nextInt();
        myInput.nextLine();

        System.out.println("Fifth Person's Name: ");
        Name5 = myInput.nextLine();
        System.out.println("What is " + Name5 + "'s Age: " );
        Age5 = myInput.nextInt();
        myInput.nextLine();

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