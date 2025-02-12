package sixthweek;

import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        Stack<Integer> studentRollNos = new Stack<>();
        studentRollNos.push(101);
        studentRollNos.push(102);
        studentRollNos.push(104);

        System.out.println("Pop value: " + studentRollNos.pop());  //LIFO
        System.out.println("New value: " + studentRollNos.peek());
        System.out.println(studentRollNos);
    }
}
