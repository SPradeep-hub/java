// Custom unchecked exception
import java.util.Scanner;

class InvalidScoreException extends RuntimeException {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class GradeCalculator{
   static char getGrade(int score) throws InvalidScoreException {
        if (score < 0) {
            throw new InvalidScoreException("Score cannot be negative: " + score);
        }
        
        if (score > 70) {
            return 'A';
        } else if (score >= 61) {
            return 'B';
        } else if (score >= 51) {
            return 'C';
        } else if (score >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Optional main method for testing
    public static void main(String[] args) throws InvalidScoreException {
       try{ // Test valid scores
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a score to get the grade: ");
        int score = sc.nextInt();
        System.out.println("Score: " + score + " -> Grade: " + getGrade(score));
        sc.close();
       }

        // Test negative score (will throw exception)
       catch (InvalidScoreException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
