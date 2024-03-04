
import java.util.HashMap;
import java.util.Scanner;
class Bank {
    private HashMap<String, Double> accounts; // HashMap to store account number and balance

    // Constructor to initialize the accounts HashMap
    public Bank() {
        accounts = new HashMap<>();
    }

    // Method to create a new account
    public void createAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance); // Add account number and balance to the HashMap
        System.out.println("Account created successfully!");
    }

    // Method to deposit money into an account
    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) { // Check if account exists
            double balance = accounts.get(accountNumber); // Get current balance
            balance += amount; // Add deposited amount to balance
            accounts.put(accountNumber, balance); // Update balance in HashMap
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Account not found!");
        }
    }

    // Method to withdraw money from an account
    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) { // Check if account exists
            double balance = accounts.get(accountNumber); // Get current balance
            if (balance >= amount) { // Check if sufficient balance
                balance -= amount; // Subtract withdrawal amount from balance
                accounts.put(accountNumber, balance); // Update balance in HashMap
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    // Method to check the balance of an account
    public void checkBalance(String accountNumber) {
        if (accounts.containsKey(accountNumber)) { // Check if account exists
            double balance = accounts.get(accountNumber); // Get current balance
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Account not found!");
        }
    }
}