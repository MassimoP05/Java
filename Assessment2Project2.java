import java.util.ArrayList;

public class Assessment2Project2 {
    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<>();
 
        namesList.add("Massimo");
        namesList.add("Ryan");
        namesList.add("Onur");
        namesList.add("Thomas");
        namesList.add("Rhoan");

        System.out.println("My name is: " + namesList.get(0));
        namesList.set(1, "Quandingus");
        namesList.remove(3);
        System.out.println("Everyone's names are: " + namesList);
    }
}