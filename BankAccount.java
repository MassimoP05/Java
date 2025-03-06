import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        Double balance, deposit, withdraw;

        // Gets the starting balance 
        System.out.println("Enter Balance Amount:");
        balance = myInput.nextDouble();

        // Deposite Amount and adds to balance
        System.out.println("Enter A Deposit Amount:");
        deposit = myInput.nextDouble();
        balance += deposit;
        System.out.println("Your Total After The Deposit Is: " + balance);


        // While balance is bigger then 0 it allows you to withdraw an amount of money
        while (balance >= 0) {
            System.out.println("Enter A Withdraw Amount: ");
            withdraw = myInput.nextDouble();
            
            if (withdraw > balance) { // Checks if withdraw amount is bigger then balance
                System.out.println("Sorry, withdrawal disallowed as it would overspend your account"); 
            } else { // Otherwise if it is under balance
                balance -= withdraw; //balance - withdraw = balance
                System.out.println("Congratulations, your closing balance is $" + balance);
            }

        }

        System.out.println("Poor you, your closing balance is $0.");
        myInput.close();

    }
}
