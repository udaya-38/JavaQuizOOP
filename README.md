Java Quiz Management System
A console-based quiz application built using Java and Object-Oriented Programming (OOP) concepts.
The project was redesigned from a simple single-class quiz application into a modular structure where authentication, question data, quiz execution, and application flow are handled by separate classes.
---
📌 Project Overview
The Java Quiz Management System allows users to:
Login using username and password
Select a quiz category
Answer multiple-choice questions
Receive feedback for answers
Calculate the final score
View percentage and performance
Attempt different quiz categories
Exit the application safely
The application currently provides:
Java Basic Questions
Logical Questions
It is a console-based mini project and does not require a database or external services.
---
🛠️ Technologies Used
Technology	Purpose
Java	Core programming language
OOP	Application design
ArrayList	Store question objects
Scanner	Console input
Git	Version control
GitHub	Source code management
---
🧠 OOP Concepts Demonstrated
Encapsulation
Class fields are kept private and accessed through methods.
```java
private final int id;
private final String questionText;
```
Abstraction
`Question` is an abstract class that defines common properties and behavior for questions.
Inheritance
`MCQQuestion` extends the `Question` class.
```java
public class MCQQuestion extends Question
```
Polymorphism
The application can work with questions using the parent `Question` type.
```java
List<Question> questions;
```
This allows different question implementations to be handled through a common reference.
Separation of Responsibilities
Different classes handle different parts of the application instead of putting all functionality inside one class.
---
📂 Project Structure
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
---
📋 Class Responsibilities
Class	Responsibility
`Main`	Starts and controls the application
`Question`	Abstract base class for questions
`MCQQuestion`	Represents multiple-choice questions
`QuestionBank`	Provides quiz questions
`AuthService`	Handles username/password validation
`QuizService`	Runs the quiz and calculates results
---
🔄 Application Flow
```text
Start
  │
  ▼
Login
  │
  ▼
Validate Credentials
  │
  ├── Invalid ──► Exit
  │
  ▼
Main Menu
  │
  ├── Java Quiz
  │
  ├── Logical Quiz
  │
  └── Exit
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
Return to Main Menu
```
---
▶️ How to Run
Prerequisites
Make sure you have:
Java JDK 17 or later
VS Code or IntelliJ IDEA
Verify Java installation:
```bash
java -version
```
Verify the Java compiler:
```bash
javac -version
```
Run Using VS Code
Clone or download the repository.
Open the project folder in VS Code.
Install the Java Extension Pack if required.
Open:
```text
src/com/udaya/quiz/Main.java
```
Click Run.
Run Using Terminal
From the project root:
```bash
javac -d out src/com/udaya/quiz/Main.java src/com/udaya/quiz/model/*.java src/com/udaya/quiz/service/*.java src/com/udaya/quiz/data/*.java
```
Run the application:
```bash
java -cp out com.udaya.quiz.Main
```
---
🔐 Demo Login
```text
Username: Karim
Password: Karim123@#
```
These credentials are included only for this educational project.
For a production application, credentials should be stored securely instead of being hardcoded.
---
💻 Sample Console Output
```text
=================================
       JAVA QUIZ MANAGEMENT
=================================

Enter Username: Karim
Enter Password: Karim123@#

Access Accepted.

Select Quiz Topic

1. Java Basic Questions
2. Logical Questions
3. Exit

Enter your choice: 1
```
Example result:
```text
------------- RESULT -------------

Score      : 8 / 10
Percentage : 80.00%
Performance: Good

----------------------------------
```
---
🎯 Learning Objectives
This project helped me practice:
Java classes and objects
Constructors
Encapsulation
Abstraction
Inheritance
Polymorphism
Method overriding
ArrayList and Collections
Console input handling
Class organization
Separation of responsibilities
Basic Git and GitHub workflow
---
🚀 Future Improvements
Possible improvements include:
Add more quiz categories
Add random question selection
Add difficulty levels
Add a quiz timer
Store questions in MySQL
Store user scores
Add an administrator module
Add persistent user accounts
Convert the application into a Spring Boot backend
Add a web-based frontend
---
💡 Why This Project?
The initial version of this application was implemented mainly inside a single Java class.
As the application grew, authentication, questions, input handling, scoring, and menu logic became closely connected.
I redesigned the application using OOP principles and separated these responsibilities into different classes.
The main goal was to understand how OOP concepts can be applied to a practical Java application instead of using them only in individual programming examples.
---
📌 Project Type
Academic / Learning Mini Project
A console-based Java project created to demonstrate practical understanding of Java and Object-Oriented Programming.
---
👨‍💻 Author
Udaya Giri
B.Tech - Artificial Intelligence and Data Science
