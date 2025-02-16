package sixthweek;

import java.util.ArrayList;

@FunctionalInterface
interface MyFunction{
    void sayHello();
}

@FunctionalInterface
interface Operation{
    void display();
}

@FunctionalInterface
interface Calculation{
    double areasCalc(double l, double b);
}
interface MathOperation{
    int add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(5);
        newArr.add(6);
        newArr.add(7);

        int sum =0;
        newArr.forEach(item -> System.out.println(item));
        newArr.forEach(item -> {
            System.out.println();
        });

        Operation op= () -> {
            System.out.println("Display");
        };
        op.display();

        Calculation c1=(a, b) -> a+b;
        System.out.println(c1.areasCalc(3, 5));
    }
}
