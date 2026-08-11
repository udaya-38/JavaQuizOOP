package com.udaya.quiz;

import com.udaya.quiz.data.QuestionBank;
import com.udaya.quiz.model.Question;
import com.udaya.quiz.service.AuthService;
import com.udaya.quiz.service.QuizService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AuthService authService = new AuthService();
        QuizService quizService = new QuizService(scanner);

        System.out.println("=================================");
        System.out.println("       JAVA QUIZ MANAGEMENT");
        System.out.println("=================================");

        if (!authService.login(scanner)) {
            System.out.println("Access Denied. Program terminated.");
            scanner.close();
            return;
        }

        boolean running = true;

        while (running) {
            System.out.println("\nSelect Quiz Topic");
            System.out.println("1. Java Basic Questions");
            System.out.println("2. Logical Questions");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" -> {
                    List<Question> questions = QuestionBank.getJavaBasicQuestions();
                    quizService.startQuiz("Java Basic Questions", questions);
                }
                case "2" -> {
                    List<Question> questions = QuestionBank.getLogicalQuestions();
                    quizService.startQuiz("Logical Questions", questions);
                }
                case "3" -> {
                    System.out.println("\nThanks for using Java Quiz Management!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
