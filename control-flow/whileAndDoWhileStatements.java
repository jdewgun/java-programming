/**
 * whileAndDoWhileStatements
 */
public class whileAndDoWhileStatements {

    public static void main(String[] args) {
        // Basic While Statement Example
        int number = 4;
        int end = 20;

        while (number < end) {
            number++;

            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even Number Found: " + number);
        }

        System.out.println("****************************************");

        number = 4;
        end = 20;

        // Basic Do While Statement Example
        do {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even Number Found: " + number);

        } while (number < end);

    }

    public static boolean isEvenNumber(int intValue) {
        // Verifies if a number is Even
        boolean numberIsEven = false;

        if (intValue % 2 == 0) {
            numberIsEven = true;
        }

        return numberIsEven;
    }
}