class Complex {
    int real, imag;
    Complex(int r, int i) {
        real = r;
        imag = i;
    }
    Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }
    Complex multiply(Complex c) {
        int r = real * c.real - imag * c.imag;
        int i = real * c.imag + imag * c.real;
        return new Complex(r, i);
    }
    void compareMagnitude(Complex c) {
        double m1 = Math.sqrt(real * real + imag * imag);
        double m2 = Math.sqrt(c.real * c.real + c.imag * c.imag);
        if (m1 > m2)
            System.out.println("First number is greater");
        else if (m1 < m2)
            System.out.println("Second number is greater");
        else
            System.out.println("Both are equal");
    }
    Complex copy() {
        return new Complex(real, imag);
    }
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}
class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 3);
        Complex c2 = new Complex(2, 1);
        System.out.print("First number: ");
        c1.display();
        System.out.print("Second number: ");
        c2.display();
        Complex sum = c1.add(c2);
        System.out.print("Addition: ");
        sum.display();
        Complex product = c1.multiply(c2);
        System.out.print("Multiplication: ");
        product.display();
        c1.compareMagnitude(c2);
        Complex c3 = c1.copy();
        c1.real = 10;
        System.out.print("Modified first number: ");
        c1.display();
        System.out.print("Copied number: ");
        c3.display();
    }
}