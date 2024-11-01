# CSC325 OOP Design Review Lab

This project is a Java implementation that demonstrates object-oriented programming principles through a simple student management system. It includes classes for `Student`, `Freshman`, and `Senior`, showcasing inheritance, encapsulation, and polymorphism.

## Project Structure

- `Human` - The base class representing a human being with basic attributes.
- `Student` - Inherits from `Human` and adds attributes such as GPA and credits.
- `Freshman` - Inherits from `Student` and represents a freshman student.
- `Senior` - Inherits from `Student` and represents a senior student, requiring a minimum number of credits.
- `MainClass` - The entry point for the application that tests the functionality of the above classes.

## Features

- **Student Management**: Create and manage student records with attributes like name, age, GPA, and credits.
- **Freshman and Senior Classes**: Specific classes that extend the `Student` class with additional rules (e.g., seniors must have a minimum of 85 credits).
- **User Interaction**: Allows user input to update student details, specifically the GPA.
