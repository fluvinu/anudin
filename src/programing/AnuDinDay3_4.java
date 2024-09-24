package programing;

import java.util.Arrays;

public class AnuDinDay3_4 {
    int [] arr={2,4,5,3,6,5,3,5,6,3};
    public static void main(String[] args) {
        AnuDinDay3_4 anu1=new AnuDinDay3_4();
        Arrays.sort(anu1.arr);
        int [] suArr=Arrays.copyOfRange(anu1.arr, 2, 7);
        int higest=suArr[suArr.length-1];
        System.out.println("origanl arrray "+Arrays.toString(anu1.arr));
        System.out.println("subArry arrray "+Arrays.toString(suArr));

        System.out.println("highest no is "+higest);
        for(int i=suArr.length-1;i>0;i--){
            if(suArr[i]<higest){
                System.out.println("second highest is "+suArr[i]);
                break;
            }
        }

    }
}
