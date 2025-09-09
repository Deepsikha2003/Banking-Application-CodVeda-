Simple Banking Application
This is the final project in my Java Development internship with CodVeda. This console-based application demonstrates fundamental Object-Oriented Programming (OOP) concepts by simulating a basic banking system where users can perform core transactions.

The program allows a user to create a bank account, make deposits, perform withdrawals, and check their current balance, all through a simple command-line interface.

Key Concepts and Features
Object-Oriented Design: The project is built around a BankAccount class, which encapsulates the account's state (name, balance) and behavior (deposit, withdraw, check balance).

Encapsulation: The balance is kept private, and all modifications are handled through public methods (deposit, withdraw), ensuring data integrity.

Error Handling: The withdraw method includes a condition to prevent transactions that would result in a negative balance, providing user-friendly feedback.

Console-based Interaction: The application uses a Scanner to take user input, simulating a real-world user interface in the terminal.

How to Run
Save the Code: Save the provided Java code as SimpleBankingApplication.java.

Compile: Open your terminal, navigate to the project directory, and compile the code.

Bash

javac SimpleBankingApplication.java
Run: Execute the compiled program.

Bash

java SimpleBankingApplication
The application will then prompt you to enter an account name and initial balance, and you can begin using the system.

Project Structure
SimpleBankingApplication.java: The main file containing both the BankAccount class and the main method for the application's menu and logic.
