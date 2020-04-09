/**
 * operatorsChallenge
 */
public class operatorsChallenge {

    public static void main(String[] args) {
        /**
         * Create doubles with value 20 and 80 Add together and multiply with by 100.0
         * Find remainder between result and 40.0 If remainder is 0 assign true to a new
         * variable Sys Out Boolean Var if-then to display message "Got Some Remainder"
         * if Boolean Var is False
         */
        double firstVal = 20d;
        double secondVal = 80d;

        double result = (firstVal + secondVal) * 100d;

        double remainder = result % 40d;

        boolean isRemainderNull = (remainder == 0) ? true : false;

        System.out.println(isRemainderNull);

        if (!isRemainderNull) {
            System.out.println("Got some remainder");
        }
    }
}