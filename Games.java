
    public class Games {
    // Instance variables
    private String name;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public Games() {
        this.name = "Minecraft";
        this.price = 39.95;
        this.isAvailable = true;
    }

    // Constructor with all parameters
    public Games(String name, double price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // toString method
    public String toString() {
        return "Name: " + name + "\nPrice: $" + price + "\nAvailable: " + isAvailable;
    }
}
