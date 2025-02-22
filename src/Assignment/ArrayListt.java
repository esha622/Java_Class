package Assignment;

import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add(0, "Mazda");
            cars.get(0);
            cars.set(0, "Opel");
            cars.remove(0);
            cars.size();
            cars.clear();

            System.out.println(cars);
    }
}
