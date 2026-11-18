class Calculator {
    int calculate(int a, int b) {
        return a + b;
    }
    double calculate(double a, double b) {
        return a * b;
    }
    int calculate(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }
    double calculate(int a, double b) {
        return a - b;
    }
}
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum = " + c.calculate(10, 20));

        System.out.println("Product = " + c.calculate(2.5, 4.0));

        System.out.println("Largest = " + c.calculate(10, 30, 20));

        System.out.println("Difference = " + c.calculate(20, 5.5));
    }
}