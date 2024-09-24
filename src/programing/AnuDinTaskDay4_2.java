package programing;

import java.lang.reflect.Array;

public class AnuDinTaskDay4_2 {
    // find all the unique charter of string
    public static void main(String[] args) {
        String str = "Hello, World! how are you today?";
        System.out.println("Unique characters of the string are: ");

        // if we use capital and small unique ididfy then plece commit this line 13
        
        // str=str.toLowerCase();

        int [] arr= new  int[256];

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c!=' '){
                arr[c]++;
            }
        }

        for (int i=0;i<arr.length;i++) {
            if(arr[i]==1){
                System.out.print((char)i+" ");
            }
        }

        
    }
}
