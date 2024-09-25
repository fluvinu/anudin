package CollectionFremWork.Mapinterfacese;

import java.util.HashMap;

class Employee{
    String name ;

    Employee(String name){
        this.name=name;
    }
}


public class hashmap {
    Employee e1;

    Employee e2=null;
    public static void main(String[] args) {
        HashMap<Integer, String> hs = new HashMap<>();
		
		hs.put(1, "Ama");
		hs.put(2, "John");
		hs.put(6, "Ama");
		hs.put(92, "Lisa");
		hs.put(45, "Bella");
		hs.put(null, "Max");
		
		System.out.println(hs);
		
		System.out.println(hs.get(2));
		System.out.println(hs.get(3));
		
		hs.remove(6);
		hs.put(23, null);
		System.out.println(hs);
        System.out.println(hs.isEmpty());
		System.out.println(hs.containsKey(null));
		System.out.println(hs.containsValue("Lisa"));
		System.out.println(hs.containsValue(null));
		System.out.println(hs.size());
	}

    }
