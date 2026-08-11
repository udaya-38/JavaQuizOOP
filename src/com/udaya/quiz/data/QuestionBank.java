package com.udaya.quiz.data;

import com.udaya.quiz.model.MCQQuestion;
import com.udaya.quiz.model.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores quiz questions separately from quiz execution logic.
 */
public final class QuestionBank {

    private QuestionBank() {
        // Utility class - no objects required.
    }

    public static List<Question> getJavaBasicQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new MCQQuestion(
                1,
                "Java is a __ language.",
                new String[]{"A) Low-level", "B) Machine-level", "C) High-level", "D) Assembly-level"},
                'C'));

        questions.add(new MCQQuestion(
                2,
                "Which component makes Java platform-independent?",
                new String[]{"A) JDK", "B) JRE", "C) JVM", "D) Compiler"},
                'C'));

        questions.add(new MCQQuestion(
                3,
                "Which of the following is not a Java data type?",
                new String[]{"A) int", "B) float", "C) boolean", "D) real"},
                'D'));

        questions.add(new MCQQuestion(
                4,
                "Which keyword is used to create an object in Java?",
                new String[]{"A) class", "B) object", "C) new", "D) create"},
                'C'));

        questions.add(new MCQQuestion(
                5,
                "Which method is the entry point of a Java program?",
                new String[]{"A) start()", "B) run()", "C) main()", "D) init()"},
                'C'));

        questions.add(new MCQQuestion(
                6,
                "What does == compare when used with object references?",
                new String[]{"A) Object content", "B) References", "C) Data type", "D) Methods"},
                'B'));

        questions.add(new MCQQuestion(
                7,
                "Which of the following is NOT an OOP principle?",
                new String[]{"A) Inheritance", "B) Encapsulation", "C) Compilation", "D) Polymorphism"},
                'C'));

        questions.add(new MCQQuestion(
                8,
                "Which keyword is used to inherit a class in Java?",
                new String[]{"A) implement", "B) inherits", "C) extends", "D) super"},
                'C'));

        questions.add(new MCQQuestion(
                9,
                "Which data type stores true/false values?",
                new String[]{"A) int", "B) char", "C) boolean", "D) String"},
                'C'));

        questions.add(new MCQQuestion(
                10,
                "Which access modifier allows access from anywhere?",
                new String[]{"A) private", "B) protected", "C) default", "D) public"},
                'D'));

        return questions;
    }

    public static List<Question> getLogicalQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new MCQQuestion(
                1,
                "How many times will a loop run if i = 0 and condition is i < 5?",
                new String[]{"A) 4", "B) 5", "C) 6", "D) Infinite"},
                'B'));

        questions.add(new MCQQuestion(
                2,
                "What is the index of the first element in a Java array?",
                new String[]{"A) 1", "B) -1", "C) 0", "D) Depends on size"},
                'C'));

        questions.add(new MCQQuestion(
                3,
                "Which block executes when an if condition is false?",
                new String[]{"A) if", "B) else", "C) break", "D) continue"},
                'B'));

        questions.add(new MCQQuestion(
                4,
                "Which keyword stops a loop completely?",
                new String[]{"A) continue", "B) stop", "C) break", "D) exit"},
                'C'));

        questions.add(new MCQQuestion(
                5,
                "Which keyword skips the current iteration of a loop?",
                new String[]{"A) break", "B) pass", "C) skip", "D) continue"},
                'D'));

        questions.add(new MCQQuestion(
                6,
                "If a method does not return a value, which return type is used?",
                new String[]{"A) int", "B) null", "C) void", "D) empty"},
                'C'));

        questions.add(new MCQQuestion(
                7,
                "Which concept allows one class to acquire properties of another?",
                new String[]{"A) Encapsulation", "B) Polymorphism", "C) Inheritance", "D) Abstraction"},
                'C'));

        questions.add(new MCQQuestion(
                8,
                "What happens if a class has no constructor?",
                new String[]{"A) Compilation error", "B) Runtime error", "C) Default constructor is created", "D) Object cannot be created"},
                'C'));

        questions.add(new MCQQuestion(
                9,
                "Which access modifier allows access only within the same class?",
                new String[]{"A) public", "B) protected", "C) default", "D) private"},
                'D'));

        questions.add(new MCQQuestion(
                10,
                "Which feature allows methods with the same name but different parameters?",
                new String[]{"A) Method overriding", "B) Method overloading", "C) Inheritance", "D) Abstraction"},
                'B'));

        return questions;
    }
}
