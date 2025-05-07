import java.util.Scanner;

public class MovieTickets {
    // This program calculates the price of a movie ticket based on user input.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user details
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobile = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Enter movie name: ");
        String movieName = input.nextLine();

        System.out.print("Enter movie time: ");
        String movieTime = input.nextLine();

        // Ask about VIP and Gold Class
        System.out.print("Are you a VIP? (true/false): ");
        boolean isVIP = input.nextBoolean();

        System.out.print("Is this a Gold Class seat? (true/false): ");
        boolean isGoldClassSeat = input.nextBoolean();

        // Calculate ticket price
        double ticketPrice = calculateBasePrice(age);
        ticketPrice = applyVIPDiscount(ticketPrice, isVIP);
        ticketPrice = applyGoldClassAddOn(ticketPrice, isGoldClassSeat);

        // Print final ticket details
        printTicket(name, mobile, age, movieName, movieTime, ticketPrice);

        input.close();
    }

    // Method 1: Calculate base price based on age
    public static double calculateBasePrice(int age) {
        if (age < 18) {
            return 10.0;
        } else if (age <= 65) {
            return 20.0;
        } else {
            return 15.0;
        }
    }

    // Method 2: Apply VIP discount
    public static double applyVIPDiscount(double price, boolean isVIP) {
        if (isVIP) {
            return price * 0.80; // 20% off
        }
        return price;
    }

    // Method 3: Apply Gold Class surcharge
    public static double applyGoldClassAddOn(double price, boolean isGoldClass) {
        if (isGoldClass) {
            return price * 1.50; // Add 50%
        }
        return price;
    }

    // Method 4: Print final ticket details
    public static void printTicket(String name, String mobile, int age, String movie, String time, double price) {
        System.out.println("\n--- Movie Ticket ---");
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Age: " + age);
        System.out.println("Movie: " + movie);
        System.out.println("Time: " + time);
        System.out.printf("Final Ticket Price: $%.2f\n", price);
    }
}
