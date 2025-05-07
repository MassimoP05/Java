public class WeatherArray {
    public static void main(String[] args) {
        // Step 1: Create a 2D array for temperatures (7 days × 3 times)
        int[][] temperatures = {
            {15, 22, 18}, // Monday
            {16, 24, 19}, // Tuesday
            {14, 20, 17}, // Wednesday
            {13, 23, 18}, // Thursday
            {17, 25, 21}, // Friday
            {18, 26, 22}, // Saturday
            {16, 24, 20}  // Sunday
        };

        // Step 2: Create a simple array for days of the week
        String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        // Step 3: Create a simple array for time labels
        String[] times = {
            "Morning", "Afternoon", "Evening"
        };

        // Step 4: Use nested for loops to display the data
        System.out.println("Weekly Temperature Report:\n");

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(days[i] + ":");

            for (int j = 0; j < temperatures[i].length; j++) {
                System.out.println("  " + times[j] + " - " + temperatures[i][j] + "°C");
            }

            System.out.println(); // Add space between days
        }
    }
}
