public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFirstNumberVariable = (10 + 5) + (2 * 10);
        int mySecondNumberVariable = 12;
        int myThirdNumberVariable = myFirstNumberVariable * 2;
        int myTotal = myFirstNumberVariable + mySecondNumberVariable + myThirdNumberVariable;
        System.out.println(myTotal);

        int myNegativeNumber = myTotal - 1000;
        System.out.println(myNegativeNumber);
    }
}