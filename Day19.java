// Project: URL Shortener
// Description: A simple program to shorten URLs (basic implementation).

import java.util.HashMap;
import java.util.Scanner;

public class Day19 {
    private static HashMap<String, String> urlMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Shorten URL");
            System.out.println("2. View URLs");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter original URL: ");
                    String originalUrl = scanner.nextLine();
                    String shortUrl = "https://short.url/" + (urlMap.size() + 1);
                    urlMap.put(shortUrl, originalUrl);
                    System.out.println("Shortened URL: " + shortUrl);
                    break;
                case 2:
                    System.out.println("URLs:");
                    for (String key : urlMap.keySet()) {
                        System.out.println(key + " -> " + urlMap.get(key));
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