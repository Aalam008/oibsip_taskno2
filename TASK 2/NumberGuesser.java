import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;  
        int upperBound = 100; 
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 10; 

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess < lowerBound || playerGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
                continue;
            }

            if (playerGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                break;
            }
        }

        if (attempts >= maxAttempts) {
            System.out.println("Sorry, you've used up all your attempts. The correct number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}
