public class Challenge {

    public static void main(String[] args) {
        // For the challenge you need to create the following
        // Byte Variable
        // Short Variable
        // Int Variable
        // Long Variable which is 50000 + 10 * (ByteVar + ShortVar + IntVar)

        byte byteVar = 50;
        short shortVar = 5000;
        int intVar = 50_000;
        long longVar = 50_000L + (10L * (byteVar + shortVar + intVar));

        System.out.println(longVar);

        // Challenge two: Conversion of Pounds to Kilograms
        // 1 pound = 0.45359237 Kilograms

        double poundsToBeConverted = 180d;

        double convertedKilograms = poundsToBeConverted / 2.205;

        System.out.println(convertedKilograms);
    }
}