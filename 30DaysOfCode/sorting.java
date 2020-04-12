import java.util.Scanner;

/**
 * sorting
 */

public class sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int swap = 0;
        for (int lastSortedIndex = n - 1; lastSortedIndex >= 0; lastSortedIndex--) {
            for (int index = 0; index < lastSortedIndex; index++) {
                if (a[index] > a[index + 1]) {
                    swap++;
                    int temp = a[index];
                    a[index] = a[index + 1];
                    a[index + 1] = temp;
                }
            }
        }
        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
