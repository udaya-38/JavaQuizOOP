# Java Quiz Management System

A console-based Quiz Management System developed using **Java** and **Object-Oriented Programming (OOP)** principles.

This project started as a simple single-class Java quiz application and was redesigned using OOP concepts to make the application more structured, modular, maintainable, and easier to extend.

## Project Overview

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

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections
- ArrayList
- Scanner
- Console-based application
- Git & GitHub

## OOP Concepts Used

### 1. Encapsulation

Class data is kept private and accessed through methods.

Example:

```java
private final int id;
private final String questionText;
