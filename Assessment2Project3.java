import java.util.Scanner;

public class Assessment2Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tScore = 0;
        double oScore = 0;

        
        // Game 1
        System.out.println("Game 1");
        System.out.print("Enter your team's score: ");
        tScore = scanner.nextDouble();
        System.out.print("Enter the opposition's score: ");
        oScore = scanner.nextDouble();

        double g1Percent = percentage(tScore, oScore);
        System.out.printf("Your team's percentage on scoring after Game 2 was: %.1f%%\n", g1Percent);
        // Game 2
        System.out.println("Game 2");
        System.out.print("Enter your team's score: ");
        tScore = scanner.nextDouble();
        System.out.print("Enter the opposition's score: ");
        oScore = scanner.nextDouble();

        double g2Percent = percentage(tScore, oScore);
        System.out.printf("Your team's percentage on scoring after Game 2 was: %.1f%%\n", g2Percent);

        scanner.close();
    }

    public static double percentage(double tScoreP, double oScoreP) {
        return (tScoreP / oScoreP) * 100;
    }
}