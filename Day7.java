// Project: Rock-Paper-Scissors Game
// Description: A simple game of Rock-Paper-Scissors against the computer.

import java.util.Random;
import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};

        while (true) {
            System.out.println("\n1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int userChoice = scanner.nextInt();

            if (userChoice == 4) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice!");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;
            System.out.println("You chose: " + choices[userChoice - 1]);
            System.out.println("Computer chose: " + choices[computerChoice - 1]);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }
}