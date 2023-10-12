import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between " + minRange + " and " + maxRange + ".");
        
        int guess;
        int attempts = 0;
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        } while (guess != secretNumber);
        
        scanner.close();
    }
}
