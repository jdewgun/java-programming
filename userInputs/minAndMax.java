import java.util.Scanner;

/**
 * minAndMax
 */
public class minAndMax {
    /**
     * Read User Inputs Print "Enter Number: " as prompt Invalid Number == Break
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter a number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
        }

        scanner.close();
        System.out.println("Minimum Val: " + min);
        System.out.println("Maximum Val: " + max);
    }
}