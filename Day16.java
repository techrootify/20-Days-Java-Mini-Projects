// Project: Simple Inventory System
// Description: Manage a small inventory of products.

import java.util.HashMap;
import java.util.Scanner;

public class Day16 {
    private static HashMap<String, Integer> inventory = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. View Inventory");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String product = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.put(product, quantity);
                    break;
                case 2:
                    System.out.println("Inventory:");
                    for (String key : inventory.keySet()) {
                        System.out.println(key + ": " + inventory.get(key));
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}