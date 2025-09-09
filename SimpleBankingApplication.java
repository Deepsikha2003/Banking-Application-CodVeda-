import java.util.Scanner;

// BankAccount class to manage account details and operations
class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + String.format("%.2f", balance));
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive number.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: $" + String.format("%.2f", balance));
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive number.");
        }
    }

    // Method to check the current balance
    public void checkBalance() {
        System.out.println("Current balance for " + accountHolderName + ": $" + String.format("%.2f", balance));
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }
}

// Main class to run the banking application
public class SimpleBankingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the Simple Banking Application ---");
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial deposit amount: $");
        double initialBalance = getDoubleInput(scanner);

        BankAccount account = new BankAccount(name, initialBalance);

        boolean running = true;
        while (running) {
            printMenu();
            int choice = getIntInput(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = getDoubleInput(scanner);
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = getDoubleInput(scanner);
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using our service. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-4).");
            }
        }
        scanner.close();
    }

    // Helper method to get a valid integer input
    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear the invalid input
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume the rest of the line
        return input;
    }

    // Helper method to get a valid double input
    private static double getDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear the invalid input
        }
        double input = scanner.nextDouble();
        scanner.nextLine(); // Consume the rest of the line
        return input;
    }

    private static void printMenu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
}
