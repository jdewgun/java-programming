/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        final BankAccount account = new BankAccount(1000.0, "1234-4321");
        // Create New Anonymous Thread
        Thread transactionThreadOne = new Thread() {
            @Override
            public void run() {
                account.deposit(300.0);
                account.withdraw(50.0);
            }
        };

        Thread transactionThreadTwo = new Thread() {
            @Override
            public void run() {
                account.deposit(203.7);
                account.withdraw(50.0);
            }
        };

        transactionThreadOne.start();
        transactionThreadTwo.start();

        // Runnable Interface

        Thread transactionInterfaceThreadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.7);
                account.withdraw(50.0);
            }
        });

        Thread transactionInterfaceThreadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.0);
                account.withdraw(50.0);
            }
        });

        transactionInterfaceThreadOne.start();
        transactionInterfaceThreadTwo.start();
    }

}