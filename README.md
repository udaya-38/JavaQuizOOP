Java Quiz Management System
A console-based Quiz Management System developed using Java and Object-Oriented Programming (OOP) principles.
This project started as a simple single-class Java quiz application and was redesigned using OOP concepts to make the application more structured, modular, maintainable, and easier to extend.
Project Overview
The application allows users to:
Login using username and password
Select a quiz category
Answer multiple-choice questions
Receive immediate answer feedback
Calculate the final score
View percentage and performance level
Continue selecting different quiz categories
Exit the application safely
Currently, the application contains two quiz categories:
Java Basic Questions
Logical Questions
The application runs completely through the Java console and does not require a database or external services.
Technologies Used
Java
Object-Oriented Programming (OOP)
Java Collections
ArrayList
Scanner
Console-based application
Git & GitHub
OOP Concepts Used
1. Encapsulation
Class data is kept private and accessed through methods.
Example:
```java
private final int id;
private final String questionText;
```
This helps protect the internal state of objects.
2. Abstraction
The `Question` class is an abstract class that defines common behavior for quiz questions.
The actual implementation is provided by subclasses.
3. Inheritance
`MCQQuestion` inherits from the `Question` class.
```java
public class MCQQuestion extends Question
```
This allows common properties and behavior to be reused.
4. Polymorphism
The application works with the parent type:
```java
List<Question> questions;
```
while the actual objects are `MCQQuestion` objects.
This allows the quiz system to work with different types of questions without changing the main quiz logic.
5. Composition
`QuizService` works with a collection of `Question` objects to conduct the quiz.
This keeps quiz execution separate from question data.
Project Structure
```text
JavaQuizOOP/
│
├── src/
│   └── com/
│       └── udaya/
│           └── quiz/
│               │
│               ├── Main.java
│               │
│               ├── data/
│               │   └── QuestionBank.java
│               │
│               ├── model/
│               │   ├── Question.java
│               │   └── MCQQuestion.java
│               │
│               └── service/
│                   ├── AuthService.java
│                   └── QuizService.java
│
├── .gitignore
└── README.md
```
Class Responsibilities
Main.java
Acts as the entry point of the application.
Responsible for:
Starting the application
Login flow
Displaying the main menu
Selecting quiz categories
Controlling the application loop
Question.java
Abstract base class for quiz questions.
Responsible for:
Storing common question information
Defining common question behavior
Demonstrating abstraction
MCQQuestion.java
Represents a multiple-choice question.
Responsible for:
Storing answer options
Storing the correct answer
Displaying the question
Checking the user's answer
Demonstrates:
Inheritance
Method overriding
Polymorphism
QuestionBank.java
Stores the quiz questions.
Currently contains:
Java Basic Questions
Logical Questions
Keeping questions separately from quiz logic makes it easier to add or modify questions.
AuthService.java
Handles user authentication.
Responsible for:
Reading username
Reading password
Validating login credentials
Authentication logic is separated from quiz logic.
QuizService.java
Controls the actual quiz.
Responsible for:
Displaying questions
Reading answers
Validating answers
Calculating the score
Calculating percentage
Displaying performance
Application Flow
```text
Start Application
       │
       ▼
     Login
       │
       ▼
Validate Credentials
       │
   ┌───┴────┐
   │        │
Invalid    Valid
   │        │
   ▼        ▼
  Exit   Main Menu
             │
       ┌─────┼─────┐
       │     │     │
       ▼     ▼     ▼
     Java  Logical Exit
     Quiz   Quiz
       │      │
       └──┬───┘
          │
          ▼
   Answer Questions
          │
          ▼
    Calculate Score
          │
          ▼
    Display Result
          │
          ▼
       Main Menu
```
How to Run
Prerequisites
Install:
Java JDK 17 or later
VS Code or IntelliJ IDEA
Check Java installation:
```bash
java -version
```
Check Java compiler:
```bash
javac -version
```
Run Using VS Code
Clone or download the repository.
Open the project folder in VS Code.
Make sure the Java Extension Pack is installed.
Open:
```text
src/com/udaya/quiz/Main.java
```
Click the Run button.
Run Using Terminal
From the project root:
```bash
javac -d out src/com/udaya/quiz/Main.java src/com/udaya/quiz/model/*.java src/com/udaya/quiz/service/*.java src/com/udaya/quiz/data/*.java
```
Then run:
```bash
java -cp out com.udaya.quiz.Main
```
Demo Login
```text
Username: Karim
Password: Karim@#
```
These credentials are used only for this educational console application.
For a production application, passwords should not be hardcoded in source code.
Example
```text
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
```
After completing the quiz:
```text
------------- RESULT -------------
Score      : 8 / 10
Percentage : 80.00%
Performance: Good
----------------------------------
```
Learning Objectives
This project was developed to strengthen practical understanding of:
Java Classes and Objects
Constructors
Encapsulation
Abstraction
Inheritance
Polymorphism
Method Overriding
Collections
ArrayList
Input Handling
Separation of Responsibilities
Basic Java Application Structure
Future Improvements
Possible future improvements include:
Add more quiz categories
Add a timer for each quiz
Store users in MySQL
Store questions in a database
Save previous scores
Add an administrator question management system
Add random question selection
Add difficulty levels
Convert the project into a Spring Boot REST API
Add a web-based frontend
Why I Built This Project
The initial version of the quiz application was implemented mainly inside a single Java class.
Authentication, questions, user input, scoring, and menu handling were closely connected.
I redesigned the application using OOP principles by separating these responsibilities into different classes.
The main objective was to understand how abstraction, inheritance, encapsulation, and polymorphism can be applied to a practical Java application.
Project Type
Academic / Learning Mini Project
Built to demonstrate practical Java and OOP concepts through a console-based application.
Author
Udaya Giri
B.Tech - Artificial Intelligence and Data Science
