public class Store {

    public static void main(String[] args) {
        String storeName = "Fuck The Vegans", 
        address = "123 vegans get fucked", taxInvoice = "TAX INVOICE", 
        item1 = "Meat", item2 = "Beans", item3 = "Paper", time = "1:32pm", 
        day = "Tuesday";

        int contact = 98765432;

        double price1 = 13.50, price2 = 6.60, price3 = 2.50, totalprice, gst, totalgst;

        totalprice = price1 + price2 + price3;
        gst = totalprice * 0.10;
        totalgst = totalprice + gst;

        System.out.println(storeName);
        System.out.println(address);
        System.out.println(contact);
        System.out.println("---------------------------------------------");
        System.out.println(taxInvoice);
        System.out.println(day + " " + time);
        System.out.println("Item 1: " + item1 + " " + "Cost: $" + price1);
        System.out.println("Item 2: " + item2 + " " + "Cost: $" + price2);
        System.out.println("Item 3: " + item3 + " " + "Cost: $" + price3);
        System.out.println("Total Cost: $" + totalprice);
        System.out.println("GST: $" + gst);
        System.out.println(totalgst);

        

    }
}
        