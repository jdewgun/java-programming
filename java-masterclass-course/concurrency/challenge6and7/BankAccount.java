import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * BankAccount
 */
public class BankAccount {

    private double balance;
    private String accountNumber;

    private Lock lock;

    public BankAccount(double balanceVal, String accountNumberVal) {
        this.accountNumber = accountNumberVal;
        this.balance = balanceVal;
        this.lock = new ReentrantLock();
    }
    // Base Definition
    // public void deposit(double amountVal) {
    // balance += amountVal;
    // }

    // public void withdraw(double amountVal) {
    // balance -= amountVal;
    // }

    // * Challenge 2: Thread Safe using Synchronised Keyword
    // Method 1:
    // public synchronized void deposit(double amountVal) {
    // balance += amountVal;
    // }

    // public synchronized void withdraw(double amountVal) {
    // balance -= amountVal;
    // }
    // Method 2:
    // public void deposit(double amountVal) {
    // synchronized (this) {
    // balance += amountVal;
    // }
    // }

    // public void withdraw(double amountVal) {
    // synchronized (this) {
    // balance -= amountVal;
    // }
    // }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account Number: " + this.accountNumber);
    }

    // * Challenge 4: Create Lock Object, ReentrantLock and make class ThreadSafe.
    // We need to create Lock Object and deploy to methods deposit and withdraw
    // public void deposit(double amountVal) {
    // lock.lock();
    // try {
    // balance += amountVal;
    // } finally {
    // lock.unlock();
    // }
    // }

    // public void withdraw(double amountVal) {
    // lock.lock();
    // try {
    // balance -= amountVal;
    // } finally {
    // lock.unlock();
    // }
    // }

    // * Challenge 5: Create Lock Object, tryLock and make class ThreadSafe.
    public void deposit(double amountVal) {

        boolean status = false; // Local Variable already threadSafe.
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amountVal;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock.");
            }
        } catch (InterruptedException e) {
            // Passing this part for now
        }

        System.out.println("Transaction Status: " + status);
    }

    public void withdraw(double amountVal) {

        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amountVal;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock.");
            }
        } catch (InterruptedException e) {
            // Passing this part for now
        }

        System.out.println("Transaction Status: " + status);
    }
}