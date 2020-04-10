import java.util.Arrays;
import java.util.Scanner;

/**
 * reverseArray
 */
public class reverseArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] inputValues = getIntegers(5);
        System.out.println("Array Before Sort: " + Arrays.toString(inputValues));
        int[] reversedArray = reverse(inputValues);
        System.out.println("Array After Sort: " + Arrays.toString(reversedArray));
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter Number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] reverse(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }
}