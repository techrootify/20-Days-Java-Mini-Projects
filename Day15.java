// Project: Hangman Game
// Description: A word-guessing game where the player guesses letters.

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        String[] words = {"java", "programming", "computer", "algorithm", "developer"};
        String word = words[(int) (Math.random() * words.length)];
        char[] guessedLetters = new char[word.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        int attempts = 6;
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.println("Word: " + String.valueOf(guessedLetters));
            System.out.println("Attempts left: " + attempts);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedLetters[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attempts--;
            }

            if (String.valueOf(guessedLetters).equals(word)) {
                System.out.println("Congratulations! You guessed the word: " + word);
                return;
            }
        }

        System.out.println("You ran out of attempts! The word was: " + word);
    }
}