// Project: Number Guessing Game
// Description: A game where the user guesses a randomly generated number.

import java.util.Random;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
            if (guess < number) System.out.println("Too low!");
            else if (guess > number) System.out.println("Too high!");
        } while (guess != number);
        System.out.println("You guessed it!");
    }
}