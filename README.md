# Java Quiz Management System

A console-based Quiz Management System developed using Java and Object-Oriented Programming (OOP) principles.

This project started as a simple single-class Java quiz application and was redesigned using OOP concepts to make the application more structured, modular, maintainable, and easier to extend.

PROJECT OVERVIEW

The application allows users to:

- Login using username and password
- Select a quiz category
- Answer multiple-choice questions
- Receive immediate answer feedback
- Calculate the final score
- View percentage and performance level
- Continue selecting different quiz categories
- Exit the application safely

Currently, the application contains two quiz categories:

1. Java Basic Questions
2. Logical Questions

The application runs completely through the Java console and does not require a database or external services.


TECHNOLOGIES USED

- Java
- Object-Oriented Programming (OOP)
- Java Collections
- ArrayList
- Scanner
- Console-based application
- Git & GitHub


OOP CONCEPTS USED

1. ENCAPSULATION

Class data is kept private and accessed through methods.

Example:

private final int id;
private final String questionText;

This helps protect the internal state of objects.


2. ABSTRACTION

The Question class is an abstract class that defines common behavior for quiz questions.

The actual implementation is provided by subclasses.


3. INHERITANCE

MCQQuestion inherits from the Question class.

Example:

public class MCQQuestion extends Question

This allows common properties and behavior to be reused.


4. POLYMORPHISM

The application works with the parent type:

List<Question> questions;

while the actual objects are MCQQuestion objects.

This allows the quiz system to work with different types of questions without changing the main quiz logic.


5. COMPOSITION

QuizService works with a collection of Question objects to conduct the quiz.

This keeps quiz execution separate from question data.


PROJECT STRUCTURE

JavaQuizOOP/
|
|-- src/
|   |
|   |-- com/
|       |
|       |-- udaya/
|           |
|           |-- quiz/
|               |
|               |-- Main.java
|               |
|               |-- data/
|               |   |
|               |   |-- QuestionBank.java
|               |
|               |-- model/
|               |   |
|               |   |-- Question.java
|               |   |-- MCQQuestion.java
|               |
|               |-- service/
|                   |
|                   |-- AuthService.java
|                   |-- QuizService.java
|
|-- .gitignore
|
|-- README.md


CLASS RESPONSIBILITIES

Main.java

Acts as the entry point of the application.

Responsible for:

- Starting the application
- Login flow
- Displaying the main menu
- Selecting quiz categories
- Controlling the application loop


Question.java

Abstract base class for quiz questions.

Responsible for:

- Storing common question information
- Defining common question behavior
- Demonstrating abstraction


MCQQuestion.java

Represents a multiple-choice question.

Responsible for:

- Storing answer options
- Storing the correct answer
- Displaying the question
- Checking the user's answer

Demonstrates:

- Inheritance
- Method overriding
- Polymorphism


QuestionBank.java

Stores the quiz questions.

Currently contains:

- Java Basic Questions
- Logical Questions

Keeping questions separately from quiz logic makes it easier to add or modify questions.


AuthService.java

Handles user authentication.

Responsible for:

- Reading username
- Reading password
- Validating login credentials

Authentication logic is separated from quiz logic.


QuizService.java

Controls the actual quiz.

Responsible for:

- Displaying questions
- Reading answers
- Validating answers
- Calculating the score
- Calculating percentage
- Displaying performance


APPLICATION FLOW

Start Application
       |
       v
     Login
       |
       v
Validate Credentials
       |
   +---+----+
   |        |
Invalid    Valid
   |        |
   v        v
  Exit   Main Menu
             |
       +-----+-----+
       |     |     |
       v     v     v
     Java  Logical Exit
     Quiz   Quiz
       |      |
       +--+---+
          |
          v
   Answer Questions
          |
          v
    Calculate Score
          |
          v
    Display Result
          |
          v
       Main Menu


HOW TO RUN

PREREQUISITES

Install:

- Java JDK 17 or later
- VS Code or IntelliJ IDEA

Check Java installation:

java -version

Check Java compiler:

javac -version


RUN USING VS CODE

1. Clone or download the repository.
2. Open the project folder in VS Code.
3. Make sure the Java Extension Pack is installed.
4. Open:

src/com/udaya/quiz/Main.java

5. Click the Run button.


RUN USING TERMINAL

From the project root:

javac -d out src/com/udaya/quiz/Main.java src/com/udaya/quiz/model/*.java src/com/udaya/quiz/service/*.java src/com/udaya/quiz/data/*.java

Then run:

java -cp out com.udaya.quiz.Main


DEMO LOGIN

Username: Karim
Password: Karim@#

These credentials are used only for this educational console application.

For a production application, passwords should not be hardcoded in source code.


EXAMPLE

=================================
       JAVA QUIZ MANAGEMENT
=================================

Enter Username: Karim
Enter Password: Karim@#

Access Accepted.

Select Quiz Topic
1. Java Basic Questions
2. Logical Questions
3. Exit

Enter your choice: 1


After completing the quiz:

------------- RESULT -------------
Score      : 8 / 10
Percentage : 80.00%
Performance: Good
----------------------------------


LEARNING OBJECTIVES

This project was developed to strengthen practical understanding of:

- Java Classes and Objects
- Constructors
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- Method Overriding
- Collections
- ArrayList
- Input Handling
- Separation of Responsibilities
- Basic Java Application Structure


FUTURE IMPROVEMENTS

Possible future improvements include:

- Add more quiz categories
- Add a timer for each quiz
- Store users in MySQL
- Store questions in a database
- Save previous scores
- Add an administrator question management system
- Add random question selection
- Add difficulty levels
- Convert the project into a Spring Boot REST API
- Add a web-based frontend


WHY I BUILT THIS PROJECT

The initial version of the quiz application was implemented mainly inside a single Java class.

Authentication, questions, user input, scoring, and menu handling were closely connected.

I redesigned the application using OOP principles by separating these responsibilities into different classes.

The main objective was to understand how abstraction, inheritance, encapsulation, and polymorphism can be applied to a practical Java application.


PROJECT TYPE

Academic / Learning Mini Project

Built to demonstrate practical Java and OOP concepts through a console-based application.


AUTHOR

Udaya Giri

B.Tech - Artificial Intelligence and Data Science
