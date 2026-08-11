package com.udaya.quiz.service;

import java.util.Scanner;

/**
 * Handles authentication separately from quiz logic.
 * Demonstrates separation of responsibility.
 */
public class AuthService {

    private static final String USERNAME = "Karim";
    private static final String PASSWORD = "Karim123@#";

    public boolean login(Scanner scanner) {
        System.out.print("Enter Username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            System.out.println("Access Accepted.");
            return true;
        }

        return false;
    }
}
