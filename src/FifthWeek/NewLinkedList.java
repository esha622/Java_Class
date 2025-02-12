package FifthWeek;

//Array normally be in contigious form which works by shifting the list
//Linked list: be in the non-contigious : (node(--value--next)) link

import java.util.LinkedList;

public class NewLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BYD");
        cars.add("BMW");
        cars.add("Ford");
        cars.addFirst("Tesla");
        cars.addLast("Neon");
        cars.add(2,"Toyoto");
        System.out.println(cars);

        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars);

    }
}
