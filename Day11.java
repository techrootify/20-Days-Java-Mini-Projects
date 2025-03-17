// Project: Currency Converter
// Description: Convert between different currencies using predefined exchange rates.

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount in USD: ");
            double usd = scanner.nextDouble();
            double inr = usd * 75.0; // 1 USD = 75 INR
            System.out.println("Amount in INR: " + inr);
        } else if (choice == 2) {
            System.out.print("Enter amount in INR: ");
            double inr = scanner.nextDouble();
            double usd = inr / 75.0; // 1 INR = 0.013 USD
            System.out.println("Amount in USD: " + usd);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}