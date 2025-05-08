

public class Driver {
    public static void main(String[] args) {

        Laptop defultLaptop = new Laptop();
        Laptop cusLaptop = new Laptop("MSI", 16, 3, true);

        System.out.println("Default Laptop:");
        System.out.println(defultLaptop);
        System.out.println("-----------------------------------------");
        System.out.println("Custom Laptop:");
        System.out.println(cusLaptop);  
    }
}
