package Assignment;

public class MethodsParameterExample {
    public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
        public double add(double a, double b) {
            return a + b;
        }
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }
    public static void main(String[] args) {
        MethodsParameterExample example = new MethodsParameterExample();
        Calculator calculator = example.new Calculator();
        System.out.println("Sum of 5 and 10: " + calculator.add(5, 10));  // Sum of 5 and 10: 15
        System.out.println("Sum of 5.5 and 10.5: " + calculator.add(5.5, 10.5)); // Sum of 5 and 10.5: 16.0
        System.out.println("Sum of 1, 2, and 3: " + calculator.add(1, 2, 3)); // Sum of 1, 2,  and 3: 6
    }
}