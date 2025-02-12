package sixthweek;
//map that store key-value pairs in sorted order of keys.
//key-value pairs as hash map but tree map set the pairs in ascending order

import java.util.TreeMap;

public class NewTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeVal = new TreeMap<>();
        treeVal.put(2, "Apple");
        treeVal.put(1, "Grapes");
        treeVal.put(3, "Mango");

        TreeMap<String, String> newTree = new TreeMap<>();
        newTree.put("name1", "Sohee");
        newTree.put("name2", "Anton");
        newTree.put("name3", "Wonbin");

        System.out.println(treeVal);
        System.out.println(newTree);
    }
}
