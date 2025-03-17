// Project: Quiz Application
// Description: A simple quiz with multiple-choice questions.

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'Romeo and Juliet'?"
        };
        String[] answers = {"Paris", "Mars", "William Shakespeare"};
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + answers[i]);
            }
        }

        System.out.println("Quiz over! Your score: " + score + "/" + questions.length);
    }
}