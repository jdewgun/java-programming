
/**
 * Reading User Inputs
 */
import java.util.Scanner;

public class readerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Your Year Of Birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line (enter key)
        System.out.println("Input Recieved: " + name + ", " + "Year of Birth: " + yearOfBirth);
        scanner.close();
    }
}