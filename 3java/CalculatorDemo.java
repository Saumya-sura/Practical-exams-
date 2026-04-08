class Calculator {
    // Addition
    int calculate(int a, int b) {
        return a + b;
    }

    // Subtraction
    int calculate(int a, int b, char op) {
        if (op == '-') {
            return a - b;
        }
        // Default to addition if not '-'
        return a + b;
    }

    // Multiplication
    double calculate(double a, double b) {
        return a * b;
    }

    // Division
    double calculate(double a, double b, char op) {
        if (op == '/') {
            if (b != 0) return a / b;
            else throw new ArithmeticException("Division by zero");
        }
        // Default to multiplication if not '/'
        return a * b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition (int): " + calc.calculate(5, 3));
        System.out.println("Subtraction (int): " + calc.calculate(5, 3, '-'));
        System.out.println("Multiplication (double): " + calc.calculate(2.5, 4.0));
        System.out.println("Division (double): " + calc.calculate(10.0, 2.0, '/'));
    }
}
