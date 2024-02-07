import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int LOWER_LIMIT = 1;
        final int UPPER_LIMIT = 100;
        final int ATTEMPTS_LIMIT = 5;
        int score = 0;
        
        System.out.println("Welcome to Guess the Number Game!");
        
        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(UPPER_LIMIT - LOWER_LIMIT + 1) + LOWER_LIMIT;
            System.out.println("I'm thinking of a number between " + LOWER_LIMIT + " and " + UPPER_LIMIT);
            
            int attemptsTaken = 0;
            boolean guessedCorrectly = false;
            
            while (attemptsTaken < ATTEMPTS_LIMIT) {
                System.out.print("Take a guess: ");
                int guess = scanner.nextInt();
                attemptsTaken++;
                
                if (guess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else if (guess > targetNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attemptsTaken + " attempts.");
                    score++;
                    guessedCorrectly = true;
                    break;
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The number was " + targetNumber);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }
        
        System.out.println("Your final score: " + score);
        scanner.close();
    }
}
