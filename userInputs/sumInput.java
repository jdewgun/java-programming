
/**
 * sumInput
 */

import java.util.Scanner;

public class sumInput {
    /**
     * Read 10 Numbers from the CLI Sum the Numbers Return Sum of 10 Numbers
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int order = count + 1;

            System.out.println("Enter Number #" + order + ": ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                if (count == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Value");
            }

            scanner.nextLine();
        }

        System.out.println("Sum: " + sum);
        scanner.close();

    }
}