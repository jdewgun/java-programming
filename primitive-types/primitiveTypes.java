/*
Primitive Types in Java
-----------------------
    * Boolean
    * Byte
    * Char
    * Short
    * Int
    * Long
    * Float
    * Double
String is not a primitive type but a class in Java
*/

public class primitiveTypes {
    public static void main(String[] args) {

        // Integers
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        // Integers Occupy 32-bits and has a width of 32
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Overflow
        System.out.println(myMaxIntValue + 1);

        // Underflow
        System.out.println(myMinIntValue - 1);

        // Bytes
        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;

        // Bytes Occupy 8-bits and has a width of 8
        System.out.println("Bytes Minimum Value = " + myByteMinValue);
        System.out.println("Bytes Maximum Value = " + myByteMaxValue);

        // Short
        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;

        // Short Occupy 16-bits and has a width of 16
        System.out.println("Short Minimum Value = " + myShortMinValue);
        System.out.println("Short Maximum Value = " + myShortMaxValue);

        // Long
        long myLongValue = 100L;

        // Long Occupy 64-bits and has a width of 64
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;

        System.out.println(myLongValue);
        System.out.println("Long Minimum Value = " + myLongMinValue);
        System.out.println("Long Maximum Value = " + myLongMaxValue);

        long bigLongValue = 2_147_483_647; // Parsed As Integer
        long bigLongValueL = 2_147_483_647_673L; // Parsed as Long

        System.out.println(bigLongValue);
        System.out.println(bigLongValueL);

        // Basic Arithmetic

        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);
        // byte myNewByteVal = (myByteMinValue / 2);
        // This is wrong as the value within the parentheses is considered as int
        // Int is the default Primitive Type

        // Change through Casting
        byte myNewByteVal = (byte) (myByteMinValue / 2);
        System.out.println(myNewByteVal);

        // Floating Point Numbers

        // Float: Single Precision Number, 32-bi;t
        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;

        System.out.println("Float Maximum Value = " + myMaxFloatValue);
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        // Double: Double Precision Number, 64-bit
        // Double is taken as the default, much like the integer
        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;

        System.out.println("Double Maximum Value = " + myMaxDoubleValue);
        System.out.println("Double Minimum Value = " + myMinDoubleValue);

        // Char: 16-bits, needs single quotes
        char myChar = 'D';
        char myUniCodeChar = '\u0044'; // Writing the Same Character as Unicode
        char myCopyRightChar = '\u00A9';

        System.out.println(myChar);
        System.out.println(myUniCodeChar);
        System.out.println(myCopyRightChar);

        // Boolean: true/false (Yes/No, 1/0)
        boolean myTrueBooleanVal = true;
        boolean myFalseBOoleanVal = false;

        boolean isCustomerOver21 = true;

        System.out.println(myTrueBooleanVal);
        System.out.println(myFalseBOoleanVal);
        System.out.println(isCustomerOver21);

        // String Class
        // Strings in Java are immutable
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.94";
        numberString = numberString + "49.90";
        System.out.println(numberString);
    }
}
