package FifthWeek;

import java.util.HashMap;
import java.util.Map;


public class NewHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> newMap = new HashMap<>();
        newMap.put("Nepal", 240);
        newMap.put("India", 200);
        newMap.put("China", 150);
        newMap.put("Nepal", 45); //If key value is same then it will replace the value
        newMap.put(null,244);
        System.out.println(newMap);
        System.out.println(newMap.get("China"));

        if(newMap.containsKey("China")){
            System.out.println("Value exist");
        }

        if(newMap.containsValue(45)){
            System.out.println("Value exist");
        }

        for(String key: newMap.keySet()){
            //System.out.println(newMap.get(key));
            System.out.println(key);
        }

        for(Integer value: newMap.values()){
            System.out.println(value);
        }

        for(Map.Entry<String,Integer> keyVal:newMap.entrySet()){
            System.out.println(keyVal.getKey());
        }
    }
}
