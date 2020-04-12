import java.util.*;

public class binaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int consecutiveParts = 0;

        String binaryString = Integer.toString(n, 2);

        String[] binaryParts = binaryString.split("0");

        for (int i = 0; i < binaryParts.length; i++) {
            if (consecutiveParts < binaryParts[i].length()) {
                consecutiveParts = binaryParts[i].length();
            }
        }

        System.out.println(consecutiveParts);
        scanner.close();
    }
}
