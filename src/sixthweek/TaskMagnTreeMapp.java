package sixthweek;

import java.util.Scanner;
import java.util.TreeMap;

public class TaskMagnTreeMapp {
    public static void main(String[] args){
        TreeMap<Integer, String> task = new TreeMap<>();
        //Scanner sc = new Scanner(System.in);
        //int newtask = sc.nextInt();

        task.put(1, "Walk");
        task.put(2, "Run");
        task.put(4, "Eat");
        task.put(3, "Exercise");

        System.out.println(task);

        task.remove(3);
        System.out.println(task);

        task.get(3);
        System.out.println(task);
    }
}
