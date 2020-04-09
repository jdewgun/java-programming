/**
 * diagonalStar
 */
public class diagonalStar {
    public static void main(String[] args) {
        printSquareStar(2);
        System.out.println("-------------------------------");
        printSquareStar(4);
        System.out.println("-------------------------------");
        printSquareStar(6);
        System.out.println("-------------------------------");
        printSquareStar(8);
        System.out.println("-------------------------------");
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");

        } else {
            // Iterate over rows
            for (int i = 1; i <= number; i++) {
                // Iterate over cols
                for (int j = 1; j <= number; j++) {
                    // Criteria Match
                    if (i == 1 || i == number || // First or Last Row
                            j == 1 || j == number || // First or Last Col
                            i == j || // Row == Col
                            j == number - i + 1) { //
                        System.out.print("*");
                    } else {
                        // No Criteria = Skip Print
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Skip to Next Line
            }
        }
    }
}
