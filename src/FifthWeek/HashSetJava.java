package FifthWeek;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetJava {
    public static void main(String[] args) {
        HashSet<String> bikes = new HashSet<>();
        bikes.add("Vespa");
        bikes.add("KTM");
        bikes.add("TVS");
        System.out.println(bikes);

        if(bikes.contains("Vespa")){
            System.out.println("Vespa exist");
        }

        Iterator<String> bikesIt=bikes.iterator();
        while (bikesIt.hasNext()){
            System.out.println(bikesIt.next());
        }
    }
}
