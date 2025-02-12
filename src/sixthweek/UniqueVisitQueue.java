package sixthweek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UniqueVisitQueue {
    public static void main(String[] args) {
        Queue<String> queeVal = new LinkedList<>();
        queeVal.add("192.169.10");
        queeVal.add("192.168.11");
        queeVal.add("192.169.12");
        queeVal.add("192.169.23");
        queeVal.add("192.168.11");

        System.out.println(queeVal);
    }
}
