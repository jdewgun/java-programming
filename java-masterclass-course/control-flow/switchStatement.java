/**
 * switchStatement
 */
public class switchStatement {

    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue) {
        case 1:
            System.out.println("Value Was 1");
            break;
        case 2:
            System.out.println("Value Was 2");
            break;
        case 3:
            System.out.println("Value Was 3");
            break;
        case 4:
        case 5:
        case 6:
            System.out.println("Value Was 4, 5 or 6");
            System.out.println("Value was actually = " + switchValue);
            break;
        default:
            System.out.println("Default Value Printed");
            break;
        }

        // Challenge

        char switchValueChar = 'A';

        switch (switchValueChar) {
        case 'A':
            System.out.println("Character Value is A");
            break;
        case 'B':
            System.out.println("Character Value is B");
            break;
        case 'C':
            System.out.println("Character Value is C");
            break;
        case 'D':
            System.out.println("Character Value is D");
            break;
        case 'E':
            System.out.println("Character Value is E");
            break;
        default:
            System.out.println("Value Beyond Scope of Defined Cases.");
            break;
        }

        // Challenge 2: printDayOfTheWeek
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
    }

    public static void printDayOfTheWeek(int dayOfTheWeek) {
        switch (dayOfTheWeek) {
        case 0:
            System.out.println("Day 0: Sunday");
            break;
        case 1:
            System.out.println("Day 1: Monday");
            break;
        case 2:
            System.out.println("Day 2: Tuesday");
            break;
        case 3:
            System.out.println("Day 3: Wednesday");
            break;
        case 4:
            System.out.println("Day 4: Thursday");
            break;
        case 5:
            System.out.println("Day 5: Friday");
            break;
        case 6:
            System.out.println("Day 6: Saturday");
            break;
        default:
            System.out.println("Invalid Day");
            break;
        }
    }
}