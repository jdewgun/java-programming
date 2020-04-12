import java.util.Scanner;

/**
 * review
 */
public class review {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();
        String stringVal;

        for (int i = 0; i < p; i++) {
            stringVal = scanner.next();
            for (int n = 0; n < stringVal.length(); n++) {
                if (n % 2 == 0) {
                    System.out.print(stringVal.charAt(n));
                }
            }

            System.out.print(" ");

            for (int n = 0; n < stringVal.length(); n++) {
                if (n % 2 == 1) {
                    System.out.print(stringVal.charAt(n));
                }
            }

            System.out.println();
        }

        scanner.close();

    }
}