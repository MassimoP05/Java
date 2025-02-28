import java.util.Scanner;

public class BookDisCom {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in); 

        Double salary, basesalary = 200.00, weeklysales;
        String name;

        System.out.println("Representive's Name: ");
        name = myInput.nextLine();
        

        System.out.println("Weeks Sales: ");
        weeklysales = myInput.nextDouble();

        salary = weeklysales + basesalary;

        if (weeklysales >= 200.01) {
            salary = weeklysales * 0.05;
            System.out.println("The 5% Commission was added due to it being over $200");
        } else {
            System.out.println("The 5% Commission wasn't added due to not not being over $200");
        }

        if (weeklysales > 2000.00) {
            salary = salary + 50;
            System.out.println("The $50 bonus was added as the target of $2000 was reached");
        } else {
            System.out.println("The $50 bonus was not added as the target of $2000 was not reached");
        }

        System.out.println("Reps Name: " + name);
        System.out.println("Salary: " + salary);

        myInput.close();
    }
}