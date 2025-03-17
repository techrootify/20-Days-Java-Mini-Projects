// Project: Password Generator
// Description: Generate a random password of a specified length.

import java.util.Random;

public class Day9 {
    public static void main(String[] args) {
        int length = 10; // Password length
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        System.out.println("Generated Password: " + password.toString());
    }
}