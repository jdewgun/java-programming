import java.util.Scanner;

/**
 * operators
 */
public class operators {
    // Complete the solve function below.
    static void solve(double costMeal, int tipPercent, int taxPercent) {
        double tipTotal = costMeal * tipPercent / 100;
        double taxTotal = costMeal * taxPercent / 100;

        double total = Math.round(costMeal + tipTotal + taxTotal);

        System.out.println(total);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}