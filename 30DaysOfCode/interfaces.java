/**
 * interfaces
 */
public class interfaces {

    interface AdvancedArithmetic {
        int divisorSum(int n);
    }

    class Calculator implements AdvancedArithmetic {
        public int divisorSum(int n) {
            int sum = n + 1;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    sum = sum + i;
                    if ((n / i) != i) {
                        sum = sum + (n / i);
                    }
                }
            }
            return n == 1 ? 1 : sum;
        }
    }

}
