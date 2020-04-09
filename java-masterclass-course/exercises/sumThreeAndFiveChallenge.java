/**
 * sumThreeAndFiveChallenge
 */
public class sumThreeAndFiveChallenge {

    /**
     * For Loop from 1 - 1000 Sum all the numbers that can be divided with both 3
     * and 5 Break out at Count of 5 After Break Sum the values
     */

    public static void main(String[] args) {
        // Initiate Count
        int countOfVals = 0;
        int sumOfVals = 0;
        for (int i = 1; i <= 1000; i++) {
            if (countOfVals < 5) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println(i + " is divisible by 3 and 5");
                    sumOfVals += i;
                    countOfVals++;
                    System.out.println("Current Sum is " + sumOfVals);
                }
            }
        }
        System.out.println(countOfVals);
    }
}