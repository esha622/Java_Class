package sixthweek;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        Integer intObj = Integer.valueOf(100);
        Integer newObj = 140;   //autooxing

        int val = newObj; //unboxing

        ArrayList<Integer> newValArr = new ArrayList<>();
        newValArr.add(10);  //uses autoboxing
    }
}
