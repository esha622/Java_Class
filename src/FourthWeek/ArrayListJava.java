package FourthWeek;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListJava {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Sohee");
        names.add("Anton");
        names.add("Seunghan");

        //replace value
        names.set(1, "Sungchan");
        names.add(2, "Shotaro");
        names.remove(1);
        names.contains("Sohee");
        System.out.println(names.get(2));

        for(String name:names){
            System.out.println(names);
        }
        /*for(int i=0; i<names.size(); i++){

        }*/
        //arraylist of number and finds maximum
        /*ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(67);
        nums.add(86);
        if (nums.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        // Initialize min with the first element of the list
        int min = nums.get(0);

        // Iterate through the list to find the minimum value
        for (int num : nums) {
            if (min > num) {
                min = num; // Update min if a smaller number is found
            }
        }

        // Print the minimum value
        System.out.println("The minimum value is: " + min);}*/
        System.out.println(names);
        Collections.sort(names); //ascending order

    }
}
