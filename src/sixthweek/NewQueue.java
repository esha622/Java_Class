package sixthweek;

import java.util.LinkedList;
import java.util.Queue;

public class NewQueue {
    public static void main(String[] args) {
        Queue<String> queVal= new LinkedList<>();
        queVal.add("Fz");
        queVal.add("bmw");
        queVal.add("pulsar");

        System.out.println(queVal);
        System.out.println("Remove element= " + queVal.poll()); //poll removes the first value as Queue follows FIFO
        System.out.println("Queue after= " + queVal);
        System.out.println("New removed value= " + queVal.poll());
    }
}
