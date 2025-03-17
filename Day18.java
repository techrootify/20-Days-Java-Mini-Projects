// Project: Countdown Timer
// Description: A timer that counts down from a specified time.

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown time in seconds: ");
        int time = scanner.nextInt();

        while (time > 0) {
            System.out.println("Time left: " + time + " seconds");
            Thread.sleep(1000); // Wait for 1 second
            time--;
        }

        System.out.println("Time's up!");
    }
}