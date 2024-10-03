package programing;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AnuDInDays9_2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // using stream
        treeMap.entrySet().stream().forEach(n->System.out.println(n));

        // print systeamtment 
        System.out.println(treeMap.entrySet());

        // print by stream
        treeMap.entrySet().stream().forEach(System.out::println);

        // forlop
        for(Map.Entry<String,Integer> entry:treeMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        // itrator using 

        Iterator <Map.Entry<String,Integer>> t1s=treeMap.entrySet().iterator();

        while (t1s.hasNext()) {
           Map.Entry<String, Integer> entry=t1s.next();
           System.out.println(entry.getKey()+" "+entry.getValue());

        }

       
    }
}
