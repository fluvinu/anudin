package programing;

import java.util.HashMap;

public class AnudinDay8_q2 {
    public static void main(String[] args) {
        HashMap<Integer,String> mapIs=new HashMap<>();

        if(mapIs.isEmpty()){
            System.out.println("map is empty");
        }else{
            System.out.println("map is not empity");
        }
        System.out.println(mapIs);
        // ading some value 
        System.out.println("adding some value...");
        mapIs.put(1, "hello");
        mapIs.put(2, "hello2");

        if(mapIs.isEmpty()){
            System.out.println("mapm is empity ");
        }else{
            System.out.println("it is not empity ");
        }
        System.out.println(mapIs);
    }
}
