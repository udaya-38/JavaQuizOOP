package com.udaya.quiz.model;

/**
 * Abstract base class for quiz questions.
 * Demonstrates abstraction.
 */
public abstract class Question {

    private final int id;
    private final String questionText;

    protected Question(int id, String questionText) {
        this.id = id;
        this.questionText = questionText;
    }

    public int getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public abstract void display();

    public abstract boolean isCorrect(char answer);
}
