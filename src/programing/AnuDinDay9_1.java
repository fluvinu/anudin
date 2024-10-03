package programing;

import java.util.TreeMap;

public class AnuDinDay9_1 {
    public static void main(String[] args) {
        TreeMap<String,Integer>treeMap=new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        System.out.println(treeMap);

        treeMap.remove("Two");
        System.out.println(treeMap);
    }
    
}
