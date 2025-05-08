
public class Laptop {
    private String brand;
    private int size;
    private double weight;
    private boolean isLeased;

    public Laptop() {
        this.brand = "HP";
        this.size = 14;
        this.weight = 1.45;
        this.isLeased = true;
    }

    public Laptop(String brand, int size, double weight, boolean isLeased) {
        this.brand = brand;
        this.size = size;
        this.weight = weight;
        this.isLeased = isLeased;
    }

    // toString methodp
    public String toString() {
        return "Brand: " + brand + "\n" +
               "Size (inches): " + size + "\n" +
               "Weight (kg): " + weight + "\n" +
               "Is Leased: " + isLeased;
    }
}
