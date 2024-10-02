package programing;

import java.util.HashMap;

public class AnuDinDAy8_q1 {
    public static void main(String[] args) {
        HashMap<Integer,String> mapIs=new HashMap<>();
        //adding value 
        mapIs.put(1, "sid");
        mapIs.put(2, "samu");
        System.out.println(mapIs);
        //add new value 
        mapIs.put(3, "newValue");
        System.out.println(mapIs);
    }
}
