package com.udaya.quiz.service;

import com.udaya.quiz.model.Question;

import java.util.List;
import java.util.Scanner;

/**
 * Controls the quiz flow and score calculation.
 */
public class QuizService {

    private final Scanner scanner;

    public QuizService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startQuiz(String topic, List<Question> questions) {
        System.out.println("\n=================================");
        System.out.println("       " + topic.toUpperCase());
        System.out.println("=================================");

        int score = 0;

        for (Question question : questions) {
            question.display();

            char answer = readAnswer();

            if (question.isCorrect(answer)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }

        displayResult(score, questions.size());
    }

    private char readAnswer() {
        while (true) {
            System.out.print("Enter your answer (A/B/C/D): ");
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                char answer = Character.toUpperCase(input.charAt(0));

                if (answer >= 'A' && answer <= 'D') {
                    return answer;
                }
            }

            System.out.println("Please enter A, B, C or D.");
        }
    }

    private void displayResult(int score, int total) {
        double percentage = (score * 100.0) / total;

        System.out.println("\n------------- RESULT -------------");
        System.out.println("Score      : " + score + " / " + total);
        System.out.printf("Percentage : %.2f%%%n", percentage);

        if (score == total) {
            System.out.println("Performance: Excellent");
        } else if (score >= 7) {
            System.out.println("Performance: Good");
        } else if (score >= 5) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Needs Improvement");
        }

        System.out.println("----------------------------------");
    }
}
