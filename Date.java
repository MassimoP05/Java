public class Date {

    public static void main(String[] args) {
        String day = "Friday ", month = "February ";
        int date = 21, year = 2025;

        System.out.println("American Format: " + day + month + date + " " + year);
        System.out.println("European Format: " + day + date + " " + month + year);
        System.out.println("Japanese Format: " + year + " " + month + date + " " + day);;
    }

}