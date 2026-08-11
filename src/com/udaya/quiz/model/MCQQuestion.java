package com.udaya.quiz.model;

/**
 * Multiple-choice implementation of Question.
 * Demonstrates inheritance and polymorphism.
 */
public class MCQQuestion extends Question {

    private final String[] options;
    private final char correctAnswer;

    public MCQQuestion(
            int id,
            String questionText,
            String[] options,
            char correctAnswer) {

        super(id, questionText);
        this.options = options;
        this.correctAnswer = Character.toUpperCase(correctAnswer);
    }

    public String[] getOptions() {
        return options.clone();
    }

    @Override
    public void display() {
        System.out.println("\n" + getId() + ") " + getQuestionText());

        for (String option : options) {
            System.out.println(option);
        }
    }

    @Override
    public boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == correctAnswer;
    }
}
