// Project: File Encryption and Decryption
// Description: Encrypt and decrypt text files using a simple algorithm.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Encrypt File");
        System.out.println("2. Decrypt File");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        if (choice == 1) {
            encryptFile(fileName);
        } else if (choice == 2) {
            decryptFile(fileName);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private static void encryptFile(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        StringBuilder content = new StringBuilder();

        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();

        String encryptedContent = encrypt(content.toString());
        FileWriter writer = new FileWriter(fileName);
        writer.write(encryptedContent);
        writer.close();

        System.out.println("File encrypted successfully!");
    }

    private static void decryptFile(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        StringBuilder content = new StringBuilder();

        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();

        String decryptedContent = decrypt(content.toString());
        FileWriter writer = new FileWriter(fileName);
        writer.write(decryptedContent);
        writer.close();

        System.out.println("File decrypted successfully!");
    }

    private static String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            result.append((char) (c + 1));
        }
        return result.toString();
    }

    private static String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            result.append((char) (c - 1));
        }
        return result.toString();
    }
}