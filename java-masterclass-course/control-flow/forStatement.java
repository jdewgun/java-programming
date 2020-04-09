/**
 * forStatement
 */
public class forStatement {

    /**
     * Basic Syntax: For Loop for(init; termination; increment) {}
     */
    public static void main(String[] args) {
        // Common Example
        for (int i = 0; i < 5; i++) {
            System.out.println("The Value is " + i);
        }

        // For loop over a range of numbers to check whether they are prime

        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a Prime Number");
            }
        }
    }

    // Method to check if a number is a Prime Number
    public static boolean isPrime(int numberVal) {
        if (numberVal == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(numberVal); i++) {
            if (numberVal % i == 0) {
                return false;
            }
        }

        return true;
    }
}