public class Ifthen {
    public static void main(String[] args) {

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an Alien");
            System.out.println("That's an Alien");
        }

        int topScore = 80;
        int secondTopScore = 60;

        if (topScore >= 100) {
            System.out.println("You've got the Highest Score");
        }

        if ((topScore < 100) && (topScore > secondTopScore)) {
            System.out.println("Greater than Second Top Score but less than Highest");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of the conditions or both are true");
        }

        boolean isCar = false;

        /*
         * isCar gets assigned new value but this still works This is wrong if (isCar =
         * true) { System.out.println("This is not supposed to happen"); }
         */

        if (isCar == false) {
            System.out.println("isCar is false");
        }

        if (!isCar) {
            System.out.println("isCar is false");
        }
    }
}