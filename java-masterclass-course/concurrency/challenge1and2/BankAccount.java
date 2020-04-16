/**
 * BankAccount
 */
public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(double balanceVal, String accountNumberVal) {
        this.accountNumber = accountNumberVal;
        this.balance = balanceVal;
    }
    // Base Definition
    // public void deposit(double amountVal) {
    // balance += amountVal;
    // }

    // public void withdraw(double amountVal) {
    // balance -= amountVal;
    // }

    // Challenge 2: Thread Safe using Synchronised Keyword
    // Method 1:
    // public synchronized void deposit(double amountVal) {
    // balance += amountVal;
    // }

    // public synchronized void withdraw(double amountVal) {
    // balance -= amountVal;
    // }
    // Method 2:
    public void deposit(double amountVal) {
        synchronized (this) {
            balance += amountVal;
        }
    }

    public void withdraw(double amountVal) {
        synchronized (this) {
            balance -= amountVal;
        }
    }
}