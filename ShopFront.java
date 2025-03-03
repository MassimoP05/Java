import java.util.Scanner;

public class ShopFront {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        String itemFood;

        int itemCost, contact;
        Double total = 0.0, quantity = 0.0;


        System.out.println("WELCOME TO SHOPFRONT!");
        System.out.println("ITEMS ON IN STORE TODAYchciken");
        System.out.println("-------------------------------------");
        System.out.println("Beef        $10 p/kg");
        System.out.println("Chicken     $8 p/kg");
        System.out.println("Beans       $5 p/kg");
        System.out.println("Carrots     $6 p/kg");
        System.out.println("Spinach     $3 p/kg");
        System.out.println("WHAT WOULD YOU LIKE TO BUY TODAY?");
        itemFood = myInput.next().toLowerCase();
        System.out.println("-------------------------------------");
        System.out.println("How many kg are you buying?");
        quantity = myInput.nextDouble();
        System.out.println("What is your best contact number?");
        contact = myInput.nextInt();

        if (itemFood.equals("beef")) {
            itemCost = 10;
            total = itemCost * quantity;
        } else if (itemFood.equals("chicken")) {
            itemCost = 8;
            total = itemCost * quantity;
        
        } else if (itemFood.equals("beans")) {
            itemCost = 5;
            total = itemCost * quantity;
        } else if (itemFood.equals("carrots")) {
            itemCost = 6;
            total = itemCost * quantity;
        }else if (itemFood.equals("spinach")) {
            itemCost = 3;
            total = itemCost * quantity;
        } 
        System.out.println("Your total will be " + total);
        System.out.println("Your contact number for the tax invoice is +61 " + contact);
    }


    
}