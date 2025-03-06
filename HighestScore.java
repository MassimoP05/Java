import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        int classSize, i, studentNum = 0;
        Double grade, highScore = 0.0;

        System.out.println("How many students are in the class?");
        classSize = myInput.nextInt();

        for (i = 1; i <= classSize; i++){
            System.out.println("Enter the " + i + " person's grade");
            grade = myInput.nextDouble();
            myInput.close();

            if (grade > highScore) {
                highScore = grade;
                studentNum = i;

            }
        }
        System.out.println("Student " + studentNum + " has the highest grade: " + highScore);
        
    }
}
