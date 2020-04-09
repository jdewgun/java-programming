/**
 * ComplexNumber
 */
public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double realVal, double imaginaryVal) {
        this.real = realVal;
        this.imaginary = imaginaryVal;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double realVal, double imaginaryVal) {
        ComplexNumber complex = new ComplexNumber(realVal, imaginaryVal);
        add(complex);
    }

    public void add(ComplexNumber complex) {
        this.real += complex.getReal();
        this.imaginary += complex.getImaginary();
    }

    public void subtract(double realVal, double imaginaryVal) {
        ComplexNumber complex = new ComplexNumber(realVal, imaginaryVal);
        subtract(complex);
    }

    public void subtract(ComplexNumber complex) {
        this.real -= complex.getReal();
        this.imaginary -= complex.getImaginary();
    }
}