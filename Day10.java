// Project: Simple Chatbot
// Description: A basic chatbot that responds to user input.

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hi! How can I help you today?");
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            } else if (input.contains("how are you")) {
                System.out.println("Chatbot: I'm just a bot, but thanks for asking!");
            } else if (input.contains("name")) {
                System.out.println("Chatbot: I'm a simple chatbot.");
            } else {
                System.out.println("Chatbot: I'm not sure how to respond to that.");
            }
        }
    }
}