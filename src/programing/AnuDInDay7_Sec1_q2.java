package programing;

import java.util.Stack;

public class AnuDInDay7_Sec1_q2 {
    public static void main(String[] args) {
        Stack<Integer> stackIs=new Stack<>();
        // add element 
        for(int i=0;i<=10;i++){
            stackIs.add(i);
        }
        //printing 
        System.out.println(stackIs);

        // removinf 
        for(int i=0;i<=4;i++){
            stackIs.pop();
        }
        // printing 
        System.out.println(stackIs);
    }
}
