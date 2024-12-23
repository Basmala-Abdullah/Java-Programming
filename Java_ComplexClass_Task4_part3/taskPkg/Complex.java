package taskPkg;

public class Complex{
	double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //addition
    public void add(Complex c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    //subtraction
    public void subtract(Complex c) {
        this.real -= c.real;
        this.imaginary -= c.imaginary;
    }

    //complex number in form of string
    public String toString() {
        return real+" + "+imaginary+"i";
    }

}
