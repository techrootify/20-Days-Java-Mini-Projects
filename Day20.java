// Project: Word Counter
// Description: Count the number of words, characters, and lines in a text file.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            int words = 0, lines = 0, chars = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines++;
                chars += line.length();
                words += line.split(" ").length;
            }
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);
            System.out.println("Characters: " + chars);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}