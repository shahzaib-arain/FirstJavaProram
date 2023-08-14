import java.util.Scanner;
import java.util.Random;
 class GuessGames {
    private int randomNumber;
    private int attempts;
    //Constructors...
    public GuessGames(int lowerBound, int upperBound) {
        Random random = new Random();
        this.randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        this.attempts = 0;
    }

    public String makeGuess(int playerGuess) {
        this.attempts++;

        if (playerGuess < this.randomNumber) {
            return "Your guess is too low. Try again.";
        } else if (playerGuess > this.randomNumber) {
            return "Your guess is too high. Try again.";
        } else {
            return "Congratulations! You've guessed the number " + this.randomNumber + " in " + this.attempts + " attempts.";
        }
    }
}

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerBound = 1;
        int upperBound = 100; // You can adjust the range as per your preference

        GuessGames game = new GuessGames(lowerBound, upperBound);

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");

        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();

            String result = game.makeGuess(playerGuess);
            System.out.println(result);

            if (result.contains("Congratulations")) {
                hasGuessedCorrectly = true;
            }
        }

        scanner.close();
    }
}
