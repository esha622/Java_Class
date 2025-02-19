package seventhweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> newList = Arrays.asList(1,2,3,5,6);

        List<Integer> evenList = new ArrayList<>();

        //even number check without stream api
        for (Integer list:newList){
            if(list%2 == 0){
                evenList.add(list);
            }
        }
        //stream API
        List<Integer> newEvenList = newList.stream().filter(i->i%2 == 0).collect(Collectors.toList());

        List<Integer> SquareList = newList.stream().map(i->i*i).collect(Collectors.toList());

        int max = newList.stream().max((x,y)->x.compareTo(y)).get();

        //sort
        List<Integer> sortedList = newList.stream().sorted().collect(Collectors.toList());

        System.out.println(newEvenList);
        System.out.println(SquareList);
        System.out.println("Max number= " + max);
        System.out.println(sortedList);

        /*factorial calculate using stream API
        List<Integer> factorial = newList.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(factorial);*/
    }
}
